package com.xxy.剑指offer;

import org.junit.Test;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/11
 * Time:22:28
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排
 * 序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的
 * 一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 *  3 4 5 6 1 2
 *  |         |
 *
 * 用两个游标进行二分查找
 *
 * 需要考虑的特殊情况:{ 1, 1, 0, 1}
 * 当 start end  mid 相等，说明不能在进行二分查找了
 * 保持当前状态下 通过遍历查找
 *
 */
public class RotatingArray {

	public int minNumberInRotateArray(int [] array) {
		if(array.length <= 0){
			return 0;
		}
		int start = 0;
		int end = array.length-1;
		int mid = start;

		while (array[start] >= array[end]){

			if (end - start == 1){
				mid = end;
				break;
			}

			mid = (end + start)/2;
			if (array[start]==array[end]
					&&array[end]==array[mid]
					&&array[start]==array[mid]){
				return MinInOrder(array,start,end);
			}

			if (array[start] <= array[mid]){
				start = mid;
			}
			else if(array[mid] <= array[end]) {
				end = mid;
			}

		}
		return array[mid];
	}

	private int MinInOrder(int[] array,int start,int end) {

		int min = array[start];
		for (int i = start + 1; i <= end ; i++) {
			 if(array[i] < min){
			 	min = array[i];
			}
		}
		return min;
	}


	@Test
	public void RotatingArrayTest(){

		RotatingArray ra = new RotatingArray();
		int[] a = new int[]{1};
		System.err.println(ra.minNumberInRotateArray(a));

	}
}
