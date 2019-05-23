package com.xxy.tree;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/27
 * Time:20:36
 *
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 *
 * 平衡二叉树：平衡二叉搜索树(AVL树)，性质：空树或者它的左右两个子树的高度差的绝
 * 对值不超过1，并且左右两个子树是一棵平衡二叉树。
 * 常用的实现方案是：红黑树，AVL，替罪羊树，Treap，伸缩树
 *
 *
 * 第一步先要判断是否平衡二叉树
 *
 */
public class BalancedBTree {

	public boolean IsBalanced_Solution(TreeNode root) {

		if(root == null){
			return true;
		}

		return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 &&
				IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
	}

	private int maxDepth(TreeNode node) {
		if (node == null){
			return 0;
		}
		return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
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
