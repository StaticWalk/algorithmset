package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/29
 * Time:12:02
 *
 *
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链
 * 表。要求不能创建任何新的结点，只能调整树中结点指针的指向
 *
 */
public class BTreeLinkedNode {


   static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

//	//链表的左边头结点和右边头结点
//	TreeNode leftHead = null;
//	TreeNode rightHead = null;
//
//	public  TreeNode Convert(TreeNode pRootOfTree) {
//		if (pRootOfTree == null){
//			return null;
//		}
//		//找到最左边的第一个结点
//		Convert(pRootOfTree.left);
//		if (rightHead == null){
//			leftHead = rightHead = pRootOfTree;
//		}else {
//			rightHead.right = pRootOfTree;
//			pRootOfTree.left = rightHead;
//			rightHead = pRootOfTree;
//		}
//
//		Convert(pRootOfTree.right);
//
//		return leftHead;
//	}


		TreeNode list = null;

		public  TreeNode Convert(TreeNode pRootOfTree) {
			if (pRootOfTree == null){
				return null;
			}

			Convert(pRootOfTree.right);

			if (list == null){
				list = pRootOfTree;
			}else {
				list.left = pRootOfTree;
				pRootOfTree.right = list;
				list = pRootOfTree;
			}

			Convert(pRootOfTree.left);
			return list;
		}


}
