package com.njxxx.controller;

import com.njxxx.sercvices.NormalService;
import com.njxxx.sercvices.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 10195 on 2017/7/17.
 */
@Controller
@EnableAutoConfiguration
public class InitAction {
    @Autowired
    private PageService pageService;
    @Autowired
    private NormalService normalService;

    @InitBinder
    private void dateBind(ServletRequestDataBinder binder){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        df.setLenient(true);
        binder.registerCustomEditor(Date.class,new CustomDateEditor(df,true));
    }
    @RequestMapping("/init.do")
    public String init(@RequestParam(defaultValue = "1",required = false)int cp,
                       @RequestParam(defaultValue = "-1",required = false)int districtid,
                       HttpServletRequest request){
        pageService.setCurrentPage(cp);
        pageService.setDistrictid(districtid);
        request.setAttribute("pb",pageService.findBean());
        return "index";
    }
}
