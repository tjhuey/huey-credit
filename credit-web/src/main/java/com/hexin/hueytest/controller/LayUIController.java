package com.hexin.hueytest.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hexin.base.controller.BaseController;
import com.hexin.hueytest.domain.City;
import com.hexin.hueytest.service.CityService;
import com.hexin.page.PageData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @param
 * @return
 * @description 测试layui组件相关
 * @author: xiaoying@hexindai.com V1.0 2017/11/30 11:14
 */

@RequestMapping("layui")
@Controller
public class LayUIController extends BaseController{

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/testPage", method = RequestMethod.GET)
    public String testPage(HttpServletRequest request) {
        logger.info(request.toString());
        return "layui/testPage";
    }

    @RequestMapping(value = "/testForm", method = RequestMethod.
            GET)
    public String testForm(HttpServletRequest request) {
        logger.info(request.toString());
        return "layui/testForm";
    }

    @ResponseBody
    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    public PageData pageList(@RequestParam(required = true, defaultValue = "1") Integer page,
                             @RequestParam(required = true, defaultValue = "10") Integer limit) {

        Page<Object> startPage = PageHelper.startPage(page, limit);
        List<City> list = cityService.findAllCity();
        PageData pageData = PageData.getDataList(list, startPage.getTotal());
        return pageData;
    }

    @RequestMapping("toLeft")
    public String leftTest(){
        return "include/left";
    }

}
