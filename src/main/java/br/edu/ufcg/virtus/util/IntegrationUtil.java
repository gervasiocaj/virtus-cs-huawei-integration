package br.edu.ufcg.virtus.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class IntegrationUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(IntegrationUtil.class);

    public static String getRequestForJsonWithToken (String authToken, String connectionUrl) throws IOException {

        LOGGER.debug("Starting a GET request to {}", connectionUrl);

        HttpClient client = HttpClientBuilder.create().build();

        HttpUriRequest request = RequestBuilder.get()
                .setUri(connectionUrl)
                .setHeader("x-auth-token", authToken)
                .build();

        HttpResponse response = client.execute(request);

        if(response.getStatusLine().getStatusCode() == 200) {
            LOGGER.debug("Request was sucessfully");
        }

        return EntityUtils.toString(response.getEntity());
    }

}
