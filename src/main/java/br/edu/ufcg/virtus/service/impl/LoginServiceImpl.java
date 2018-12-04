package br.edu.ufcg.virtus.service.impl;

import br.edu.ufcg.virtus.beans.LoginBean;
import br.edu.ufcg.virtus.beans.UserBean;
import br.edu.ufcg.virtus.service.LoginService;
import com.google.gson.Gson;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class LoginServiceImpl implements LoginService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);

    public LoginBean doLogin(String url, int port, String login, String password, int userType) {

        LoginBean loginBean = new LoginBean();
        loginBean.setLogin(login);

        String connectionUrl = url;

        if(port != 80) {
            connectionUrl += ":" + port;
        }

        connectionUrl += "/service/session";

        HttpClient client = HttpClientBuilder.create().build();

        LOGGER.debug( "Doing login to user {} at {}", login, connectionUrl);

        try {
            HttpUriRequest request = RequestBuilder.post()
                    .setUri(connectionUrl)
                    .setHeader("X-Auth-User", login)
                    .setHeader("X-Auth-Key", password)
                    .setHeader("X-Custom-Header", "custom header http request")
                    .setHeader("X-Auth-UserType", String.valueOf(userType))
                    .setHeader("Accept-Language", "en_US")
                    .build();

            HttpResponse response = client.execute(request);
            if(response.getStatusLine().getStatusCode() == 200) {
                LOGGER.debug("Login successfully with user {}", login);
            }

            Header[] headers = response.getAllHeaders();

            for (Header header : headers) {
                if(header.getName().equals("X-Auth-Token")) {
                    loginBean.setToken(header.getValue());
                }
            }

            Gson gson = new Gson();

            UserBean userBean = gson.fromJson(EntityUtils.toString(response.getEntity()), UserBean.class);

            loginBean.setUser(userBean);

        } catch (ClientProtocolException e) {
            LOGGER.error("Error on client protocol: {}", e.getLocalizedMessage());
        } catch (IOException e) {
            LOGGER.error("Error on request to do login: {}", e.getLocalizedMessage());
        }

        return loginBean;

    }

}
