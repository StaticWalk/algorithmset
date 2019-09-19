package com.xxy;

import java.util.Arrays;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/28
 * Time:11:55
 */
public class binfind {


	/**
	 *  1 2 3 4 5
	 *
	 *
	 * @param
	 * @param
	 * @return
	 */

	public static int fibadd(int n){
		if (n <= 2 ){
			return 1;
		}else {
			return fibadd(n-1) + fibadd( n-2);
		}
	}

	public static boolean find(int[] a, int x){

		if (a.length == 0){
			return false;
		}

		int end = a.length;
		int start = 0;
		int mid = (end + start)/2;

		if (a[mid] > x){
			return find(Arrays.copyOfRange(a,start,mid),x);
		}else if (a[mid] == x){
			return true;
		}else {
			return find(Arrays.copyOfRange(a,mid+1,end),x);
		}

	}

	 static int NumberOf1(int n) {


		//M0  当输入是负数的时候找不到
//		int count = 0;
//		int flag = 1;
//		while (flag !=0 ){
//
//			if ((n&flag)!=0){
//				count++;
//			}
//			flag = flag <<1;
//		}


		int count = 0;
		while (n != 0) {
			++count;
			n = (n - 1) & n;
		}

		return count;
	}

	static boolean findTree(String [] a){
		for (int i = a.length/2-1; i >=0 ; i--) {
			if (dofind(a,i)){
				return false;
			}
		}
		return true;
	}

	static boolean dofind(String[] a,int x) {
		int left = x*2+1;
		int right = x*2+2;
		if (Integer.valueOf(a[left])> Integer.valueOf(a[x])|| Integer.valueOf(a[x])> Integer.valueOf(a[right])){
			return true;
		}
		return false;
	}

	static void mix(int x,int y){

	}


	public static void main(String[] args) {
//		int [] a = new int[]{1,5,15,3,7,13,18,11};
		String a = "1,5,15,3,7,13,18";
		String [] s = a.split(",");
		System.out.println(findTree(s));

	}



}