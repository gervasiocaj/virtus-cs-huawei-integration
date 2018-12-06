package br.edu.ufcg.virtus.lists;

import br.edu.ufcg.virtus.beans.HostBean;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

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
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}
