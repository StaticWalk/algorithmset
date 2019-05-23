package com.xxy.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/20
 * Time:19:00
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 1、将第一个元素加入队列
 * 2、队列不为空时取队首元素
 * 3、将下一层元素加入队尾
 * 4、调到第二步，直到队列为空
 */
public class PrintBTree {

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

		ArrayList<Integer> list=new ArrayList();
		Queue<TreeNode> queue=new LinkedList<>();

		if (root == null ){
			return list;
		}
		queue.add(root);

		while (queue.size()>0){
			TreeNode node = queue.poll();
			list.add(node.val);
			if (node.left!=null){
				queue.add(node.left);
			}
			if (node.right!=null){
				queue.add(node.right);
			}
		}

		return list;

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
