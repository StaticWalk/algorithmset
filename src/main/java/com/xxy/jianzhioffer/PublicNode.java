package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/29
 * Time:15:44
 *t
 * 输入两个链表，找出它们的第一个公共结点。
 *
 */
public class PublicNode {


	static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	/**
	 *
	 * 1.蛮力法
	 * 	退出条件：两条路线的从某一个结点起next都相等了
	 * 2.栈
	 * 3.计算长度 一起走，没有空间开销
	 *
	 *
	 *
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */

	public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

		int c1 = len(pHead1);
		int c2 = len(pHead2);

		int dis = c1 - c2;

		ListNode Long = pHead1;
		ListNode Short = pHead2;

		if (c1 < c2){
			Long = pHead2;
			Short = pHead1;
			dis = -dis;
		}
		for (int i = 0; i < dis; i++) {
			Long = Long.next;
		}
		while ((Long != null)&&(Short != null)&&(Long != Short)){
			Long = Long.next;
			Short = Short.next;
		}
		return Long.next;

	}

	static int len(ListNode node){
		if (node == null){
			return 0;
		}
		int c =0;

		while (node != null){
			node = node.next;
			c++;
		}

		return c;

	}



}
