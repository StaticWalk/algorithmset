package com.xxy.jianzhioffer;

import java.util.ArrayList;

/**
 * Created by xiongxiaoyu
 * Data:2019/6/12
 * Time:16:07
 */
public class SList {

	public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {

		ArrayList<ArrayList<Integer>> bigList = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 2; i <= sum/2; i++) {
			if ((sum % i ==0) && (i%2!=0) ){
				int x = sum/i;
				for (int j = 0; j < i; j++) {
					list.add(x-i/2+j);
				}
				bigList.add((ArrayList<Integer>) list.clone());
				list.clear();
			}

		}
		if ((sum % 2 !=0) ){
			list.add(sum/2);
			list.add(sum/2+1);
			bigList.add((ArrayList<Integer>) list.clone());
			list.clear();
		}
		return bigList;
	}


	public static void main(String[] args) {
		System.out.println(FindContinuousSequence(9));
	}



}
