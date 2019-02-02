package com.xxy.todo;

/**
 * Created by xiongxiaoyu
 * Data:2019/1/31
 * Time:16:41
 *
 * 插入排序
 *
 */
public class InsertionSort {

	public void Solution(int[] a) {

		int temp;

		for (int i = 1; i < a.length; i++) {

			temp = a[i];
			int j = i-1;

			while ( j>=0 && a[j]>temp ){
				a[j+1] = a[j];
				j--;
			}

			a[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		int[] a=new int[]{3,9,1,2,4,5};
		InsertionSort sort = new InsertionSort();
		sort.Solution(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
