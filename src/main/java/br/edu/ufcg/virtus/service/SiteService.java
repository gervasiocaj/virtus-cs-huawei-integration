package br.edu.ufcg.virtus.service;

import br.edu.ufcg.virtus.lists.SiteList;

public interface SiteService {

    SiteList getSiteList(String authToken, String url, int port);

}
