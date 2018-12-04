package br.edu.ufcg.virtus.beans;

public class LoginBean {

    private String login;
    private String token;
    private UserBean user;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "login='" + login + '\'' +
                ", token='" + token + '\'' +
                ", user=" + user +
                '}';
    }
}
