package com.xxy.jianzhioffer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/23
 * Time:13:58
 *
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输
 * 入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打
 * 印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * 考虑三种特殊情况  1x5  5x1  2x3
 *
 */
public class PrintArray {

	public ArrayList<Integer> printMatrix(int [][] matrix) {

		if (matrix == null){
			return null;
		}
		int start = 0;
		ArrayList list = new ArrayList();
		while (matrix.length > 2*start&& matrix[0].length>2*start){

			list = PrintMatrixInCircle(matrix,start,list);
			start++;
		}
		return list;

	}


	private ArrayList PrintMatrixInCircle(int[][] matrix,int start,ArrayList list) {

		int endX = matrix[0].length-1-start;
		int endY = matrix.length-1-start;

		if (endX >=start){
			for (int i =start; i <= endX; i++) {
				list.add(matrix[start][i]);
			}
		}

		if (endY > start){
			for (int i = start+1; i <=endY ; i++) {
				list.add(matrix[i][endX]);
			}
		}

		if (start < endX&& start < endY){
			for (int i = endX-1; i >=start ; i--) {
				list.add(matrix[endY][i]);
			}
		}
		if (start+1 < endY && start < endX){
			for (int i = endY-1; i > start ; i--) {
				list.add(matrix[i][start]);
			}
		}
		return list;
	}


	@Test
	public void test(){
		PrintArray print = new PrintArray();
		int[][] a = new int[][]{{0}};
//		int[][] a = new int[][]{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		System.err.println(print.printMatrix(a));

	}



}
