package com.xxy.剑指offer;

import org.junit.Test;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/11
 * Time:15:53
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台
 * 阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 * 一阶只有一种跳法，两阶有两种跳法
 * f(n) = f(n-1) +f(n-2)
 *
 */
public class FrogJumping {

	public int Solution(int target){
		if (target <= 0){
			return 0;
		}
		if(target == 1 || target == 2) {
			return target;

		}

		int jumpSum = 0;
		int jumpSumBackStep1 = 2;
		int jumpSumBackStep2 = 1;

		for(int i = 3; i <= target; i++) {
			jumpSum= jumpSumBackStep1 + jumpSumBackStep2;
			jumpSumBackStep2 = jumpSumBackStep1;
			jumpSumBackStep1 = jumpSum;
		}
		return jumpSum;
	}



	@Test
	public void jumpingTest(){



	}
}
