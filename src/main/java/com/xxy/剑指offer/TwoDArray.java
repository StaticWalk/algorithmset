package com.xxy.剑指offer;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/11
 * Time:11:01
 *
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都
 * 按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中
 * 是否含有该整数。
 *
 */
public class TwoDArray {

	/**
	 *
	 * @param target
	 * @param array
	 * @return
	 *
	 * target number: 7
	 *		 {1, 2,  8,  9}
	 *		 {2, 4,  9, 12}
	 * 		 {4, 7, 10, 13}
	 * 		 {6, 8, 11, 15}
	 * 从右上角开始缩小范围，从右往左，从上到下
	 * 如例从右往左先确定最可能的列数，此处是第二列
	 *
	 */

	public boolean Find(int target,int[][] array){

		if (array.length <= 0){
			return false;
		}

		for (int i= array[0].length-1;i>=0; i--) {
			if(target >= array[0][i]){
				for (int j = 0 ; j < array.length ;j++) {
					if (target < array[j][i] && i >0){
						i--;
						j--;
					}
					if (target == array[j][i]){
						return true;
					}
				}
				break;
			}
		}
		return false;
	}



	public static void main(String[] args) {

		TwoDArray t = new TwoDArray();

		int[][] array = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int target = 1;

		System.err.println(t.Find(target,array));
		System.err.println(array.length);


	}
}
