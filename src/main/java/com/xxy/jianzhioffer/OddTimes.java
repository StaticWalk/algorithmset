package com.xxy.jianzhioffer;

import org.junit.Test;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/26
 * Time:18:12
 *
 *
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
 *
 * 时间复杂度O(n)  空间复杂度O(1)
 *
 * 通过异或可以消除两个偶数的乘积
 *
 */
public class OddTimes {

	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

		if(array.length<=0||array.length%2!=0){
			return;
		}
		if (array.length == 2){
			num1[0] = array[0];
			num2[0] = array[1];
		}

		int x = 0;
		for (int i = 0; i < array.length; i++) {
			x^=array[i];
		}

		int index= findFirst1(x);

		for (int i = 0; i < array.length; i++) {
			if (is1(array[i],index)){
				num1[0]^=array[i];
			}
			else {
				num2[0]^=array[i];
			}
		}

	}

	private boolean is1(int x, int index) {
		x>>=index;
		return (x&1)==1;
	}

	private int findFirst1(int x) {
		int index = 0;
		while ((x&1)!=1){
			x>>=1;
			index++;
		}
		return index;
	}

	@Test
	public void test(){

		int[] array = new int[]{2,4,3,6,3,2,5,5};
		int[] a = new int[1];
		int[] b = new int[1];

		OddTimes oddTimes = new OddTimes();
		oddTimes.FindNumsAppearOnce(array,a,b);
		System.err.println(a[0] + "  " + b[0]);
	}


}
