package br.edu.ufcg.virtus.beans;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class HostBean {

    private String description;
    private String clusterName;
    private String uri;
    private String ip;
    private String status;
    private String bmcIp;
    private String bmcUserName;
    private String clusterUrn;
    private String computeResourceStatics;
    private String cpuMHz;
    private int cpuQuantity;
    private String hostMultiPathMode;
    private boolean isMaintaining;
    private int memQuantityMB;
    private String multiPathMode;
    private int nicQuantity;
    private String urn;
    private String attachedISOVM;
    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBmcIp() {
        return bmcIp;
    }

    public void setBmcIp(String bmcIp) {
        this.bmcIp = bmcIp;
    }

    public String getBmcUserName() {
        return bmcUserName;
    }

    public void setBmcUserName(String bmcUserName) {
        this.bmcUserName = bmcUserName;
    }

    public String getClusterUrn() {
        return clusterUrn;
    }

    public void setClusterUrn(String clusterUrn) {
        this.clusterUrn = clusterUrn;
    }

    public String getComputeResourceStatics() {
        return computeResourceStatics;
    }

    public void setComputeResourceStatics(String computeResourceStatics) {
        this.computeResourceStatics = computeResourceStatics;
    }

    public String getCpuMHz() {
        return cpuMHz;
    }

    public void setCpuMHz(String cpuMHz) {
        this.cpuMHz = cpuMHz;
    }

    public int getCpuQuantity() {
        return cpuQuantity;
    }

    public void setCpuQuantity(int cpuQuantity) {
        this.cpuQuantity = cpuQuantity;
    }

    public String getHostMultiPathMode() {
        return hostMultiPathMode;
    }

    public void setHostMultiPathMode(String hostMultiPathMode) {
        this.hostMultiPathMode = hostMultiPathMode;
    }

    public boolean isMaintaining() {
        return isMaintaining;
    }

    public void setMaintaining(boolean maintaining) {
        isMaintaining = maintaining;
    }

    public int getMemQuantityMB() {
        return memQuantityMB;
    }

    public void setMemQuantityMB(int memQuantityMB) {
        this.memQuantityMB = memQuantityMB;
    }

    public String getMultiPathMode() {
        return multiPathMode;
    }

    public void setMultiPathMode(String multiPathMode) {
        this.multiPathMode = multiPathMode;
    }

    public int getNicQuantity() {
        return nicQuantity;
    }

    public void setNicQuantity(int nicQuantity) {
        this.nicQuantity = nicQuantity;
    }

    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getAttachedISOVM() {
        return attachedISOVM;
    }

    public void setAttachedISOVM(String attachedISOVM) {
        this.attachedISOVM = attachedISOVM;
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
