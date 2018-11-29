package com.xxy.tree;

import java.util.ArrayList;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/29
 * Time:17:07
 *
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所
 * 有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路
 * 径。(注意: 在返回值的list中，数组长度大的数组靠前)
 *
 * 搞清是从root节点到叶节点，遍历到底
 *
 *
 */

public class NodePathBTree {

//	private  ArrayList<ArrayList<Integer>> bigList = new ArrayList();
//	private ArrayList<Integer> list = new ArrayList<>();

	//m1
//	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
//
//		if (root == null){
//			return bigList;
//		}
//
//		list.add(root.val);
//		target-=root.val;
//		if (target==0&&root.left==null&&root.right==null){
//			bigList.add(new ArrayList<Integer>(list));
//		}
//		FindPath(root.left,target);
//		FindPath(root.right,target);
//
//		list.remove(list.size()-1);
//		return bigList;
//	}

	//m2
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {

		ArrayList<ArrayList<Integer>> paths=new ArrayList<ArrayList<Integer>>();
		if (root == null){
			return paths;
		}

		find(paths,new ArrayList<Integer>(),root,target);
		return paths;
	}

	private void find(ArrayList<ArrayList<Integer>> paths, ArrayList<Integer> path, TreeNode root, int target) {

		path.add(root.val);

		if (root.right==null&&root.left==null){
			if (target == root.val){
				paths.add(path);
			}
			return;
		}

		ArrayList<Integer> path2 = new ArrayList<>(path);
		if (root.left!=null){
			find(paths,path,root.left,target-root.val);
		}
		if (root.right!=null){
			find(paths,path2,root.right,target-root.val);
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
