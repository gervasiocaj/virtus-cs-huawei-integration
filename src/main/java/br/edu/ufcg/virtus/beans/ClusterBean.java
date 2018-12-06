package br.edu.ufcg.virtus.beans;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * "clusters": [
 *         {
 *             "description": null,
 *             "uri": "/service/sites/4413070B/clusters/106",
 *             "urn": "urn:sites:4413070B:clusters:106",
 *             "name": "MigEvals"
 *         }
 *     ]
 */

public class ClusterBean {

    public String description;
    public String uri;
    public String urn;
    public String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}
