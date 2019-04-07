package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/26
 * Time:14:03
 */
public class ReverseSentence {


	public static String reverse(String str){

		if (str.trim().isEmpty()){
			return "";
		}

		StringBuilder sb = new StringBuilder();
		String[] a = str.split(" ");
		for (int i = a.length-1; i >=0 ; i--) {
			sb.append(a[i]);
			if (i>0){
				sb.append(" ");
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {


		String s = "i am a student ";
		String k = reverse(s);

		System.out.println(k);

	}

}
