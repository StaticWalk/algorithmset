package com.xxy.bishi;
import java.util.Scanner;
/**
 * Created by xiongxiaoyu
 * Data:2019/4/15
 * Time:19:46
 *
 *
 * 5
 * 5 4 3 5 2
 * 2 2 3 5 1
 * 10
 * 16
 *
 */
public class _415 {

	static int[] arr1 ;
	static float[] arr2 ;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int[] value = new int[num+1];
		int[] time = new int[num+1];
		for (int i = 1; i <=num ; i++) {
			value[i] = in.nextInt();
		}
		for (int i = 1; i <=num ; i++) {
			time[i] = in.nextInt();
		}
		int total = in.nextInt();
		int[] dp = new int[total+1];
		for (int i = 1; i < num+1; i++) {
			for (int j = total; j >= time[i] ; j--) {
				dp[j] = Math.max(dp[j],dp[j - time[i]] +value[i]);
			}

		}




//		for (int i = 1; i <=num ; i++) {
//			for (int j = total; j >= time[i]; j--) {
//				dp[j] = Math.max(dp[j],dp[j-time[i]]+value[i]);
//			}
//		}
		System.out.println(dp[total]);
	}

}