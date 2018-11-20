package com.xxy.tree;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/20
 * Time:18:12
 *
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同
 * 此二叉树的镜像是同样的，定义其为对称的。
 */
public class MirrorBTree {

	public void Mirror(TreeNode root) {
		if (root == null) {
			return;
		}

		if (root.left != null || root.right != null) {
			TreeNode tmp = root.left;
			root.left = root.right;
			root.right = tmp;
		}
		if (root.left!=null){
			Mirror(root.left);
		}
		if (root.right!=null){
			Mirror(root.right);
		}
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
