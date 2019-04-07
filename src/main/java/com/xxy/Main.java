package com.xxy;

import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/4/5
 * Time:20:28
 */
public class Main {

	static int n;
	static long sum=Integer.MAX_VALUE;
	static int[] d=new int[55];
	static int[] p=new int[55];

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for (int i=0;i<n;i++){
			d[i]=scanner.nextInt();
		}
		for (int i=0;i<n;i++){
			p[i]=scanner.nextInt();
		}
		func(0,0,0);
		System.out.println(sum);
	}

	static void func(long num,long r,long to){
		if (num==n){
			if(r<sum){
				sum=r;
			}
			return;
		}
		if (to<d[(int) num]){
			func(num+1,r+p[(int) num],to+d[(int) num]);
		}else {
			func(num+1,r,to);
			func(num+1,r+p[(int) num],to+d[(int) num]);
		}
	}

}


/**
 *
 *
 * 	Scanner in = new Scanner(System.in);
 * 			int a = in.nextInt();
 * 			String b = in.next().trim();
 * 			char [] chars = b.toCharArray();
 * 			int x = 0;
 * 			int y = 0;
 * 			for (int i = 0; i < a; i++) {
 * 				if (chars[i] == '0'){
 * 					x++;
 *                                }else {
 * 					y++;
 *                }* 			}
 * 			int min = x>y?y:x;
 * 			System.out.println( a-(2*min) );
 *
 *
 *
 *
 *
 * 		Scanner in = new Scanner(System.in);
 * 		int a = in.nextInt();
 * 		int b = in.nextInt();
 * 		int[] array = new int[b];
 *
 * 		for (int i = 0; i < b; i++) {
 * 			array[i] = in.nextInt();
 *        }
 * 		if (array[0] < 0){
 * 			System.out.println(-1);
 *        }else {
 * 			Arrays.sort(array);
 * 			int sum = 0;
 * 			int time = 0;
 * 			while (sum < a){
 * 				for (int i = b-1; i >=0 ; i--) {
 * 					if (array[i] <= sum+1){
 * 						sum += array[i];
 * 						time++;
 * 						break;
 *                    }
 *                }
 *            }
 * 			System.out.println(time);
 *        }
 *
 *       }
 *
 */
