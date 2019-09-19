package com.xxy.bishi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/8/3
 * Des:
 */
public class _84 {


	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] number= new int[n];
		int q = sc.nextInt();

		for (int i = 0; i < n; i++) {
			number[i] = sc.nextInt();
		}
		Arrays.sort(number);
		int[] count = new int[q];
		for (int i = 0; i < q; i++) {
			count[i] = sc.nextInt();
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println(decrease(number,count[i]));
		}

	}

	static int decrease(int[] number,int x) {

		int count = 0;

		for (int i = 0; i < number.length; i++) {
			if (number[i]>=x){
				count++;
				number[i]-=1;
			}
		}
		return count;
	}


//	static int[] Solution(int[] a) {
//		int temp;
//		for (int i = 1; i < a.length; i++) {
//			temp = a[i];
//			int j = i-1;
//			while ( j>=0 && a[j]>temp && (a[j]+temp)%2==1){
//				a[j+1] = a[j];
//				j--;
//			}
//			a[j+1]=temp;
//		}
//		return a;
//	}


//		static int[] exchange(int[] ints){
//			for (int i = 0; i < ints.length-1; i++) {
//				for (int j = 0; j < ints.length -1- i; j++) {
//					if (ints[j] > ints[j+1] && (ints[j]+ints[j+1])%2==1){
//						int x = ints[j];
//						ints[j] = ints[j+1];
//						ints[j+1] = x;
//					}
//				}
//			}
//			return ints;
//		}



}
