package com.hexin.utils;

import java.util.HashMap;
import java.util.Map;

public class PagerUtil {

	/**
	 * 全部分页工具类
	 * @param pager
	 * @return
	 */
	public static Map<String, Integer> getAllInfo(Pager pager) {
		int start = pager.getStart();
		int size = pager.getPageSize();

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", start);
		map.put("size", size);
		return map;
	}
}
