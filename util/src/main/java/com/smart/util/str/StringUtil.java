package com.smart.util.str;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	public static boolean isNull(Object obj) {
		if (obj == null || "".equals(obj.toString().trim())
				|| "null".equals(obj.toString().trim())
				|| "undefined".equals(obj.toString().trim())) {
			return true;
		} else
			return false;
	}

	public static String getValue(Object obj) {
		if (isNull(obj))
			return null;
		else
			return obj.toString();
	}
	
	/**
	 * 验证密码是否由字母数字或符号组合
	 * @param pwd
	 * @return
	 */
	public static boolean verifyPassword(String pwd) {
//		Pattern pattern = Pattern.compile("^[0-9]*");
//		Matcher isNum = pattern.matcher(pwd);
//		if (isNum.matches()) {
//			return false;
//		}
//		pattern = Pattern.compile("^[a-zA-Z]*");
//		Matcher isLetters = pattern.matcher(pwd);
//		if (isLetters.matches()) {
//			return false;
//		}
		if(StringUtil.isNull(pwd)){
			return false;
		}
		if(pwd.length()<6){
			return false;
		}
		return true;
	}

	/**
	 * 验证登录密码8-20位置是否由字母数字或符号组合
	 *
	 * @return
	 */
	public static boolean verifyRegPassword(String pwd) {
		Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Za-z])[\\x20-\\x7e]{8,20}$");
		Matcher isMatcher = pattern.matcher(pwd);
		if (!isMatcher.matches()) {
			return false;
		}
		return true;
	}


	/**
     * 验证邮箱
     * @param email
     * @return
     */
    public static boolean checkEmail(String email){
    	if(isNull(email)){
    		return false;
    	}
        boolean flag = false;
        try{
            String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
            Pattern regex = Pattern.compile(check);
            Matcher matcher = regex.matcher(email);
            flag = matcher.matches();
        }catch(Exception e){
            flag = false;
        }
        return flag;
    }
    /**
     * 生成随机字符串
     * @param length 随机字符串长度
     * @param charSet 随机字符集
     * @return
     */
    public static String getRandomString(int length, String charSet) { //length表示生成字符串的长度
    	if(isNull(charSet))
    	charSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        int charLength = charSet.length();
        for (int i = 0; i < length; i++) {     
            int number = random.nextInt(charLength);     
            sb.append(charSet.charAt(number));     
        }     
        return sb.toString();     
     } 
}
