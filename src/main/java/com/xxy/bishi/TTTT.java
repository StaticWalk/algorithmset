package com.xxy.bishi;

import java.util.ArrayList;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/13
 * Time:20:17
 */
public class TTTT {

	ArrayList<Integer> arrayList=new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if(listNode!=null){
			this.printListFromTailToHead(listNode.next);
			arrayList.add(listNode.val);
		}
		return arrayList;
	}


	public static void main(String[] args) {


//		String [] ss = new String[]{"aa","b","ac"};
//
//		for (int i = 0; i <ss.length-1 ; i++) {
//			for (int j = 0; j <ss.length-i-1; j++) {
//				if (ss[j].length() > ss[j+1].length()){
//					String tmp = ss[j+1];
//					ss[j+1] = ss[j];
//					ss[j] = tmp;
//				}
//			}
//		}
//
//		for (int i = 0; i < ss.length; i++) {
//			System.out.println(ss[i]);
//		}


//		List list = new ArrayList();
//		list.add(5);
//		System.out.println(list.get(9));


	}



//
//	public static void main(String[] args) {
//
//		Node node1 = new Node(1);
//		Node node2 = new Node(2);
//
//		node1.next = node2;
//
//		reverse(node1);
//
//		System.out.println(node1.getVal());
//
//
////	    System.out.println("Hello World!");
//	}
//
//
     static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
//	public static Node reverse(Node head) {
//
//		Node reverseHead = null;
//		Node node = head;
//		Node pre = null;
//
//		while (node != null){
//
//			Node next = node.next;
//
//			if (next==null)
//			{
//				reverseHead = node;
//			}
//
//			node.next = pre;
//			pre = node;
//			node = next;
//		}
//
//		return reverseHead;
//	}
//
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		while (in.hasNextInt()) {//注意while处理多个case
//			int a = in.nextInt();
//			int b = in.nextInt();
//			System.out.println(a + b);
//		}
//	}
//
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int ans = 0, x;
//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < n; j++){
//				x = sc.nextInt();
//				ans += x;
//			}
//		}
//		System.out.println(ans);
//	}

}
