package com.xxy.剑指offer;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/7
 * Time:10:47
 *
 *
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 * @author xiongxiaoyu
 */

public class KthNode {


	public ListNode FindKthToTail(ListNode head,int k) {

		//处理null节点和 k = 0
		if (head == null || k == 0) {
			return null;
		}

		ListNode tmp = head;

		//先走k-1步，需要考虑走不到k-1的情况
		for (int i = 0; i < k-1; i++) {
			if (tmp.next == null){
				return null;
			}
			tmp = tmp.next;
		}
		//两个一起走
		while (tmp.next != null) {
			tmp = tmp.next;
			head = head.next;
		}

		return head;

	}


	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
}
