package com.xxy.jianzhioffer;

import org.junit.Test;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/23
 * Time:20:05
 *
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 */
public class NumberOf1 {


	/**
	 *
	 *

	 // 用1和n进行位与运算，
	 // 结果要是为1则n的2进制形式
     // 最右边那位肯定是1，否则为0

	  	int count = 0;
		while (n != 0) {
		if ((n & 1) == 1) {
			count++;
			}
			//把n的2进制形式往右推一位
			n = n >> 1; // 可以用>>>  >>>是忽略符号位置补0  >>是补1
			return count;
		}

	 *
	 */


	public int NumberOf1(int n) {


		//M0  当输入是负数的时候找不到
		int count = 0;
		int flag = 1;
		while (flag !=0 ){
			if ((n&flag)!=0){
				count++;
			}
			flag = flag <<1;
		}

//		if (n < 0) {count++;}
//		while (n!=0){
//			count += n&1;
//			n=n>>>1;
//		}

		//M1
//		while (n != 0) {
////			++count;
////			n = (n - 1) & n;
////		}

		return count;
	}


	@Test
	public void test(){

		NumberOf1 numberOf1= new NumberOf1();

		System.err.println(numberOf1.NumberOf1(-5));


	}


}
