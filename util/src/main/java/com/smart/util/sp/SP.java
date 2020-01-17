package com.smart.util.sp;

import android.util.Log;

import org.json.JSONArray;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SP {
	public static final int MODE_PRIVATE = 0;
	private static final String spName = "allinpay";
	private static final String onlySpName = "allinonly";
	/**
	 * 将一个String数据存入到缓存中
	 * @param keyStr 要存入缓存中的key
	 * @param valueStr 要存入缓存中的value
	 */
	public static void setStringDataIntoSP(String keyStr, String valueStr) {
		SPUtil.setStringDataIntoSP(spName, keyStr, valueStr);
	}
	
//	/**
//	 * 将一个String数组 数据存入到缓存中
//	 * @param keyStr 要存入缓存中的key
//	 * @param valueStr 要存入缓存中的value
//	 */
//	public static void setStringSetDataIntoSP(String keyStr, Set<String> valueStr) {
//		Log.i("SP", "SET = "+valueStr.toString());
//		SPUtil.setStringSetIntoSp(onlySpName, keyStr, valueStr);
//	}
	/**
	 * 将一个String数组 数据存入到缓存中
	 * @param keyStr 要存入缓存中的key
	 * @param valueStr 要存入缓存中的value
	 */
	public static void setStringArrayIntoSp(String keyStr, JSONArray valueStr){
		SPUtil.setStringDataIntoSP(spName, keyStr, valueStr.toString());
	}

	/**
	 * 将一个Boolean数据存入到缓存中
	 * @param keyStr 要存入缓存中的key
	 * @param valueStr 要存入缓存中的value
	 */
	public static void setBooleanDataIntoSP(String keyStr, Boolean valueStr) {
		SPUtil.setBooleanDataIntoSP(spName, keyStr, valueStr);
	}

	/**
	 * 将一个Int数据存入到缓存中
	 * @param keyStr 要存入缓存中的key
	 * @param valueStr 要存入缓存中的value
	 */
	public static void setIntDataIntoSP(String keyStr, int valueStr) {
		SPUtil.setIntDataIntoSP(spName, keyStr, valueStr);
	}

	/**
	 * 将一个Float数据存入到缓存中
	 * @param keyStr 要存入缓存中的key
	 * @param valueStr 要存入缓存中的value
	 */
	public static void setFloatDataIntoSP(String keyStr, Float valueStr) {
		SPUtil.setFloatDataIntoSP(spName, keyStr, valueStr);
	}

	/**
	 * 将一个Long数据存入到缓存中
	 * @param keyStr 要存入缓存中的key
	 * @param valueStr 要存入缓存中的value
	 */
	public static void setLongDataIntoSP(String keyStr, Long valueStr) {
		SPUtil.setLongDataIntoSP(spName, keyStr, valueStr);
	}

	/**
	 * 获取缓存中的一个String数据
	 * @param keyStr 已存入缓存中的key
	 * @return 缓存中对应参数key的value
	 */
	public static String getStringValueFromSP(String keyStr) {
		return getStringValueFromSP(keyStr, "");
	}

	/**
	 * 获取缓存中的一个String数据
	 * @param keyStr 已存入缓存中的key
	 * @param defaultValue 缓存中对应参数key的默认值
	 * @return 缓存中对应参数key的value
	 */
	public static String getStringValueFromSP(String keyStr, String defaultValue) {
		return SPUtil.getStringValueFromSP(spName, keyStr, defaultValue);
	}
	
//	/**
//	 * 获取缓存中的一个String数组 数据
//	 * @param keyStr 已存入缓存中的key
//	 * @return 缓存中对应参数key的value
//	 */
//	public static Set<String> getStringSetValueFromSP(String keyStr) {
//		return SPUtil.getStringSetValueFromSP(onlySpName, keyStr);
//	}
	/**
	 * 获取缓存中的jsonarray
	 * @param keyStr 已存入缓存中的key
	 * @return
	 */
	public static JSONArray getStringArrayFromSp(String keyStr){
		JSONArray array = null;
		String str = SPUtil.getStringValueFromSP(spName, keyStr);
		Log.i("SP", "JSONArray data = "+str);
		if("".equals(str))return array;
		try {
			array = new JSONArray(str);
		} catch (Exception e) {
			Log.i("SP", e.getMessage());
		}
		return array;
	}

	/**
	 * 获取缓存中的一个Float数据
	 * @param keyStr 已存入缓存中的key
	 * @return 缓存中对应参数key的value
	 */
	public static Float getFloatValueFromSP(String keyStr) {
		return getFloatValueFromSP(keyStr, 0.0f);
	}

	/**
	 * 获取缓存中的一个Float数据
	 * @param keyStr 已存入缓存中的key
	 * @param defaultValue 缓存中对应参数key的默认值
	 * @return 缓存中对应参数key的value
	 */
	public static Float getFloatValueFromSP(String keyStr, Float defaultValue) {
		return SPUtil.getFloatValueFromSP(spName, keyStr, defaultValue);
	}

	/**
	 * 获取缓存中的一个Int数据
	 * @param keyStr 已存入缓存中的key
	 * @return 缓存中对应参数key的value
	 */
	public static int getIntValueFromSP(String keyStr) {
		return getIntValueFromSP(keyStr, 0);
	}

	/**
	 * 获取缓存中的一个Int数据
	 * @param keyStr 已存入缓存中的key
	 * @param defaultValue 缓存中对应参数key的默认值
	 * @return 缓存中对应参数key的value
	 */
	public static int getIntValueFromSP(String keyStr, int defaultValue) {
		return SPUtil.getIntValueFromSP(spName, keyStr, defaultValue);
	}

	/**
	 * 获取缓存中的一个Boolean数据
	 * @param keyStr 已存入缓存中的key
	 * @return 缓存中对应参数key的value
	 */
	public static boolean getBooleanValueFromSP(String keyStr) {
		return getBooleanValueFromSP(keyStr, false);
	}

	/**
	 * 获取缓存中的一个Boolean数据
	 * @param keyStr 已存入缓存中的key
	 * @param defaultValue 缓存中对应参数key的默认值
	 * @return 缓存中对应参数key的value
	 */
	public static boolean getBooleanValueFromSP(String keyStr, Boolean defaultValue) {
		return SPUtil.getBooleanValueFromSP(spName, keyStr, defaultValue);
	}

	/**
	 * 获取缓存中的一个Long数据
	 * @param keyStr 已存入缓存中的key
	 * @return 缓存中对应参数key的value
	 */
	public static Long getLongValueFromSP(String keyStr) {
		return getLongValueFromSP(keyStr, 0l);
	}

	/**
	 * 获取缓存中的一个Long数据
	 * @param keyStr 已存入缓存中的key
	 * @param defaultValue 缓存中对应参数key的默认值
	 * @return 缓存中对应参数key的value
	 */
	public static Long getLongValueFromSP(String keyStr, Long defaultValue) {
		return SPUtil.getLongValueFromSP(spName, keyStr, defaultValue);
	}

	/**
	 * 将键值对数组，存入到缓存中
	 * @param keyValueMap 要存入缓存中的键值对
	 */
	public static void setDataIntoSP(HashMap<String, Object> keyValueMap) {
		SPUtil.setDataIntoSP(spName, keyValueMap);
	}

	/**
	 * 获取多个key值对应的values
	 * @param keyValueMap 要获取的缓存中的key值
	 * @return
	 */
	public static List<Object> getValuesFromSP(HashMap<String, Object> keyValueMap) {
		return SPUtil.getValuesFromSP(spName, keyValueMap);
	}

	/**
	 * 获取缓存中所有的数据
	 * @return 
	 */
	public static Map<String, ?> getAllFromSP() {
		return SPUtil.getAllFromSP(spName);
	}

	/**
	 * 验证缓存中是否已经有某个key值
	 * @param key 要查询的key值
	 * @return
	 */
	public static boolean hasKeyInSP(String key) {
		return SPUtil.hasKeyInSP(spName, key);
	}

	/**
	 * 删除缓存中的某个键值对
	 * @param key 欲删除的缓存中的key值
	 */
	public static void deleteValueInSP(String key) {
		SPUtil.deleteValueInSP(spName, key);
	}

	/**
	 * 删除缓存中的所有值
	 */
	public static void deleteAllInSP() {
		SPUtil.deleteAllInSP(spName);
	}

}
