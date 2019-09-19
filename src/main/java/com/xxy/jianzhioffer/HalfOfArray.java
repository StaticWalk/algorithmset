package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2019/5/31
 * Time:15:07
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例
 * 如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出
 * 现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 *
 * S1:
 *  排序后取中间的元素统计次数 排序后一定在中间
 *
 */
public class HalfOfArray {

	public int MoreThanHalfNum_Solution(int [] array) {
			int n = array.length;
			if (n == 0) return 0;

			int num = array[0];
			int count = 1;

			for (int i = 1; i < n; i++) {
				if (array[i] == num){
					count++;
				}else {
					count--;
				}
				if (count == 0){
					num = array[i];
					count = 1;
				}
			}

			//验证
			count = 0;
			for (int i = 0; i < n; i++) {
				if (num == array[i]){
					count ++;
				}
			}
			if (count*2 > n){
				return num;
			}

			return 0;
	}
}
