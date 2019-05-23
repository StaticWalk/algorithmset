package com.xxy.bishi;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/4/14
 * Time:9:59
 */
public class _414 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		int [][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			String[] s = in.nextLine().split(" ");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.valueOf(s[j]);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(arr[i][j]);
			}
		}


		HashSet set = new HashSet();

//		int[][] arr = new int[][]{{0,2,6,5},{2,0,4,4},{6,4,0,2},{5,4,2,0}};

		int min = 100000;
		int j=0;
		int start = 0;

		for (int i = 0; i < arr.length; i++) {
			start = i;
			int score = 0;
			for ( j = j%arr[i].length; set.size() < arr.length ; j++) {
				set.add(i);
				if (!set.contains(j)){
					set.add(j);
					score += arr[start][j];
//					System.out.println(score);
					start = j;
				}
			}
			score += arr[i][start];
			set.clear();
			min = Math.min(min,score);
		}
		System.out.println(min);
	}
}
