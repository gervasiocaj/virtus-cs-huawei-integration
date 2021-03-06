package br.edu.ufcg.virtus.beans;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SiteBean {

    private String timeZone;
    private String description;
    private String uri;
    private int ntpCycle;
    private String urn;
    private String ntpIp;
    private String name;

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

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

    public int getNtpCycle() {
        return ntpCycle;
    }

    public void setNtpCycle(int ntpCycle) {
        this.ntpCycle = ntpCycle;
    }

    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getNtpIp() {
        return ntpIp;
    }

    public void setNtpIp(String ntpIp) {
        this.ntpIp = ntpIp;
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
