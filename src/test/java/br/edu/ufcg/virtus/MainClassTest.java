package br.edu.ufcg.virtus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import br.edu.ufcg.virtus.beans.LoginBean;
import br.edu.ufcg.virtus.lists.SiteList;
import br.edu.ufcg.virtus.service.LoginService;
import br.edu.ufcg.virtus.service.SiteService;
import br.edu.ufcg.virtus.service.impl.LoginServiceImpl;
import br.edu.ufcg.virtus.service.impl.SiteServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

/**
 * Unit test for simple MainClass.
 */
public class MainClassTest
{

    private LoginService loginService;
    private SiteService siteService;

    @Before
    public void setUp() throws Exception {
        loginService = new LoginServiceImpl();
        siteService = new SiteServiceImpl();
    }

    @Test
    public void shouldLoginSuccessfully()
    {
        URI _URI = URI.create("http://10.75.228.200:7070");
        String LOGIN = "admin";
        String PASSWORD = "Fscloud@2018";
        int USER_TYPE = 0;

        LoginBean loginBean = loginService.doLogin(_URI, LOGIN, PASSWORD, USER_TYPE);
        assertEquals(LOGIN, loginBean.getLogin());
        assertEquals(LOGIN, loginBean.getUser().getUserName());
        assertEquals(600000, loginBean.getUser().getValidity());
    }

    @Test
    public void shouldListSites()
    {
        URI _URI = URI.create("http://10.75.228.200:7070");
        String LOGIN = "admin";
        String PASSWORD = "Fscloud@2018";
        int USER_TYPE = 0;

        LoginBean loginBean = loginService.doLogin(_URI, LOGIN, PASSWORD, USER_TYPE);
        SiteList siteList = siteService.getSiteList(_URI, loginBean.getToken());
        assertEquals(1, siteList.getSites().size());
        assertEquals("urn:sites:41010720", siteList.getSites().get(0).getUrn());
    }


}
