package com.xxy.bishi;

import java.util.Arrays;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/7
 * Time:16:39
 * 找出数组中最大的N个树
 */
public class TopN {


	//使用堆排序 把大的值定上去就是
	public static int[] topk(int[] arr,int n){

		int[] top = new int[n];

		for (int i = 0; i < n; i++) {
			top[i] = arr[i];
		}

		//从后往前对初始堆调整
		for (int i = top.length/2-1; i >=0; i--){
			heapify(top,i);
		}

		for (int i = n; i < arr.length; i++) {
			int root = top[0];
			if (root<arr[i]){
				top[0] = arr[i];
				heapify(top,0);
			}
		}

		return top;
	}

	private static void heapify(int[] arr, int i) {
		int left = i*2+1;
		int right = i*2+2;
		int smallest = i;

		if ( left<arr.length && arr[left] < arr[smallest] ){
			smallest = left;
		}
		if ( right<arr.length && arr[right] < arr[smallest] ){
			smallest = right;
		}
		if (i != smallest){
			int tmp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = tmp;
			heapify(arr,smallest);
		}

	}



	//其实不需要保证这些是有序的
	public static int[] topn(int[] arr,int n){

		if (n >= arr.length){
			return arr;
		}
		for (int i = 1 ; i <= n  ; i++) {
			int index = 0;
			for (int j = 0; j <= arr.length - i; j++) {

				if (arr[index] < arr[j]){
					index = j;
				}
			}
			int temp = arr[arr.length -i];
			arr[arr.length - i] = arr[index];
			arr[index] = temp;
		}
		return Arrays.copyOfRange(arr,arr.length-n,arr.length);
	}


	public static void main(String[] args) {

		int arr [] = new int[]{6,5,1,13,7};

		System.out.println(Arrays.toString(topk(arr,3)));
	}


}
