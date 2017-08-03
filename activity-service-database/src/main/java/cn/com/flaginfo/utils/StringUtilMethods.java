package cn.com.flaginfo.utils;

import java.util.UUID;
/**
 * 业务处理相关方法
 */
public class StringUtilMethods {
	
	/**
	 * 判断一个对象或者是字符串是否为空
	 * @param obj
	 */
	public static boolean isNullOrEmpty(final Object obj) {
		boolean result = false;
		if (obj == null || "".equals(obj.toString().trim())) {
			result = true;
		}
		return result;
	}
	/**
	 * 判断一个对象是否是非空
	 * @param obj
	 * @return
	 */
	public static boolean isNotNullOrEmpty(final Object obj) {
		boolean result = true;
		if (obj == null || "".equals(obj.toString().trim())) {
			result = false;
		}
		return result;
	}
	
	/**
	 * 获取不唯一的数据主键值
	 * @return
	 */
	public static String getUUID() {
		UUID id = UUID.randomUUID();
		return id.toString();
	}
}
