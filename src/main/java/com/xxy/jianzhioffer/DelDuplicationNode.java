package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/26
 * Time:20:31
 */
public class DelDuplicationNode {
	class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode deleteDuplication(ListNode pHead)
	{

		if (pHead == null|| pHead.next==null){
			return  null;
		}

		ListNode newNode = new ListNode(-1);
		newNode.next = pHead;
		ListNode pre = newNode;
		ListNode last = newNode.next;

		while (last != null){
			if (last.next!=null && pre.next.val == last.next.val){
			while (last.next!=null && pre.next.val == last.next.val){
				last = last.next;
			}
				pre.next = last.next;
				last = last.next;
			}else {
				pre = pre.next;
				last = last.next;
			}

		}

		return newNode.next;

	}



}
