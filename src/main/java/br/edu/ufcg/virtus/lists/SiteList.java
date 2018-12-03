package br.edu.ufcg.virtus.lists;

import br.edu.ufcg.virtus.beans.SiteBean;

import java.util.List;

public class SiteList {

    private List<SiteBean> sites;

    public List<SiteBean> getSites() {
        return sites;
    }

    public void setSites(List<SiteBean> sites) {
        this.sites = sites;
    }

    @Override
    public String toString() {
        return "SiteList{" +
                "sites=" + sites +
                '}';
    }
}
