package br.edu.ufcg.virtus;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

/**
 * Initial class
 * @author jotajr
 *
 */
public class MainClass
{
    public static void main( String[] args )
    {
        System.out.println( "Initial test" );
        String url = "http://10.75.228.108:7070/service/session";
        HttpClient client = HttpClientBuilder.create().build();
        try {
            HttpUriRequest request = RequestBuilder.post()
                    .setUri(url)
                    .setHeader("X-Auth-User", "admin")
                    .setHeader("X-Auth-Key", "")
                    .setHeader("X-Custom-Header", "custom header http request")
                    .setHeader("X-Auth-UserType", "0")
                    .setHeader("Accept-Language", "en_US")
                    .build();

            HttpResponse response = client.execute(request);
            System.out.println(response.getStatusLine().getStatusCode());

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
