package com.hexin.utils;


/**
 * <p>Description: 自定义的结果集</p>
 * Path: org.tjhuey.common.utils
 * <p>Title: ResultInfo.java</p>
 * Company: resource.huey.org>
 * @author huey
 * @date 2017年4月6日
 * @version 1.0
 */
public class ResultInfo {

	/** 
	 * 消息码。
	 * 默认：code = 0
	 * 成功：code > 0
	 * 失败：code < 1
	 */
	public int code = 0;
	
	/** 提示信息 */
	public String msg = "亲，系统繁忙！";
	
	/** 结果集中的对象 */
	public Object obj;

	@Override
	public String toString() {
		return "ResultInfo [code=" + code + ", msg=" + msg + ", object="
				+ obj + "]";
	}
	
}
