package com.xxy.tree;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/26
 * Time:19:01
 *
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 *
 * 在找到首个相同节点的时候，就要以遍历完第二棵树为中断条件
 * 大递归 小判断
 * HasSubtree 大递归找到第一个相等的节点
 * 小判断
 *
 */
public class ChildTree {

	public boolean HasSubtree(TreeNode root1,TreeNode root2) {

		boolean result = false;

		if(root1!=null && root2!=null){
			if (root1.val == root2.val){
				result = DoesTree1HaveTree2(root1,root2);
			}
			//大递归
			if(!result){
				result = HasSubtree(root1.left,root2);
			}
			if(!result){
				result = HasSubtree(root1.right,root2);
			}
		}

		return result;
	}

	private boolean DoesTree1HaveTree2(TreeNode root1, TreeNode root2) {

		if (root2 == null){
			return true;
		}
		if (root1 == null){
			return false;
		}
		if (root1.val!=root2.val){
			return false;
		}
		return DoesTree1HaveTree2(root1.left,root2.left)&&DoesTree1HaveTree2(root1.right,root2.right);

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
