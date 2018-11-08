package com.xxy.剑指offer;


import org.junit.Test;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/8
 * Time:20:03
 *
 * 不修改数组，找出重复元素
 * 长度n+1的数组中，所有数字的大小在1-n之间，
 * [2,3,5,4,3,2,6,7] -->  重复数字[2,3]
 */
public class DuplicationNumber2 {

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

		int k = a.length;

		while (k > 0){
			for (int i = 0; i <k ; i++) {
				if (a[i] > a[i + 1]) {
					int tmp = a[i + 1];
					a[i + 1] = a[i];
					a[i] = tmp;
					k = i+1;
				}
			}
			k--;
		}

		return a;
	}


	@Test
	public  void main() {
		int[] a = new int[]{5,4,3,2,6,7};

		DuplicationNumber2 d = new DuplicationNumber2();
		int [] s = d.Solution(a);
		for (int i = 0; i < s.length; i++) {
			System.err.print(s[i]);
		}
	}
}
