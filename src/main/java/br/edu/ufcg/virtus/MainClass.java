package br.edu.ufcg.virtus;

import br.edu.ufcg.virtus.beans.LoginBean;
import br.edu.ufcg.virtus.lists.HostList;
import br.edu.ufcg.virtus.lists.SiteList;
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
            HostList hostList = siteService.getHostList(_URI, loginBean.getToken(), siteList.getSites().get(0));
            LOGGER.debug("HOST LIST RECOVERED FOR SITE {}", siteList.getSites().get(0).getName());
            LOGGER.debug(hostList.toString());
        }
    }
}
