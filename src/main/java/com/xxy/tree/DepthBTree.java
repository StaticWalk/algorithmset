package com.xxy.tree;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/20
 * Time:20:14
 *
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结
 * 点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 *
 * 求二叉树的深度
 * 遍历
 */
public class DepthBTree {

	public int TreeDepth(TreeNode root) {

		if(root==null){
			return 0;
		}

//		int left = TreeDepth(root.left);
//		int right = TreeDepth(root.right);
//		return left > right? left+1 : right+1;
		//最简单写法
		return 1+Math.max(TreeDepth(root.left),TreeDepth(root.right));

	}



	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}
}
