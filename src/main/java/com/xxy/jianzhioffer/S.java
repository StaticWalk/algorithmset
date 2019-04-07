package com.xxy.jianzhioffer;

import java.util.ArrayList;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/26
 * Time:10:47
 */
public class S {



	public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {


		ArrayList list =new ArrayList();

		if (array.length<2){
			return list;
		}
		int i = 0;
		int j = array.length -1;

		while (i<j){

			int add = array[i] + array[j];

			if (add == sum){
				list.add(0,array[i]);
				list.add(1,array[j]);
				return list;

			}else if (add < sum){
				i++;
			}else {
				j--;
			}
		}

		return list;
	}

	public static void main(String[] args) {

		int [] a = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

		ArrayList<Integer> list = FindNumbersWithSum(a,21);

		System.out.println(list);



	}


}
