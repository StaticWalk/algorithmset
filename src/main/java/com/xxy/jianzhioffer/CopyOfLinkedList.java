package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/28
 * Time:21:50
 */
public class CopyOfLinkedList {

	static class RandomListNode {
		int label;
		RandomListNode next = null;
		RandomListNode random = null;

		RandomListNode(int label) {
			this.label = label;
		}
	}

	public static RandomListNode Clone(RandomListNode pHead)
	{

		/***
		 *
		 *     4   7
		 *   1 2 3 4
		 *
		 *
		 *
		 */
		if (pHead == null){
			return null;
		}

		RandomListNode currentNode = pHead;

		//先复制next结点
		while (currentNode != null){
			RandomListNode cloneNode = new RandomListNode(currentNode.label);
			RandomListNode nextNode = currentNode.next;
			currentNode.next =cloneNode;
			cloneNode.next = nextNode;
			currentNode = nextNode;
		}

		currentNode = pHead;

		//2.复制random结点
		while (currentNode != null){
			currentNode.next.random = currentNode.random == null?null:currentNode.random.next;
			currentNode = currentNode.next.next;
		}
		//3.拆分
		currentNode = pHead;

		RandomListNode cloneHead = pHead.next;

		/**
		 *   cloneNode
		 *    |
		 * A  A'  B  B'  C  C'
		 * |  |
		 * cur|
		 *    Head
		 *
		 *
		 */
		while (currentNode != null){
			RandomListNode cloneNode = currentNode.next;
			currentNode.next = cloneNode.next;
			cloneNode.next = cloneNode.next == null ? null:cloneNode.next.next;
			currentNode = currentNode.next;
		}

		return cloneHead;

	}


}
