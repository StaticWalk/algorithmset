package com.xxy.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/27
 * Time:21:25
 *
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 *
 * 两种思路，一种遍历(没认真看)，用queue
 * 类似广度优先遍历的思路，
 *
 */
public class FromTopPrintBTree {


	public ArrayList<ArrayList<Integer> > Print(TreeNode root){

		Queue<TreeNode> queue = new ArrayDeque<>();

		ArrayList<Integer> list;
		ArrayList<ArrayList<Integer>> bigList = new ArrayList<>();
		if (root == null){
			return bigList;
		}

		queue.add(root);
		int width = 1;

		while (true){
			//重新初始化
			list = new ArrayList<>();

			int size = queue.size();
			if (size==0){
				break;
			}

			width = Math.max(size,width);

			while (size>=0){

			  TreeNode tmp =queue.poll();
			  list.add(tmp.val);

			  if (tmp.left!=null){
			  	queue.add(tmp.left);
			  }

			  if (tmp.right!=null){
			  	queue.add(tmp.right);
			  }
			  	size--;
			}
			bigList.add(list);

		}
		return bigList;
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
