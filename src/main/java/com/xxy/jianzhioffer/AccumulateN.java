package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/21
 * Time:10:21
 *
 *
 */
public class AccumulateN {


	public static int Sum_Solution(int n) {

		int sum = n;
		boolean temp = (sum > 0)&&((sum += Sum_Solution(--n))>0);
		return sum;

	}

	public static int Sum_Solution1(int n) {

		try {
			int i = 1/n;
		}catch (Exception e){
			return n;
		}
		return n += Sum_Solution1(--n);

	}

	public static void main(String[] args) {
		System.out.println(Sum_Solution1(10));
	}


}
