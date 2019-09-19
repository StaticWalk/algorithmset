package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2019/9/19
 * Des:
 */
public class Square {

	public static void main(String[] args) {

		System.err.println( square(4D));

	}


	public static Double square(Double num){

		Double root = num;

		if (num <0){
			return null;
		}
		Double err = 1e-5;
		while (Math.abs(root*root - num)> err ){
			root = (num/root + root) /2.0;
		}

		return root;
	}

}
