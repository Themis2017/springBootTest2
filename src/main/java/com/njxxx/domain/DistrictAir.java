package com.njxxx.domain;

import java.util.Date;

/**
 * Created by 10195 on 2017/7/16.
 */
public class DistrictAir {
    private int districtid;
    private String districtname;
    private int airid;
    private Date monitortime;
    private int pm_10;
    private int pm_25;
    private String station;
    private Date lastmodify;

    public int getDistrictid() {
        return districtid;
    }

    public void setDistrictid(int districtid) {
        this.districtid = districtid;
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }

    public int getAirid() {
        return airid;
    }

    public void setAirid(int airid) {
        this.airid = airid;
    }

    public Date getMonitortime() {
        return monitortime;
    }

    public void setMonitortime(Date monitortime) {
        this.monitortime = monitortime;
    }

    public int getPm_10() {
        return pm_10;
    }

    public void setPm_10(int pm_10) {
        this.pm_10 = pm_10;
    }

    public int getPm_25() {
        return pm_25;
    }

    public void setPm_25(int pm_25) {
        this.pm_25 = pm_25;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Date getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Date lastmodify) {
        this.lastmodify = lastmodify;
    }
}
