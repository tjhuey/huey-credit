package com.hexin.timeline.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 描述:time_line表的实体类
 * @version
 * @author:  Administrator
 * @创建时间: 2017-11-30
 */
public class TimeLine {
    /**
     * 主键
     */
    private Integer timelineId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 内容
     */
    private String content;

    /**
     * 主键
     * @return timeline_id 主键
     */
    public Integer getTimelineId() {
        return timelineId;
    }

    /**
     * 主键
     * @param timelineId 主键
     */
    public void setTimelineId(Integer timelineId) {
        this.timelineId = timelineId;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 内容
     * @return content 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 内容
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}