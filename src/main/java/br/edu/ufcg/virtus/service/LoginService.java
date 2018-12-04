package br.edu.ufcg.virtus.service;

import br.edu.ufcg.virtus.beans.LoginBean;

import java.net.URI;

public interface LoginService {

    LoginBean doLogin(URI uri, String login, String password, int userType);
}
