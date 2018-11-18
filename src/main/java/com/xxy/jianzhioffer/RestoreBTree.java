package com.xxy.jianzhioffer;

import java.util.Arrays;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/7
 * Time:11:16
 *
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入
 * 的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列
 * {1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class RestoreBTree {

	/**
	 *
	 * @param pre
	 * @param in
	 * @return
	 *
	 * 二叉树离不开递归，递归搞懂了，二叉树就懂了
	 *
	 * 二叉树不包含重复的数字
	 *
	 * 前序遍历：  1 2 4 7 3 5 6 8
	 *            |
	 * 中序遍历：  4 7 2 1 5 3 8 6
	 * 					|
	 * 先序的第一个元素一定是当前节点，中序找到当前节点的位置，左边的是左子节点部分，右边是右子节点部分
	 *
	 */
	public TreeNode reConstructBinaryTree(int [] pre, int [] in) {

		if (pre.length == 0 || in.length == 0 || pre.length != in.length) {
			return null;
		}

		TreeNode root = new TreeNode(pre[0]);

		for (int i = 0; i < in.length; i++) {
			if (in[i] == pre[0]){
				//Arrays.copyOfRange(int[] original, int from, int to) copy的范围( from , to )
				root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
				root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
			}
		}
		return root;
	}


public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

}
