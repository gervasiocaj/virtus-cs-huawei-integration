package br.edu.ufcg.virtus.service;

import br.edu.ufcg.virtus.beans.LoginBean;

public interface LoginService {

    LoginBean doLogin(String url, int port, String login, String password, int userType);
}
