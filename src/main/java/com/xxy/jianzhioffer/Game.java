package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/26
 * Time:16:15
 */
public class Game {

	public static int LastRemaining_Solution(int n, int m) {

		if (n == 0 || m ==0){
			return -1;
		}

		int a [] = new int[n];
		int x = 0;
		int c = n;

		for (int i = 0; c > 1; i++) {
			if (a[i % n] != -1){
				x++;
				if (x % m == 0){
					a[i % n] = -1;
					c--;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (a[i] != -1){
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {

//		System.out.println( LastRemaining_Solution(5,3));

		System.out.println();
	}

}
