package com.xxy.bishi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/4/15
 * Time:20:22
 */
public class _4152 {

	static int max = 0;
	static int[] A;
	static int[] B;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		A = new int[num];
		B = new int[num];
		for (int i = 0; i < num; i++) {
			A[i] = in.nextInt();
		}
		for (int i = 0; i < num; i++) {
			B[i] = in.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);

		func(num-1,0,0,0);

		System.out.println(max);

	}

	static void func(int num,int a,int b, int score){
		if (num == 0){
			if (A[a] > B[b]){
				score += 100;
			}else if (A[a] < B[b]){
				score -= 100;
			}
			if (score > max){
				max = score;
			}
			return;
		}
		if (A[a] > B[b+num]){
			score += (num+1)*100;
			if (score > max){
				max = score;
			}
			return;
		}else if (A[a+num]<B[b]){
			score -= (num+1)*100;
			if (score > max){
				max = score;
			}
			return;
		}
		func(num-1,a+1,b,A[a]<B[num+b]?score-100:score);
		func(num-1,a+1,b+1,A[a]<B[b]?score-100:A[a]>B[b]?score+100:score);

	}

}
