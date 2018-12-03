package br.edu.ufcg.virtus.beans;

public class LoginBean {

    private String user;
    private String token;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "user='" + user + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
