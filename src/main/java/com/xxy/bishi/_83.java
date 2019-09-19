package com.xxy.bishi;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/8/3
 * Des:
 */
public class _83 {

		public static void main(String[] args) {

			DecimalFormat df = new DecimalFormat("0.000000");
//			System.err.println(df.format(0));

//			double b = Math.round(2.0000*1000000)/1000000.000000;
//			System.err.println(b);

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] a= new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int q = sc.nextInt();
			int[] index = new int[q];
			for (int i = 0; i < q; i++) {
				index[i] = sc.nextInt();
			}

			for (int i = 0; i < index.length; i++) {

					System.out.println(df.format(getPercent(a,index[i],n)));

			}

		}

		static double getPercent(int[] score,int index,int sum) {

			int count = 0;
			for (int i = 0; i < score.length; i++) {
				if (score[i] < score[index-1]){
					count++;
				}
			}

			double percent = (double)(count)/sum;


			return Double.parseDouble(String.format("%,6f",100*percent));
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
