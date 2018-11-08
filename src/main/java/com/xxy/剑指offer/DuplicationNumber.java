package com.xxy.剑指offer;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/7
 * Time:20:44
 *
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不
 * 知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
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
	 * [1，0，1] 溢出法，+ n
	 *
	 * 一个长度为n的数组排序的时间复杂度O(nlogn)
	 * hash表和boolean[]的时间复杂度和空间复杂度都是O(n)
	 * 下标置换
	 */
	public boolean duplicate(int numbers[],int length,int [] duplication) {


		/**S1
		Hashtable<Integer,Integer> table = new Hashtable();
		for (int i = 0; i < length; i++) {
			if (table.contains(numbers[i])){
				duplication[0]=numbers[i];
				return true;
			}
			table.put(numbers[i],0);
		}
		return 	false;
		*/


		/**
		 *  s2,这题是由数组下标i可以作为搜索条件产生的，
		 *  出题目的就是考察考生有没关注到下标i的其他作用
		 *  不用声明新的辅助数组，空间复杂度O(1),时间复杂度O(n)
		 */
		if (numbers ==null||numbers.length <= 0){
			return false;
		}

		for (int i = 0; i < numbers.length; i++) {
				while (numbers[i] != i){

					if(numbers[i] == numbers[numbers[i]]){
						duplication[0]=numbers[i];
						return true;
					}
					int tmp = numbers[numbers[i]];
					numbers[numbers[i]] = numbers[i];
					numbers[i] = tmp;
				}

		}

		return false;



	}

	public static void main(String[] args) {
		DuplicationNumber d=new DuplicationNumber();
		int [] a=new int[]{2,1,3,1,4};
		int [] b=new int[]{1};

		System.err.println(d.duplicate(a,5,b));
	}
}
