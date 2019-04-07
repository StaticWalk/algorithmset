package com.xxy.jianzhioffer;

import java.util.Arrays;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/20
 * Time:20:43
 */
public class ProductArray {

	public static int[] multiply(int[] A) {
		int [] B = new int[A.length];
		B[0] = 1;
		int tmp = 1;
		for (int i = 1; i <A.length ; i++) {
			B[i] = B[i-1]*A[i-1];
		}
		for (int i = A.length-2; i >=0 ; i--) {
			tmp *= A[i+1];
			B[i] *= tmp;
		}
		return B;
	}

	public static void main(String[] args) {

		int [] a =new int[]{1,2,3,4,5};

		System.out.println(Arrays.toString(multiply(a)));
	}

}
