package com.hexin.timeline.service.impl;

import com.hexin.base.service.impl.BaseServiceImpl;
import com.hexin.timeline.domain.TimeLine;
import com.hexin.timeline.repository.TimeLineDao;
import com.hexin.timeline.service.TimeLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @param
 * @return
 * @description 时间线业务相关
 * @author: xiaoying@hexindai.com V1.0 2017/11/30 15:03
 */

@Service
public class TimeLineServiceImpl extends BaseServiceImpl<TimeLine> implements TimeLineService {

    @Autowired
    private TimeLineDao timeLineDao;

    /**
     * @param
     * @return
     * @description * <p>注入泛型类型</p>
     * @author: xiaoying@hexindai.com V1.0 2017/10/13 10:34
     */
    @Resource(name = "timeLineDao")
    public void setTestBaseDao(TimeLineDao timeLineDao) {
        super.setDao(timeLineDao);
        this.timeLineDao = timeLineDao;
    }
}
