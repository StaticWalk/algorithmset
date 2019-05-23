package com.xxy.bishi;

import java.util.Arrays;

/**
 * Created by xiongxiaoyu
 * Data:2019/4/14
 * Time:17:13
 */
public class _9 {


	static int [] arr = new int[]{1,5,-6,-6,-7,6};

	public static void main(String[] args) {

		int shorter = 0;

		for (int i = 0; i <arr.length ; i++) {
			if (arr[i] > 0){
				shorter++;
			}
		}
		if (shorter > arr.length/2 ){
			shorter = arr.length - shorter;
		}

		for (int i = 1; i < shorter * 2; i++) {
			if (arr[i-1]*arr[i]>0){
				int x = i;
				while (arr[i-1]*arr[x]>0){
					x++;
				}
				swap(i,x);
			}
		}

		System.out.println(Arrays.toString(arr));

	}
	static void swap(int i, int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}
