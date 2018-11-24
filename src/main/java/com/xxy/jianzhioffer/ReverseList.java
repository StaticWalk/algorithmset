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

	public ListNode ReverseList(ListNode head) {

		ListNode reverseHead = null;
		ListNode node = head;
		ListNode pre = null;

		while (node != null){

			ListNode next = node.next;

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



	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

}
