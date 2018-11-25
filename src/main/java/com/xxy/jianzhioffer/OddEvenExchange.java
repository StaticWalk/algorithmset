package com.xxy.jianzhioffer;

import org.junit.Test;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/24
 * Time:16:54
 *
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位
 * 于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和
 * 偶数之间的相对位置不变。
 *
 */
public class OddEvenExchange {

	public void reOrderArray(int [] array) {

		//不用辅助空间的话
		//先找到第一个偶数 然后找到之后的第一个奇数，变换位置就是
		for (int i = 0; i < array.length; i++) {
			if (isEven(array[i])){
				for (int j = i+1; j < array.length; j++) {
					if (!isEven(array[j])){
						int tmp = array[j];
						for (int k = j; k >i ; k--) {
							array[k] = array[k-1];
						}
						array[i] = tmp;
						break;
					}
				}
			}
		}


		//给辅助空间的话 比较简单
//		Stack stack1 = new Stack();
//		Stack stack2 = new Stack();
//		for (int i = 0; i < array.length; i++) {
//			if (array[i]%2==0){
//				stack2.push(array[i]);
//			}
//			else {
//				stack1.push(array[i]);
//			}
//		}
//		for (int i = array.length-1; i >=0 ; i--) {
//
//			if (!stack2.empty()){
//				array[i]= (int) stack2.pop();
//			}
//			else {
//				array[i] = (int) stack1.pop();
//			}
//		}

	}

	private boolean isEven(int i) {
		int k=2;
		if (i%k==0){
			return true;
		}
		return false;
	}

	@Test
	public void test(){

		OddEvenExchange exchange = new OddEvenExchange();

		int[] array = new int[]{1,2,3,4,5,6,7};

		exchange.reOrderArray(array);

		for (int i = 0; i < array.length; i++) {
			System.err.println(array[i]);
		}

	}

}
