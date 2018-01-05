package com.hexin.utils;

import java.util.UUID;

/**
 * <p>
 * Description: Uuid的转换
 * </p>
 * Path: org.tjhuey.common.utils
 * <p>
 * Title: UUIDUtil.java
 * </p>
 * Company: resource.huey.org>
 * 
 * @author huey
 * @date 2017年3月31日
 * @version 1.0
 */
public class UUIDUtil {

	public static String getUUID() {
		UUID randomUUID = UUID.randomUUID();
		String uuidStr = randomUUID.toString();
		uuidStr.replaceAll("-", "");
		return uuidStr;
	}
}
