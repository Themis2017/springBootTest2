package com.njxxx.sercvices;

import com.njxxx.dao.DistrictAirDAO;
import com.njxxx.domain.DistrictAir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 10195 on 2017/7/16.
 */
@Service
public class PageService {
    @Autowired
    private DistrictAirDAO districtAirDAO;
   private int districtid = -1;
    private int currentPage = 1;
    private int pageSize = 3;

    private int countPage = 0;
    private int prev = 0;
    private int next = 0;
    private List<DistrictAir> typeDatas = new ArrayList<DistrictAir>(0);
    private List<DistrictAir> datas = new ArrayList<DistrictAir>(0);
    public PageService findBean(){
        Map pageKit = new HashMap();
        pageKit.put("pageSize",pageSize);
        pageKit.put("currentPage",currentPage);
        pageKit.put("districtid",districtid);
        countPage = districtAirDAO.findCountPage(pageKit);
        prev = currentPage-1<=1?1:currentPage-1;
        next = currentPage+1>=countPage?countPage:currentPage+1;
        typeDatas = districtAirDAO.findAllDistrict();
        datas = districtAirDAO.findCurrentPageData(pageKit);
        return this;
    }

    public int getDistrictid() {
        return districtid;
    }

    public void setDistrictid(int districtid) {
        this.districtid = districtid;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public int getPrev() {
        return prev;
    }

    public void setPrev(int prev) {
        this.prev = prev;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public List<DistrictAir> getTypeDatas() {
        return typeDatas;
    }

    public void setTypeDatas(List<DistrictAir> typeDatas) {
        this.typeDatas = typeDatas;
    }

    public List<DistrictAir> getDatas() {
        return datas;
    }

    public void setDatas(List<DistrictAir> datas) {
        this.datas = datas;
    }
}
