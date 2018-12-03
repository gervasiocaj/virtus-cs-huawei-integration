package br.edu.ufcg.virtus;

import br.edu.ufcg.virtus.beans.LoginBean;
import br.edu.ufcg.virtus.beans.SiteBean;
import br.edu.ufcg.virtus.lists.SiteList;
import br.edu.ufcg.virtus.service.impl.LoginServiceImpl;
import br.edu.ufcg.virtus.service.impl.SiteServiceImpl;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * Initial class
 * @author jotajr
 *
 */
public class MainClass {

    private static final Logger logger = LoggerFactory.getLogger(MainClass.class);

    public static void main( String[] args )
    {
        LoginServiceImpl loginService = new LoginServiceImpl();
        LoginBean loginBean = loginService.doLogin("http://10.75.228.108",
                7070, "admin", "649b1c8cacbd9cb8b12845d5e887a9c35a9d492d1e087d9d3a3c383f70d1997d", 0);

        System.out.println(loginBean);

        SiteServiceImpl siteService = new SiteServiceImpl();

        siteService.getSiteList(loginBean.getToken(), "http://10.75.228.108",
                7070);

    }
}
