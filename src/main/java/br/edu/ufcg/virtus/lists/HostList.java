package br.edu.ufcg.virtus.lists;

import br.edu.ufcg.virtus.beans.HostBean;

import java.util.List;

public class HostList {

    private int total;
    private List<HostBean> hosts;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<HostBean> getHosts() {
        return hosts;
    }

    public void setHosts(List<HostBean> hosts) {
        this.hosts = hosts;
    }

    @Override
    public String toString() {
        return "HostList{" +
                "total=" + total +
                ", hosts=" + hosts +
                '}';
    }
}
