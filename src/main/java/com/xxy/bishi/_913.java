package com.xxy.bishi;

import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/9/1
 * Des:
 */
public class _913 {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int number = in.nextInt();

		int[][] array = new int[number][2];

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < 2; j++) {
				array[i][j] = in.nextInt();
			}
		}
		System.out.println(sort(array));

	}

	static int sort(int[][] array ){
		int sum = 0;

		for (int i = 0; i <array.length-1 ; i++) {
			 for (int j = 0; j <array.length-i-1; j++) {
				 if (array[j][0] < array[j+1][0]){
					 int tmp = array[j+1][0];
					 array[j+1][0] = array[j][0];
					 array[j][0] = tmp;

					 tmp = array[j+1][1];
					 array[j+1][1] = array[j][1];
					 array[j][1] = tmp;
					 }
				 }
		 }

		for (int i = 0; i <array.length-1 ; i++) {
			for (int j = 0; j <array.length-i-1; j++) {
				if (array[j][1] > array[j+1][1]  && array[j][0] == array[j+1][0]){

					int tmp = array[j+1][0];
					array[j+1][0] = array[j][0];
					array[j][0] = tmp;

					tmp = array[j+1][1];
					array[j+1][1] = array[j][1];
					array[j][1] = tmp;
				}
			}
		}



		for (int i = 0; i < array.length; i++) {
			sum += array[i][0]*i + array[i][1]*(array.length-i-1);
		}
		return sum;

	}

}
