package br.edu.ufcg.virtus.beans;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * {
 *     "total": 2,
 *     "initial": 0,
 *     "booting": 0,
 *     "poweroff": 0,
 *     "rebooting": 0,
 *     "normal": 0,
 *     "shutdowning": 0,
 *     "unknown": 0,
 *     "fault": 2
 * }
 */

public class HostStatisticsBean {

    private int total;
    private int initial;
    private int booting;
    private int poweroff;
    private int rebooting;
    private int normal;
    private int shutdowning;
    private int unknown;
    private int fault;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getInitial() {
        return initial;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public int getBooting() {
        return booting;
    }

    public void setBooting(int booting) {
        this.booting = booting;
    }

    public int getPoweroff() {
        return poweroff;
    }

    public void setPoweroff(int poweroff) {
        this.poweroff = poweroff;
    }

    public int getRebooting() {
        return rebooting;
    }

    public void setRebooting(int rebooting) {
        this.rebooting = rebooting;
    }

    public int getNormal() {
        return normal;
    }

    public void setNormal(int normal) {
        this.normal = normal;
    }

    public int getShutdowning() {
        return shutdowning;
    }

    public void setShutdowning(int shutdowning) {
        this.shutdowning = shutdowning;
    }

    public int getUnknown() {
        return unknown;
    }

    public void setUnknown(int unknown) {
        this.unknown = unknown;
    }

    public int getFault() {
        return fault;
    }

    public void setFault(int fault) {
        this.fault = fault;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}
