package com.xxy.bishi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/9/1
 * Des:
 */
public class _911 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = in.nextInt();
		}

		int max = 0;

		for (int i = array.length ; i > 0 ; i--) {
			for (int j = 0; j + i < array.length ; j++) {
				int x = x(Arrays.copyOfRange(array,j,j+i+1));
				if (x > max){
					max = x;
				}
			}
		}

		System.err.println(max);


	}

 	static int x(int[] array){
		int min = 100000;
		int sum = 0;
		for (int i : array) {
			sum += i;
			if (i < min) {
				min = i;
			}
		}
		return min*sum;
	}


}
