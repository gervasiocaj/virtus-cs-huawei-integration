package br.edu.ufcg.virtus.service;

import br.edu.ufcg.virtus.lists.SiteList;

import java.net.URI;

public interface SiteService {

    SiteList getSiteList(URI uri, String authToken);

}
