package com.xxy.jianzhioffer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/24
 * Time:18:22
 *
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合
 * 成后的链表满足单调不减规则。
 */
public class MergeList {

	public ListNode Merge(ListNode list1,ListNode list2) {

		if(list1 == null){
			return list2;
		}
		if(list2 == null){
			return list1;
		}

		ListNode mergeList = null;
		ListNode current = null;

		while (list1!=null && list2!=null){

			if (list1.val <= list2.val){
				if (mergeList == null){
					mergeList = current =list1;
				}else {
					current.next = list1;
					current = current.next;
				}
				list1 = list1.next;
			}else {
				if (mergeList == null){
					mergeList = current =list2;
				}else {
					current.next = list2;
					current = current.next;
				}
				list2 = list2.next;
			}
		}

		if(list1 == null){
				current.next = list2;
			}else{
				current.next = list1;
			}

		return mergeList;


	}

	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}

		public ArrayList<Integer> toPrint() {

			ListNode tmp = this;

			ArrayList<Integer> list = new ArrayList<>();

			while (tmp != null){
				list.add(tmp.val);
				tmp = tmp.next;
			}

			return list;
		}
	}

	@Test
	public void test(){

		ListNode nodea = new ListNode(0);
		ListNode nodeb = new ListNode(0);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);

		nodea.next = node1;
		node1.next = node2;

		nodeb.next = node3;
		node3.next = node4;
		node4.next = node5;

		System.err.println(Merge(nodea,nodeb).toPrint());

	}

}
