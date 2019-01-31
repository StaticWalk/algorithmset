package com.xxy.todo;

/**
 * Created by xiongxiaoyu
 * Data:2019/1/31
 * Time:15:08
 *
 * 选择排序，n-1次操作
 *
 * 选择前 n-i 个元素中的最大的元素，和最后一个元素交换位置
 *
 */
public class SelectionSort {

	public int[] Solution(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {

			int pos = 0;

			//拿到遍历数组的最大值的下标
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[pos]){
					pos = j;
				}
			}

			int temp = a[pos];
			a[pos] = a[a.length-1-i];
			a[a.length-1-i] = temp;

		}
		return a;

	}

}
