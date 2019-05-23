package com.xxy.sort;

/**
 * Created by xiongxiaoyu
 * Data:2019/1/31
 * Time:20:44
 *
 * 快速排序 O(N*logN)
 * 分治法 + 挖坑法
 *
 *  从左往右开始找大于支点的值
 *  右边往左边找小于支点的值
 *
 */
public class QuickSort {

	public void quickSort(int[] a, int L, int R) {

		int i = L;
		int j = R;

		//先随机确定一个值作为支点
		int pivot = a[(L+R)/2];

		while (i<=j){

			while (a[i]<pivot) {
				i++;
			}

			while (a[j]>pivot){
				j--;
			}

			if (i <= j){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}

		//对支点左边的节点再进行交换排序
		if (j>L){
			quickSort(a,L,j);
		}

		//对支点右边的节点再进行交换排序
		if (R>i){
			quickSort(a,i,R);
		}

	}

	public static void main(String[] args) {
		int[] a = new int[]{5,3,2,1,9,6,4,8};
		QuickSort qs = new QuickSort();
		qs.quickSort(a,0,7);

//		Collections.sort(a,(o1, o2) );

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
