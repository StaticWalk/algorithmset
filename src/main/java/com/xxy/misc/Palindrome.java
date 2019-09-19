package com.xxy.misc;

import java.util.Stack;

/**
 * Created by xiongxiaoyu
 * Data:2019/9/19
 * Des:
 *
 * 回文链表
 * 1 2 3 2 1
 * 1 2 2 1
 */
public class Palindrome {

	public static void main(String[] args) {

	}

	public static boolean isPalindrome(ListNode pHead) {
		// write code here

		Stack<Integer> stack = new Stack();

		ListNode fast = pHead;
		ListNode slow = pHead;

		while (fast != null && fast.next != null){
			stack.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast != null){
			slow = slow.next;
		}
		while (slow != null){
			if(stack.pop()!=slow.val){
				return false;
			}
			slow = slow.next;
		}
		return true;
	}


	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

}
