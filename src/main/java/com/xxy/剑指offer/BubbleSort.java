package com.xxy.剑指offer;

import org.junit.Test;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/9
 * Time:12:23
 *
 */
public class BubbleSort {

	public int[] Solution(int[] a){


		//冒泡
		/**
		 for (int i = 0; i <a.length-1 ; i++) {
		 for (int j = 0; j <a.length-i-1; j++) {
		 if (a[j] > a[j+1]){
		 int tmp = a[j+1];
		 a[j+1] = a[j];
		 a[j] = tmp;
		 }
		 }
		 }*/

		//冒泡优化，如果提前排序结束，一次没有出现交换就说明交换完成了，直接结束遍历
		//因为使用了while循环，第一个for需要换个写法
		/**Boolean flag = true;
		 int n = a.length;
		 while (flag){
		 flag = false;
		 for (int i = 0; i < n - 1; i++) {
		 if (a[i] > a[i + 1]) {
		 int tmp = a[i + 1];
		 a[i + 1] = a[i];
		 a[i] = tmp;
		 flag = true;
		 }
		 }
		 n--;
		 }*/


		//1000个数，前100个乱序的，后900是排列好的不需要重排。
		//设置一个后止点
		/**int flag = a.length;//记录尾边界点
		 int k;
		 while (flag > 0){
		 k = flag;
		 flag = 0;
		 for (int i = 1; i <k ; i++) {
		 if (a[i-1] > a[i]) {
		 int tmp = a[i - 1];
		 a[i - 1] = a[i];
		 a[i] = tmp;

		 flag = i;//找到最后停止的序号
		 }
		 }
		 }*/

		return a;
	}

	@Test
	public  void main() {
		int[] a = new int[]{5,4,3,2,6,7};

		BubbleSort d = new BubbleSort();
		int [] s = d.Solution(a);
		for (int i = 0; i < s.length; i++) {
			System.err.print(s[i]);
		}
	}
}
