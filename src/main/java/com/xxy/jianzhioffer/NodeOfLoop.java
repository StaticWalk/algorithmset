package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/26
 * Time:20:02
 */
public class NodeOfLoop {


	public static ListNode MeetingNode(ListNode node){

		if (node == null){
			return null;
		}

		ListNode slow = node.next;
		if (slow == null){
			return null;
		}

		ListNode fast = slow.next;
		while (fast != null && slow != null){

			if (slow == fast){
				return fast;
			}
			slow = slow.next;
			fast = fast.next;

			if (slow != fast){
				fast = fast.next;
			}
		}
		return null;
	}

	public static ListNode EntryNodeOfLoop(ListNode node){

		ListNode meetingNode = MeetingNode(node);
		if(meetingNode == null){
			return null;
		}

		int c = 1;
		ListNode node1 = meetingNode;
		while (node1.next != meetingNode){
			node1 = node1.next;
			c++;
		}

		node1 = node;

		for (int i = 0; i < c; i++) {
			node1 = node1.next;
		}
		ListNode node2 = node;

		while (node2 != node1){
			node1 = node1.next;
			node2 = node2.next;
		}

		return node1;

	}



	class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
}
