package com.xxy.bishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/16
 * Time:10:33
 */
public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> list = new ArrayList();
		for(int i = 0; i < n; i++){
			list.add(in.nextLine());
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(clean(list.get(i)));
		}


	}

	private static String clean(String a) {

		if (a == null){
			return null;
		}

		String result = String.valueOf('\0');

		char[] cs = a.toCharArray();

		for (int i = 0; i < cs.length-2; i++) {
			if (cs[i] ==cs[i+1]&&cs[i+1]==cs[i+2]) {
				cs[i]='\0';
			}
		}
		for (int i = 0; i < cs.length; i++) {

			if (cs[i]!='\0'){
				result+=cs[i];
			}
		}

		cs = null;
		cs = result.toCharArray();
		result = String.valueOf('\0');


		for (int i = 0; i < cs.length-3; i++) {
			if (cs[i] ==cs[i+1]&&cs[i+2]==cs[i+3]&&cs[i+2]!=cs[i+1]) {
				cs[i+3]='\0';
			}
		}

		for (int i = 0; i < cs.length; i++) {
			if (cs[i]!='\0'){
				result+=cs[i];
			}
		}

		return result;
	}


//	private static int calc(int in) {
//		if (in>1024){
//			return  0;
//		}
//		int a = 1024-in;
//		int x=0,t=64;
//
//		while (0 < a){
//			x+=(a/t);
//			a=a%t;
//			t=t/4;
//		}
//		return x;
//	}

}
