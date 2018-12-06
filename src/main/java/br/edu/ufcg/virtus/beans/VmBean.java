package br.edu.ufcg.virtus.beans;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class VmBean {

    private String description;
    private String location;
    private String group;
    private String uri;
    private String hostUrn;
    private String status;
    private String cdRomStatus;
    private boolean isLinkClone;
    private boolean isTemplate;
    private String locationName;
    private String pvDriverStatus;
    private String tollInstallStatus;
    private String clusterUrn;
    private String urn;
    private String createTime;
    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getHostUrn() {
        return hostUrn;
    }

    public void setHostUrn(String hostUrn) {
        this.hostUrn = hostUrn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCdRomStatus() {
        return cdRomStatus;
    }

    public void setCdRomStatus(String cdRomStatus) {
        this.cdRomStatus = cdRomStatus;
    }

    public boolean isLinkClone() {
        return isLinkClone;
    }

    public void setLinkClone(boolean linkClone) {
        isLinkClone = linkClone;
    }

    public boolean isTemplate() {
        return isTemplate;
    }

    public void setTemplate(boolean template) {
        isTemplate = template;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getPvDriverStatus() {
        return pvDriverStatus;
    }

    public void setPvDriverStatus(String pvDriverStatus) {
        this.pvDriverStatus = pvDriverStatus;
    }

    public String getTollInstallStatus() {
        return tollInstallStatus;
    }

    public void setTollInstallStatus(String tollInstallStatus) {
        this.tollInstallStatus = tollInstallStatus;
    }

    public String getClusterUrn() {
        return clusterUrn;
    }

    public void setClusterUrn(String clusterUrn) {
        this.clusterUrn = clusterUrn;
    }

    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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
