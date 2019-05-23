package com.xxy.bishi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/4/11
 * Time:21:18
 */
public class Poker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		int n = scanner.nextInt();
		int[] x = new int[n];

		for (int i = 0; i <n ; i++) {
			x[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			pkPai(x[i]);
			System.out.println();
		}

	}

	static void pkPai(int n) {
		// 定义一个数组，给牌赋值
		int[] m = new int[n];
		for (int i = 0; i < m.length; i++) {
			m[i] = i + 1;
		}
		int[] j = new int[n];// 桌子上牌的数组
		int count = 0;
		while (count < n) {
			// 一直抽牌，第一张放桌子上，第二张放牌低，循环操作
			for (int i = 0; i < m.length; i++) {
				if (i % 2 == 0) {
					j[count] = m[i];
					count++;
				}
				// 扩容数组:每在牌低加一张便算作数组扩容+1
				if (i % 2 == 1) {
					int l = m[i];
					m = Arrays.copyOf(m, m.length + 1);
					m[m.length - 1] = l;
				}
			}
			// 反转序列
			// Collections.reverse(list);
		}
		for (int i = 0; i < j.length; i++) {
			System.out.print(j[i]+" ");

		}
	}


//	 static void seekarray(int n){
//		LinkedList<Integer> list = new LinkedList();
//		for(int i = 1; i <= n; i++){
//			list.add(i);
//		}
//		int[] array = new int[n + 1];
//		int[] result = new int [n + 1];
//		int index = 1;
//		while(!list.isEmpty()){
//			array[index] = list.removeFirst();
//			index ++;
//			if(!list.isEmpty())
//				list.addLast(list.removeFirst());
//		}
//
//		for(int i = 0; i <= n; i++){
//			result[array[i]] = i;
//		}
//		for(int i : result){
//			System.out.print(i + " ");
//		}
//	}

}
