package com.xxy.bishi;

import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/6/6
 * Time:17:19
 */
public class _66 {

	static final char[] array = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		System.out.println(tenTo36(x));
	}

	public static String tenTo36(int x){
		StringBuffer sb = new StringBuffer();
		if (x == 0){
			sb.append("0");
		}
		while (x > 0){
			sb.append(array[x%36]);
			x = x/36;
		}

		return sb.reverse().toString();

	}
}
