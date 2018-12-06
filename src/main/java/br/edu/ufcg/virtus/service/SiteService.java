package br.edu.ufcg.virtus.service;

import br.edu.ufcg.virtus.beans.HostStatisticsBean;
import br.edu.ufcg.virtus.beans.SiteBean;
import br.edu.ufcg.virtus.lists.ClusterList;
import br.edu.ufcg.virtus.lists.HostList;
import br.edu.ufcg.virtus.lists.SiteList;
import br.edu.ufcg.virtus.lists.VmList;

import java.net.URI;

public interface SiteService {

    SiteList getSiteList(URI uri, String authToken);
    HostList getHostList(URI uri, String authToken, SiteBean site);
    VmList getVmsLis(URI uri, String authToken, SiteBean site);
    ClusterList getClustersList(URI uri, String authToken, SiteBean site);
    HostStatisticsBean getSiteHostsStatistics(URI uri, String authToken, SiteBean site);

}
