package com.xxy.jianzhioffer;

import org.junit.Test;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/18
 * Time:9:38
 *
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路
 * 径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动
 * 一个格子。如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。 例
 * 如 a b c e s f c s a d e e 这样的3 X 4 矩阵中包含一条字符串"bcced"的路径
 * ，但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个
 * 格子之后，路径不能再次进入该格子。
 *
 * 回溯法：蛮力法的升级版，把问题中的多选择条件抽象成一棵树
 * 解决这个问题的思路比较容易看出，代码实现复杂
 * 引入变量pathLength记录当前路径的长度，布尔数组visited路径中的点不能再被访问
 * 采用递归查找，pathLength也记录深度，满足条件的选项就进入下一级，否则返回上一级
 *
 */
public class MatrixPath {

	public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
	{
		if (matrix == null || str == null || rows<1 || cols<1){
			return false;
		}
		boolean[] visited = new boolean[rows*cols];

		int pathLength = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (hasPathCore(matrix,rows,cols,i,j,str,pathLength,visited)){
					return true;
				}
			}
		}

		return false;
	}

//	private boolean hasPathCore(char[] matrix, int rows, int cols, int i, int j, char[] str, int pathLength, boolean[] visited) {
//		if(pathLength == str.length){
//			return true;
//		}
//
//		boolean hasPath = false;
//
//		if ( i>=0 && j>=0 && i<rows && j<cols && matrix[j+i*cols]==str[pathLength] && !visited[j+i*cols])
//		{
//			pathLength++;
//			visited[j+i*cols] = true;
//			hasPath = hasPathCore(matrix,rows,cols,i,j-1,str,pathLength,visited)
//					||hasPathCore(matrix,rows,cols,i+1,j,str,pathLength,visited)
//					||hasPathCore(matrix,rows,cols,i-1,j,str,pathLength,visited)
//					||hasPathCore(matrix,rows,cols,i,j+1,str,pathLength,visited);
//
//			if (!hasPath){
//				pathLength--;
//				visited[j+i*cols] = false;
//			}
//		}
//		return hasPath;
//	}


		private boolean hasPathCore(char[] matrix, int rows, int cols, int i, int j, char[] str, int pathLength, boolean[] visited) {

		if (pathLength == str.length){
			return true;
		}
		boolean hasPath = false;

		if (i>=0&&j>=0&&j<cols&&i<rows&& matrix[i*cols+j]==str[pathLength] &&!visited[i*cols+j]){

			pathLength++;
			visited[i*cols+j] = true;

			hasPath = hasPathCore(matrix,rows,cols,i,j-1,str,pathLength,visited)||
					hasPathCore(matrix,rows,cols,i,j+1,str,pathLength,visited)||
					hasPathCore(matrix,rows,cols,i-1,j,str,pathLength,visited)||
					hasPathCore(matrix,rows,cols,i+1,j,str,pathLength,visited);

			if (!hasPath){
				pathLength--;
				visited[i*cols+j] = false;
			}

		}
		return hasPath;
		}



	@Test
	public void test(){
		MatrixPath mp = new MatrixPath();

		assert(mp.hasPath("ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS".toCharArray(),5,8,"SGGFIECVAASABCEHJIGQEM".toCharArray()));


	}


}
