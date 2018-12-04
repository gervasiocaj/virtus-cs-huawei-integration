package br.edu.ufcg.virtus.service.impl;

import br.edu.ufcg.virtus.beans.SiteBean;
import br.edu.ufcg.virtus.lists.HostList;
import br.edu.ufcg.virtus.lists.SiteList;
import br.edu.ufcg.virtus.service.SiteService;
import br.edu.ufcg.virtus.util.IntegrationUtil;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class SiteServiceImpl implements SiteService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SiteServiceImpl.class);

    public SiteList getSiteList(String authToken, String url, int port) {

        SiteList list = new SiteList();

        String connectionUrl = url;

        if (port != 80) {
            connectionUrl += ":" + port;
        }

        connectionUrl += "/service/sites";

        LOGGER.debug("Searching for a list of sites in {}", connectionUrl);

        try {
            Gson gson = new Gson();
            list = gson.fromJson(IntegrationUtil.getRequestForJsonWithToken(authToken, connectionUrl),
                    SiteList.class);

        } catch (IOException e) {
            LOGGER.error("Fail to get the list of sites. Error: {}", e.getLocalizedMessage());
        }

        return list;

    }

    public HostList getHostList(String authToken, String url, int port, SiteBean site) {

        HostList list = new HostList();

        String connectionUrl = url;

        if (port != 80) {
            connectionUrl += ":" + port;
        }

        connectionUrl += site.getUri() + "/hosts";

        LOGGER.debug("Searching for a list of host of site {} in {}", site.getName(), connectionUrl);

        Gson gson = new Gson();

        try {
            list = gson.fromJson(IntegrationUtil.getRequestForJsonWithToken(authToken, connectionUrl), HostList.class);
        } catch (IOException e) {
            LOGGER.error("Fail to get the list of hosts. Error: {}", e.getLocalizedMessage());
        }

        return list;
    }

}
