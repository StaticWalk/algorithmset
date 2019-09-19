package com.xxy.bishi;

import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/9/1
 * Des:
 */
public class _912 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int bao = in.nextInt();
		int yao = in.nextInt();
//		int[] b = new int[bao];
//		int[] y = new int[yao];
		int b_ou = 0;
		int y_ou = 0;

		for (int i = 0; i < bao; i++) {
			if (in.nextInt() == 0){
				b_ou++;
			}
		}
		for (int i = 0; i < yao; i++) {
			if (in.nextInt() % 2 == 0){
				y_ou++;
			}
		}
//		int b_ji = bao - b_ou;
//		int y_ji = yao - y_ou;

		System.out.println(Math.min(b_ou,yao - y_ou) + Math.min(bao - b_ou,y_ou));

	}
}
