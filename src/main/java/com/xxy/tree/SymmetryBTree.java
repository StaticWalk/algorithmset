package com.xxy.tree;

import org.junit.Test;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/19
 * Time:15:53
 *
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉
 * 树的镜像是同样的，定义其为对称的。
 *
 * 判断二叉树是否是对称
 *
 *
 */
public class SymmetryBTree {

	private boolean isSymmetryBYree(TreeNode pRoot){
		return isSymmetryBYree(pRoot,pRoot);
	}

	private boolean isSymmetryBYree(TreeNode pRoot1, TreeNode pRoot2) {
		if (pRoot1 == null&& pRoot2==null){
			return true;
		}
		if (pRoot1 == null|| pRoot2==null){
			return true;
		}
		if (pRoot1.val!=pRoot2.val){
			return false;
		}

		return isSymmetryBYree(pRoot1.left,pRoot2.right)
				&&isSymmetryBYree(pRoot1.left,pRoot2.right);
	}


	public void print(TreeNode node){
		if (node == null){
			return;
		}

		print(node.left);
		System.out.println(node.val);
		print(node.right);

	}


	@Test
	public void test(){
		SymmetryBTree sb = new SymmetryBTree();

		TreeNode root = new TreeNode(4);
		TreeNode left = new TreeNode(6);
		TreeNode left1 = new TreeNode(6);
		TreeNode right = new TreeNode(6);
		root.left=left;
		root.right=right;
		root.left.left=left1;

//		assert isSymmetryBYree(root);

		sb.print(root);

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


