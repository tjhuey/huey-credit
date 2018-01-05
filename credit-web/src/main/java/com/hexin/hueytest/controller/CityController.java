package com.hexin.hueytest.controller;

import com.hexin.hueytest.domain.City;
import com.hexin.hueytest.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 * <p>
 * Created by bysocket on 07/02/2017.
 */
@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public String findOneCity(Model model, @PathVariable("id") Long id) {
        model.addAttribute("city", cityService.findCityById(id));
        return "city/city";
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public String findAllCity(Model model) {
        List<City> cityList = cityService.findAllCity();
        model.addAttribute("cityList",cityList);
        return "city/cityList";
    }

    @RequestMapping(value = "/api/layui", method = RequestMethod.GET)
    public String testLayUI(Model model) {
        List<City> cityList = cityService.findAllCity();
        model.addAttribute("layui",cityList);
        return "layui/layuitest";
    }


    @RequestMapping(value = "/behind2", method = RequestMethod.GET)
    public String testbehind2(Model model) {
        List<City> cityList = cityService.findAllCity();
        model.addAttribute("layui",cityList);
        return "common/indexbehind";
    }

    @RequestMapping(value = "/behind", method = RequestMethod.GET)
    public String testbehind(Model model) {
        List<City> cityList = cityService.findAllCity();
        model.addAttribute("layui",cityList);
        return "common/behind";
    }
    @RequestMapping(value = "/header", method = RequestMethod.GET)
    public String testleft(Model model) {
        List<City> cityList = cityService.findAllCity();
        model.addAttribute("layui",cityList);
        return "include/header";
    }
}
