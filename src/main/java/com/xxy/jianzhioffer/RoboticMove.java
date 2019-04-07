package com.xxy.jianzhioffer;

import org.junit.Test;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/18
 * Time:21:07
 *
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，
 * 上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，
 * 当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方
 * 格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 *
 * 需要一个visited记录遍历过的状态
 * 使用回溯法，常规思路破解
 *
 */
public class RoboticMove {


//	public int movingCount(int threshold,int rows,int cols){
//
//		if (threshold <0 ||rows<1 ||cols<1 ){
//			return 0;
//		}
//
//		int count;
//		boolean[] visited = new boolean[rows*cols];
//		count=movingCountCore(threshold,rows,cols,0,0,visited);
//
//		return count;
//
//	}
//
//	private int movingCountCore(int threshold, int rows, int cols, int i, int j, boolean[] visited) {
//
//		int count = 0;
//
//		if (i<rows&&j<cols&&i>=0&&j>=0
//				&&!visited[i*cols+j]
//				&&getDigitSum(i)+getDigitSum(j)<=threshold){
//
//			visited[i*cols+j]=true;
//
//			count=1+movingCountCore(threshold,rows,cols,i+1,j,visited)
//					+movingCountCore(threshold,rows,cols,i-1,j,visited)
//					+movingCountCore(threshold,rows,cols,i,j-1,visited)
//					+movingCountCore(threshold,rows,cols,i,j+1,visited);
//		}
//
//		return count;
//	}


	static int movingCount(int threshold, int rows, int cols)
	{
		if (threshold<0 || rows<1 || cols<1){
			return 0;
		}

		boolean[] visited = new boolean[rows*cols];

		int count = movingCountCore(threshold,rows,cols,0,0,visited);

		return count;

	}
	static int movingCountCore(int threshold, int rows, int cols, int i, int j, boolean[] visited) {

		int count = 0;

		if (check(threshold,rows,cols,i,j,visited)){

			visited[i*cols+j]=true;

			count=1+ movingCountCore(threshold,rows,cols,i-1,j,visited)
					+ movingCountCore(threshold,rows,cols,i+1,j,visited)
					+ movingCountCore(threshold,rows,cols,i,j-1,visited)
					+ movingCountCore(threshold,rows,cols,i,j+1,visited);

		}

		return count;
	}

	static boolean check(int threshold, int rows, int cols, int i, int j, boolean[] visited) {
		if (i>=0 && j>=0 && i<rows && j<cols
				&& !visited[i*cols+j]
				&& getDigitSum(i)+getDigitSum(j)<=threshold
				){
			return true;
		}

		return false;
	}

	static int getDigitSum(int number) {
		int sum = 0;
		while (number>0){
			sum+=number%10;
			number/=10;
		}
		return sum;
	}


	@Test
	public void test(){
//		RoboticMove rm = new RoboticMove();

		System.out.println(movingCount(3,3,6));

	}
}
