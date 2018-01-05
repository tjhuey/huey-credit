package com.hexin.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericsUtils {
	private static final Log log = LogFactory.getLog(GenericsUtils.class);

	private GenericsUtils() {
	}

	public static Class getSuperClassGenricType(Class clazz) {
		return getInheritChainGenricType(clazz);
		
	}
	
	
	/**
	 * 获取继承链中泛型(父类没有，索引父类的父类，顶多线上索引4层)
	 * @param clazz
	 * @return
	 */
	public static Class getInheritChainGenricType(Class clazz){
		
		Class super1Clazz = getSuperClassGenricType(clazz,0);
		
		if(super1Clazz == null){
			Class super1 = clazz.getSuperclass();
			Class super2Clazz = getSuperClassGenricType(super1,0);
			if(super2Clazz == null){
				Class super2 = super1.getSuperclass();
				Class super3Clazz = getSuperClassGenricType(super2,0);
				if(super3Clazz == null){
					
					Class super3 = super2.getSuperclass();
					Class super4Clazz = getSuperClassGenricType(super3,0);
					if(super4Clazz == null){
						return null;
					}else {
						return super4Clazz;
					}
				}else {
					return super3Clazz;
				}
			}else {
				return super2Clazz;
			}
		}
		
		return super1Clazz;
	}
	
	
	/**
	 * 超早某个类的父类的泛型
	 * @param clazz
	 * @param index
	 * @return
	 */
	public static Class getSuperClassGenricType(Class clazz, int index) {
		Type genType = clazz.getGenericSuperclass();
		if (!(genType instanceof ParameterizedType)) {
			return null;
		}
		
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		if (index >= params.length || index < 0) {
			log.warn("Index: " + index + ", Size of " + clazz.getSimpleName() + "'s Parameterized Type: " + params.length);
			return Object.class;
		}
		if (!(params[index] instanceof Class)) {
			log.warn(clazz.getSimpleName() + " not set the actual class on superclass generic parameter");
			return Object.class;
		}
		return (Class) params[index];
	}
}
