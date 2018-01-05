package com.hexin.page;

import java.util.List;

/**
 * @param
 * @return
 * @description 根据layui组件进行封装页面返回数据
 * @author: xiaoying@hexindai.com V1.0 2017/11/30 11:32
 */
public class PageData {

    int code = 0;

    String msg = "";

    long count = 0;

    Object data = "";

    public PageData() {
        this.code = 0;
        this.msg = "";
        this.count = 0;
        this.data = "";
    }

    public PageData(int code, String msg, int count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @param
     * @return
     * @description 通过list返回pageList
     * @author: xiaoying@hexindai.com V1.0 2017/11/30 12:04
     */
    public static PageData getDataList(List<?> list, long total) {
        PageData pageData = new PageData();
        pageData.setCount(total);
        pageData.setData(list);
        return pageData;
    }

    @Override
    public String toString() {
        return "this.code => " + this.code + ",this.count =>" + this.count + ",this.data =>" + this.data + ",this.msg =>" + this.msg;
    }
}
