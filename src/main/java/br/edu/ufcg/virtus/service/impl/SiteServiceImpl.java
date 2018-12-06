package br.edu.ufcg.virtus.service.impl;

import br.edu.ufcg.virtus.beans.HostStatisticsBean;
import br.edu.ufcg.virtus.beans.SiteBean;
import br.edu.ufcg.virtus.lists.ClusterList;
import br.edu.ufcg.virtus.lists.HostList;
import br.edu.ufcg.virtus.lists.SiteList;
import br.edu.ufcg.virtus.lists.VmList;
import br.edu.ufcg.virtus.service.SiteService;
import br.edu.ufcg.virtus.util.IntegrationUtil;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;

public class SiteServiceImpl implements SiteService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SiteServiceImpl.class);

    public SiteList getSiteList(URI uri, String authToken) {

        SiteList list = new SiteList();

        String connectionUrl = IntegrationUtil.buildUrl(uri, "/service/sites");

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

    public HostList getHostList(URI uri, String authToken, SiteBean site) {

        HostList list = new HostList();

        String connectionUrl = IntegrationUtil.buildUrl(uri, site.getUri() + "/hosts");

        LOGGER.debug("Searching for a list of host of site {} in {}", site.getName(), connectionUrl);

        Gson gson = new Gson();

        try {
            list = gson.fromJson(IntegrationUtil.getRequestForJsonWithToken(authToken, connectionUrl), HostList.class);
        } catch (IOException e) {
            LOGGER.error("Fail to get the list of hosts. Error: {}", e.getLocalizedMessage());
        }

        return list;
    }

    public VmList getVmsLis(URI uri, String authToken, SiteBean site) {

        VmList list = new VmList();

        String connectionUrl = IntegrationUtil.buildUrl(uri, site.getUri() + "/vms");

        LOGGER.debug("Searching for a list of vms of site {} in {}", site.getName(), connectionUrl);

        Gson gson = new Gson();

        try {
            list = gson.fromJson(IntegrationUtil.getRequestForJsonWithToken(authToken, connectionUrl), VmList.class);
        } catch (IOException e) {
            LOGGER.error("Fail to get the list of vms. Error: {}", e.getLocalizedMessage());
        }

        return list;

    }

    public ClusterList getClustersList(URI uri, String authToken, SiteBean site) {

        ClusterList list = new ClusterList();

        String connectionUrl = IntegrationUtil.buildUrl(uri, site.getUri() + "/clusters");

        LOGGER.debug("Searching for a list of clusters of site {} in {}", site.getName(), connectionUrl);

        Gson gson = new Gson();

        try {
            list = gson.fromJson(IntegrationUtil.getRequestForJsonWithToken(authToken, connectionUrl), ClusterList.class);
        } catch (IOException e) {
            LOGGER.error("Fail to get the list of clusters. Error: {}", e.getLocalizedMessage());
        }

        return list;

    }

    public HostStatisticsBean getSiteHostsStatistics(URI uri, String authToken, SiteBean site) {

        HostStatisticsBean hostStatisticsBean = new HostStatisticsBean();

        String connectionUrl = IntegrationUtil.buildUrl(uri, site.getUri() + "/hosts/statistics");

        LOGGER.debug("Searching for statistics of hosts of site {} in {}", site.getName(), connectionUrl);

        Gson gson = new Gson();

        try {
            hostStatisticsBean = gson.fromJson(IntegrationUtil.getRequestForJsonWithToken(authToken, connectionUrl), HostStatisticsBean.class);
        } catch (IOException e) {
            LOGGER.error("Fail to get the statistics for site. Error: {}", e.getLocalizedMessage());
        }

        return hostStatisticsBean;

    }

}
