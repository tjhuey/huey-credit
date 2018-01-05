package com.hexin.utils;

import java.util.UUID;

public class GetNumberUtil {

	public static String uuidNumber() {
		UUID uuid = UUID.randomUUID();
		String uuidStr = uuid.toString();
		String[] splits = uuidStr.split("-");
		String number = "";
		for (String string : splits) {
			number += string;
		}
		return number;
	}
}
