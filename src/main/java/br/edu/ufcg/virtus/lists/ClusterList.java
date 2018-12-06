package br.edu.ufcg.virtus.lists;

import br.edu.ufcg.virtus.beans.ClusterBean;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

public class ClusterList {

    private List<ClusterBean> clusters;

    public List<ClusterBean> getClusters() {
        return clusters;
    }

    public void setClusters(List<ClusterBean> clusters) {
        this.clusters = clusters;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}
