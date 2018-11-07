package com.xxy.剑指offer;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/7
 * Time:13:03
 *
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且
 * 返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * @author xiongxiaoyu
 */

public class NextNode {

	/**
	 *
	 * @param pNode
	 * @return
	 *			  f
	 * 			/
	 * 		   e
	 * 			\
	 * 		     a
	 *		   /   \
	 *		  b	 	c
	 *
	 * 先总结中序遍历的特点：左中右
	 * 目标节点为a：下一个节点是从右节点c开始的最左节点
	 * 目标节点为b：下一节点为父节点a
	 * 目标节点为c：先找到最上面的那个是父节点左子节点的节点，这个节点的父节点就是下一个节点f
	 */
	public TreeLinkNode GetNext(TreeLinkNode pNode){

		if (pNode == null){
			return null;
		}

		TreeLinkNode node = null;

		if(pNode.right != null){
			TreeLinkNode right = pNode.right;
			while (right.left != null){
				right = right.left;
			}
			node = right;
		}

		else if (pNode.next != null){

			TreeLinkNode current = pNode;
			TreeLinkNode parent = pNode.next;
			while (parent.right == current ){
				//最后一个节点找到的是root节点
				if(parent.next == null){
					return null;
				}
				current = parent;
				parent = parent.next;
			}
			node = parent;
		}
		return node;
	}


	public class TreeLinkNode {
		int val;
		TreeLinkNode left = null;
		TreeLinkNode right = null;
		TreeLinkNode next = null;

		TreeLinkNode(int val) {
			this.val = val;
		}
	}

}
