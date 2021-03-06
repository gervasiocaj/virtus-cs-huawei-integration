package br.edu.ufcg.virtus.lists;

import br.edu.ufcg.virtus.beans.SiteBean;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

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
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}
