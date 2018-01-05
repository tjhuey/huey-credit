package com.hexin.timeline.controller;

import com.hexin.timeline.domain.TimeLine;
import com.hexin.timeline.service.TimeLineService;
import com.hexin.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @param
 * @return
 * @description 时间线控制层
 * @author: xiaoying@hexindai.com V1.0 2017/11/30 15:14
 */
@RequestMapping("timeLine")
@Controller
public class TimeLineController {

    @Autowired
    private TimeLineService timeLineService;

    /**
     * @param
     * @return
     * @description 获取时间线记录
     * @author: xiaoying@hexindai.com V1.0 2017/11/30 16:01
     */
    @RequestMapping(value = "/timeLineList", method = RequestMethod.GET)
    public String timeLineList(Model model) {
        List<TimeLine> list = timeLineService.findAll();
        model.addAttribute("list", list);
        return "timeline/timelinelist";
    }

    @RequestMapping(value = "/toAddTimeLine", method = RequestMethod.GET)
    public String toAddTimeLine() {
        return "timeline/addTimeLine";
    }

    @ResponseBody
    @RequestMapping(value = "/addTimeLine")
    public String addTimeLine(@RequestParam(required = false, defaultValue = "") String createTime, @RequestParam(required = false, defaultValue = "") String content) throws Exception {
        TimeLine timeLine = new TimeLine();
        timeLine.setCreateTime(DateUtil.strToDate(createTime, "yyyy-MM-dd hh:mm:ss"));
        timeLine.setContent(content);
        timeLineService.insert(timeLine);
        return "success";
    }


}
