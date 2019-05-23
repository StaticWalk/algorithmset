package com.xxy.bishi;

import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/4/24
 * Time:19:36
 */

public class _424 {

	static int x = 0;


	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int res;

		String _str;
		try {
			_str = in.nextLine();
		} catch (Exception e) {
			_str = null;
		}

		res = string2int(_str);
		System.out.println(String.valueOf(res));

	}


	static int string2int(String str) {

		char [] chars = str.toCharArray();

		if (chars[0] == '-'){
			work(1,chars);
			return -x;
		}
		work(0,chars);
		return x;

	}

	static int work(int start,char[] chars){
		for (int i = start; i < chars.length; i++) {

			if (chars[i] == '.'){
				if (check(i+1,chars)){
					return x;
				}
				return 0;
			}

			if (chars[i]>'9' || chars[i]<'0'){
				return 0;
			}
			x = x*10+chars[i]-'0';
		}
		return x;
	}

	static boolean check(int start,char[] chars){
		for (int i = start; i < chars.length; i++) {
			if (chars[i]>'9' || chars[i]<'0'){
				return false;
			}
		}
		return true;
	}


}
