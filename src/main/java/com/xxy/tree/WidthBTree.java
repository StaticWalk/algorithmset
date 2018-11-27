package com.xxy.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/27
 * Time:21:25
 */
public class WidthBTree {


	public int findWidth(TreeNode root){
		if (root == null){
			return 0;
		}

		int lastWidth = 0;
		int curWidth = 0;
		Queue<TreeNode> queue = new ArrayDeque<>();

		queue.add(root);
		int width = 1;
		lastWidth = 1;
		TreeNode current = null;

		while (!queue.isEmpty()){

//			while (lastWidth!=0)

		}


		return 0;
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
