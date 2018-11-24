package com.xxy.jianzhioffer;

import org.junit.Test;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/24
 * Time:11:20
 *
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 过程中需要保存传入参数的初始值
 *
 * 1.10^1101 = 10^0001*10^0100*10^1000
 * 2.通过&1和>>1来逐位读取1011，为1时将该位代表的乘数累乘得到最终结果
 *
 */
public class IntegerPower {

	public double Power(double base, int exponent) {

		if (exponent == 0){
			return 1;
		}

		double res = 1,curr = base;
		int n =exponent;
		if (exponent<0){
			if (curr == 0){
				return -1;
			}
			exponent = -exponent;
		}

		while (exponent!=0){
			if ((exponent&1)!=0){
				res*=curr;
			}
			curr*=curr;
			exponent>>=1;
		}

		return n>0?res:(1/res);

	}

	@Test
	public void test(){

		IntegerPower iw=new IntegerPower();

		System.err.println(iw.Power(2,5));

	}

}
