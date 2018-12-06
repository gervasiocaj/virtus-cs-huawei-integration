package br.edu.ufcg.virtus.lists;

import br.edu.ufcg.virtus.beans.VmBean;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

public class VmList {

    private int total;
    private List<VmBean> vms;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<VmBean> getVms() {
        return vms;
    }

    public void setVms(List<VmBean> vms) {
        this.vms = vms;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}
