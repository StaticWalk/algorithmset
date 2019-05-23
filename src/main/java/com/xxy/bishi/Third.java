package com.xxy.bishi;

import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/4/14
 * Time:11:07
 */
public class Third {
	static int max=0;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] h =new int[n];
		int right=0;
		int left=0;
		for (int i=0;i<n;i++){
			h[i]=in.nextInt();
			if (h[i]> right){
				right = h[i];
			}
		}
		int mid=(right+left)/2;
		max=right;
		while (left<right){
			if (check(h,mid)){
				right=mid;
			}else {
				left=mid+1;
			}
			mid=(right+left)/2;
		}
		System.out.println(left);
	}

	public static boolean check(int[] need,int e){
		for (int i=0;i<need.length;i++){
			e=2*e-need[i];

			if(e<0){
				return false;
			}
			if (e>=max){
				return true;
			}
		}
		return true;
	}
}

