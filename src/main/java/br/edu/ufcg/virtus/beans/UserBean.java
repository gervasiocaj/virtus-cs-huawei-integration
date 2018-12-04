package br.edu.ufcg.virtus.beans;

import java.util.List;

public class UserBean {

    private long validity;
    private String userName;
    private List<String> roleList;
    private String userId;
    private List<String> privilegeIds;

    public long getValidity() {
        return validity;
    }

    public void setValidity(long validity) {
        this.validity = validity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<String> roleList) {
        this.roleList = roleList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getPrivilegeIds() {
        return privilegeIds;
    }

    public void setPrivilegeIds(List<String> privilegeIds) {
        this.privilegeIds = privilegeIds;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "validity=" + validity +
                ", userName='" + userName + '\'' +
                ", roleList=" + roleList +
                ", userId='" + userId + '\'' +
                ", privilegeIds=" + privilegeIds +
                '}';
    }
}
