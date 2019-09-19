package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/24
 * Time:14:58
 *
 * 输入一个链表，反转链表后，输出新链表的表头。
 *
 * 将节点分成三部分 pre node next
 * 从左到右，当next为空时，找到
 *
 */

public class ReverseList {

	public static class Node {
		int val;
		Node next = null;
		Node(int val) {
			this.val = val;
		}
	}


	public static Node ReverseList(Node head) {

		Node node = head;
		Node reverseHead = null;
		Node pre = null;

		while (node != null){

			Node next = node.next;

			if (next==null)
			{
				reverseHead = node;
			}
			node.next = pre;
			pre = node;
			node = next;
		}
		return reverseHead;
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		node1.next = node2;
		node2.next = node3;

		Node node = ReverseList(node1);

		while (node != null){
			System.out.println(node.val);
			node = node.next;
		}

//		Node current = node1;
//		current =  current.next;
//		System.out.println(current.val);

	}
//		public static Node ReverseList(Node head) {
//
//		Node reverseHead = null;
//		Node node = head;
//		Node pre = null;
//
//		while (node != null){
//
//			Node next = node.next;
//
//			if (next == null){
//				reverseHead = node;
//
//			}
//
//			node.next = pre;
//			pre = node;
//			node = next;
//
//		}
//
//		return reverseHead;
//
//		}





}
