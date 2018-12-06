package br.edu.ufcg.virtus;

import br.edu.ufcg.virtus.beans.HostStatisticsBean;
import br.edu.ufcg.virtus.beans.LoginBean;
import br.edu.ufcg.virtus.beans.SiteBean;
import br.edu.ufcg.virtus.lists.ClusterList;
import br.edu.ufcg.virtus.lists.HostList;
import br.edu.ufcg.virtus.lists.SiteList;
import br.edu.ufcg.virtus.lists.VmList;
import br.edu.ufcg.virtus.service.impl.LoginServiceImpl;
import br.edu.ufcg.virtus.service.impl.SiteServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;

/**
 * Initial class
 * @author jotajr
 *
 */
public class MainClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainClass.class);

    private static final URI _URI = URI.create("http://10.75.228.200:7070");
    private static final String LOGIN = "admin";
    private static final String PASSWORD = "Fscloud@2018";
    private static final int USER_TYPE = 0;

    public static void main( String[] args )
    {
        LoginServiceImpl loginService = new LoginServiceImpl();

        LoginBean loginBean = loginService.doLogin(_URI, LOGIN, PASSWORD, USER_TYPE);

        LOGGER.debug("LOGIN BEAN RECOVERED");
        LOGGER.debug(loginBean.toString());

        SiteServiceImpl siteService = new SiteServiceImpl();

        SiteList siteList = siteService.getSiteList(_URI, loginBean.getToken());

        LOGGER.debug("SITE LIST RECOVERED");
        LOGGER.debug(siteList.toString());

        System.out.println();

        if (!siteList.getSites().isEmpty()) {

            SiteBean siteTest = siteList.getSites().get(0);

            HostList hostList = siteService.getHostList(_URI, loginBean.getToken(), siteTest);
            LOGGER.debug("HOST LIST RECOVERED FOR SITE {}", siteTest.getName());
            LOGGER.debug(hostList.toString());

            VmList vmList = siteService.getVmsLis(_URI, loginBean.getToken(), siteTest);
            LOGGER.debug("VMS LIST RECOVERED FOR SITE {}", siteTest.getName());
            LOGGER.debug(vmList.toString());

            ClusterList clusterList = siteService.getClustersList(_URI, loginBean.getToken(), siteTest);
            LOGGER.debug("CLUSTER LIST RECOVERED FOR SITE {}", siteTest.getName());
            LOGGER.debug(clusterList.toString());

            HostStatisticsBean hostStatisticsBean = siteService.getSiteHostsStatistics(_URI, loginBean.getToken(), siteTest);
            LOGGER.debug("HOST STATISTICS RECOVERED FOR SITE {}", siteTest.getName());
            LOGGER.debug(hostStatisticsBean.toString());
        }
    }
}
