//package com.xxy.bishi;
//
///**
// * Created by xiongxiaoyu
// * Data:2019/3/13
// * Time:20:17
// */
//public class TTTT {
//
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
//	public static class Node{
//
//		int val;
//
//		Node next = null;
//
//		public Node(int val){
//			this.val = val;
//		}
//
//		public int getVal(){
//			return val;
//		}
//
//	}
//
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
//
//}
