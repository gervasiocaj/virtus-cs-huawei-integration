package br.edu.ufcg.virtus;

import br.edu.ufcg.virtus.beans.LoginBean;
import br.edu.ufcg.virtus.lists.HostList;
import br.edu.ufcg.virtus.lists.SiteList;
import br.edu.ufcg.virtus.service.impl.LoginServiceImpl;
import br.edu.ufcg.virtus.service.impl.SiteServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Initial class
 * @author jotajr
 *
 */
public class MainClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainClass.class);

    private static final String URL = "http://10.75.228.108";
    private static final int PORT = 7070;
    private static final String LOGIN = "admin";
    private static final String PASSWORD = "649b1c8cacbd9cb8b12845d5e887a9c35a9d492d1e087d9d3a3c383f70d1997d";
    private static final int USER_TYPE = 0;

    public static void main( String[] args )
    {
        LoginServiceImpl loginService = new LoginServiceImpl();
        LoginBean loginBean = loginService.doLogin(URL, PORT, LOGIN, PASSWORD, USER_TYPE);

        LOGGER.debug("LOGIN BEAN RECOVERED");
        LOGGER.debug(loginBean.toString());

        SiteServiceImpl siteService = new SiteServiceImpl();

        SiteList siteList = siteService.getSiteList(loginBean.getToken(), URL,
                PORT);

        LOGGER.debug("SITE LIST RECOVERED");
        LOGGER.debug(siteList.toString());



        if(!siteList.getSites().isEmpty()) {
            HostList hostList = siteService.getHostList(loginBean.getToken(), URL, PORT, siteList.getSites().get(0));
            LOGGER.debug("HOST LIST RECOVERED FOR SITE {}", siteList.getSites().get(0).getName());
            LOGGER.debug(hostList.toString());
        }


    }
}
