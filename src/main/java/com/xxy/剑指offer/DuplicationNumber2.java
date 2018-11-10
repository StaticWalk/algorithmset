package com.xxy.剑指offer;


import org.junit.Test;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/8
 * Time:20:03
 *
 * 不修改数组，找出重复元素
 * 长度n+1的数组中，所有数字的大小在1-n之间，
 * [2,3,5,4,3,2,6,7] -->  重复数字[2,3]
 */
public class DuplicationNumber2 {

	//这种做法是时间换空间
	//类似二分查找法，时间复杂度O(nlogn),空间复杂度是O(1)
	//搞清楚做法，自己写代码失败了
	public int Solution(int[] a,int start,int end){

		int s=0,e=0;

		int m = end/2;

		for (int i = 0; i < a.length ; i++) {
			if (1<=a[i] && a[i]<=m ){
				s++;
			}
		}
		if (s > m-start+1){
			if (m==start){
				return a[m];
			}
			Solution(a,start,m);
		}
		else {
			if (m+1==end){
				return a[m+1];
			}
			Solution(a,m+1,end);
		}
		return 0;
	}


	@Test
	public  void main() {

		int[] a = new int[]{5,4,3,2,5,1};
		DuplicationNumber2 d = new DuplicationNumber2();
		int s = d.Solution(a,1,a.length+1);
		System.err.println(s);

	}
}
