package com.xxy.剑指offer;

import org.junit.Test;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/11
 * Time:13:53
 *
 *
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * 传统的斐波那契效率很低，递归调用的时间复杂度以n的指数的方式递增的。
 *
 * 改进办法：避免重复计算，保存已经计算过的中间项 时间复杂度O(n)
 *
 */
public class Fibonacci {


	public long solution(int n){

		int[] result = new int[]{0,1};
		if(n<2){
			return result[n];
		}
		long fibOne = 1;
		long fibTwo = 0;
		long fibN = 1;
		for (int i = 2; i <=n ; i++) {
			fibN = fibOne + fibTwo;
			fibTwo = fibOne;
			fibOne = fibN;
			}
		return fibN;

	}


	public int Fib(int n) {
		if (n == 0){
			return 0;
		}
		else if (n == 1 || n== 2){
			return 1;
		}
		else {
			return Fib(n-1) + Fib(n-2);
		}
	}


	@Test
	public void fibTest(){

		Fibonacci f = new Fibonacci();
		int s= 20;
		System.err.println(f.Fib(s));
		System.err.println(f.solution(s));

//		System.err.println(4>>1);
	}




}
