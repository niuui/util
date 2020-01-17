package com.smart.util.phone;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;

import androidx.core.content.ContextCompat;

import com.smart.util.sp.SP;
import com.smart.util.str.StringUtil;

import java.io.File;

public class PhoneInfo {
	private static String VIRTUAL_MAC_ID = "dicamlautriv";

	/**
	 * 获取系统imsi号
	 * 
	 * @param context
	 * @return 返回运营商唯一编号
	 */
	@SuppressLint("MissingPermission")
	public static String getImsi(Context context) {
		if (ContextCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
			return null;
		}
		return ((TelephonyManager) context
				.getSystemService(Context.TELEPHONY_SERVICE)).getSubscriberId();
	}

	
	/**
	 * 判断手机是否root
	 * @return
	 */
	private final static int kSystemRootStateUnknow = -1;//不确定
	private final static int kSystemRootStateDisable = 0;//没有root
	private final static int kSystemRootStateEnable = 1;//已经root
	private static int systemRootState = kSystemRootStateUnknow;
	public static int getRootSystemState() {
		if (systemRootState == kSystemRootStateEnable) {
			return kSystemRootStateEnable;
		} else if (systemRootState == kSystemRootStateDisable) {
			return kSystemRootStateDisable;
		}
		File f = null;
		final String kSuSearchPaths[] = { "/system/bin/", "/system/xbin/",
				"/system/sbin/", "/sbin/", "/vendor/bin/" };
		try {
			for (int i = 0; i < kSuSearchPaths.length; i++) {
				f = new File(kSuSearchPaths[i] + "su");
				if (f != null && f.exists()) {
					systemRootState = kSystemRootStateEnable;
					return kSystemRootStateEnable;
				}
			}
		} catch (Exception e) {
		}
		systemRootState = kSystemRootStateDisable;
		return kSystemRootStateDisable;
	}
	/**
	 * 判断是否有sim卡
	 * @param context
	 */
	public static boolean hasSIMCard(Context context) {
	    TelephonyManager manager = (TelephonyManager) context.getSystemService(Service.TELEPHONY_SERVICE);
	    if(TelephonyManager.SIM_STATE_READY == manager.getSimState()){
	    	return true;
	    }else{
	    	return false;
	    }
	}
}
