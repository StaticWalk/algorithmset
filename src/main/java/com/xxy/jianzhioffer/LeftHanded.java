package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/26
 * Time:11:44
 */
public class LeftHanded {

	public static String LeftRotateString(String str,int n) {

		if (str.length() == 0 || str ==null){
			return "";
		}

		int x = n % str.length();

		StringBuilder sb1 = new StringBuilder(str.substring(0,x));
		StringBuilder sb2 = new StringBuilder(str.substring(x,str.length()));
		return sb2.append(sb1).toString();
	}

}
