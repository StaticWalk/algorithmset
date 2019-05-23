package com.xxy.bishi;

import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/4/24
 * Time:19:58
 */
public class _4242 {



	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] color = new int[num];
		int max = 0,big = 0;
		for (int i = 0; i < num; i++) {
			int x = in.nextInt();
			color[x]++;
			if (max < x){
				max = x;
			}
		}

		for (int i = 0; i < max; i++) {
			big = get(big,color[i]);
		}
		if (big == 1){
			System.out.println(0);
		}else {
			System.out.println(num/big);
		}


	}

	static int get(int m,int n){
		if (m == 0){
			return n;
		}else if (n == 0){
			return m;
		}
		int temo;
		if (m < n){
			temo = m;
			m = n;
			n = temo;
		}
		while ( m%n !=0){
			temo = m%n;
			m = n;
			n = temo;
		}
		return n;

	}


}
