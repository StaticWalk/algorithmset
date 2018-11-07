package com.xxy.剑指offer;

import java.util.Hashtable;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/7
 * Time:20:44
 */
public class DuplicationNumber {
	/**
	 *
	 * @param numbers
	 * @param length
	 * @param duplication
	 * @return
	 *
	 * [2,3,1,0,2,5,3]
	 *
	 * 一个长度为n的数组排序的时间复杂度O(nlogn)
	 * hash表和boolean[]的时间复杂度和空间复杂度都是O(n)
	 * 下标置换
	 */
	public boolean duplicate(int numbers[],int length,int [] duplication) {
		Hashtable<Integer,Integer> table = new Hashtable();
		for (int i = 0; i < length; i++) {
			if (table.contains(numbers[i])){
				duplication[0]=numbers[i];
				return true;
			}
			table.put(numbers[i],0);
		}
		return 	false;
	}

	public static void main(String[] args) {
		DuplicationNumber d=new DuplicationNumber();
		int [] a=new int[]{2,1,3,1,4};
		int [] b=new int[]{1};

		System.err.println(d.duplicate(a,5,b));
	}
}
