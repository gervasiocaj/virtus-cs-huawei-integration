package br.edu.ufcg.virtus.service.impl;

import br.edu.ufcg.virtus.lists.SiteList;
import br.edu.ufcg.virtus.service.SiteService;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class SiteServiceImpl implements SiteService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SiteServiceImpl.class);

    public SiteList getSiteList(String authToken, String url, int port) {

        SiteList list = new SiteList();

        String connectionUrl = url;

        if(port != 80) {
            connectionUrl += ":" + port;
        }

        connectionUrl += "/service/sites";

        HttpClient client = HttpClientBuilder.create().build();

        LOGGER.debug( "Searching for a list of sites in {}", connectionUrl);

        HttpUriRequest request = RequestBuilder.get()
                .setUri(connectionUrl)
                .setHeader("x-auth-token", authToken)
                .build();

        HttpResponse response = null;
        try {
            response = client.execute(request);
            if(response.getStatusLine().getStatusCode() == 200) {
                LOGGER.debug("Site list request was sucessfully");
            }

            String body = EntityUtils.toString(response.getEntity());

            Gson gson = new Gson();

            list = gson.fromJson(body, SiteList.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;

    }

}
