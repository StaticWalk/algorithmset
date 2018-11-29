package com.xxy.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/28
 * Time:11:00
 *
 *
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层
 * 按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 *
 */
public class ZhiPrintBTree {


	//最垃圾的做法！
	public ArrayList<ArrayList<Integer>> Print(TreeNode root) {

		int layer = 1;
		ArrayList<Integer> list;
		ArrayList<ArrayList<Integer>> bigList = new ArrayList<>();
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		if (root == null){
			return bigList;
		}
		stack1.add(root);
		while(!stack1.isEmpty()||!stack2.isEmpty()){
			list = new ArrayList<>();
			if (layer%2!=0){

				while (!stack1.empty()){
					TreeNode tmp = stack1.pop();
					list.add(tmp.val);

					if (tmp.right != null) {
						stack2.push(tmp.right);
					}

					if (tmp.left != null) {
						stack2.push(tmp.left);
					}
				}

			}else {
					while (!stack2.empty()){
					TreeNode tmp = stack2.pop();
					list.add(tmp.val);
					if (tmp.left != null) {
						stack1.push(tmp.left);
					}
					if (tmp.right != null) {
						stack1.push(tmp.right);
					}
				}
			}
			bigList.add(list);
			layer++;
		}
		return bigList;
	}


	//好的做法 还好没有多好。。
//	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
//		ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
//		if (pRoot == null) {
//			return ret;
//		}
//		ArrayList<Integer> list = new ArrayList<>();
//		LinkedList<TreeNode> queue = new LinkedList<>();
//		queue.addLast(null);//层分隔符
//		queue.addLast(pRoot);
//		boolean leftToRight = true;
//
//		while (queue.size() != 1) {
//			TreeNode node = queue.removeFirst();
//			if (node == null) {//到达层分隔符
//				Iterator<TreeNode> iter = null;
//				if (leftToRight) {
//					iter = queue.iterator();//从前往后遍历
//				} else {
//					iter = queue.descendingIterator();//从后往前遍历
//				}
//				leftToRight = !leftToRight;
//				while (iter.hasNext()) {
//					TreeNode temp = (TreeNode)iter.next();
//					list.add(temp.val);
//				}
//				ret.add(new ArrayList<Integer>(list));
//				list.clear();
//				queue.addLast(null);//添加层分隔符
//				continue;//一定要continue
//			}
//			if (node.left != null) {
//				queue.addLast(node.left);
//			}
//			if (node.right != null) {
//				queue.addLast(node.right);
//			}
//		}
//
//		return ret;
//	}


	@Test
	public void test(){
		ZhiPrintBTree sb = new ZhiPrintBTree();

		TreeNode root = new TreeNode(4);
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(6);
		TreeNode left1 = new TreeNode(2);
		root.left=left;
		root.right=right;
		root.left.left=left1;

		System.err.println( sb.Print(root));

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
