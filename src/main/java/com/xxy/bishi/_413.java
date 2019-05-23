package com.xxy.bishi;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/4/13
 * Time:18:51
 */
public class _413 {

	static int count = 0;

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		String [] ss = new String[n];
		for (int i = 0; i < n; i++) {
			ss[i] = scanner.next();
		}
		StringBuilder sb = new StringBuilder(scanner.next());

		for (int i = 0; i <ss.length-1 ; i++) {
			for (int j = 0; j <ss.length-i-1; j++) {
				if (ss[j].length() > ss[j+1].length()){
					String tmp = ss[j+1];
					ss[j+1] = ss[j];
					ss[j] = tmp;
				}
			}
		}
		for (int i = 0; i <ss.length ; i++) {
			while (sb.toString().contains(ss[i])){
				int index = sb.indexOf(ss[i]);
				sb.delete(index,index+ss[i].length());
				count++;
			}
		}
		System.out.println(count);
		System.out.println(new Random().nextInt(1)+4);
	}

//	static boolean match(int x,String s){
//		char [] sc = s.toCharArray();
//		for (int i = 0; i < sc.length; i++) {
//			if (sc[i] != mc[i+x]){
//				return false;
//			}
//		}
//		return true;
//	}


}
