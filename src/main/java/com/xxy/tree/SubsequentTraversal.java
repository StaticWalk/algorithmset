package com.xxy.tree;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/28
 * Time:20:13
 *
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则
 * 输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 * 后序遍历序列的合法序列是，对于一个序列S，最后一个元素是x （也就是根），如果去掉
 * 最后一个元素的序列为T，那么T满足：T可以分成两段，前一段（左子树）小于x，后一段
 * （右子树）大于x，且这两段（子树）都是合法的后序序列。
 *
 */
public class SubsequentTraversal {

	public boolean VerifySquenceOfBST(int [] sequence) {

		if (sequence.length == 0){
			return false;
		}

		return doWork(sequence);

	}

	public boolean doWork(int [] sequence){
		if (sequence.length<=2){
			return true;
		}

		int end = sequence[sequence.length-1];
		int mid = sequence.length-1;

		//拿到那个划分点坐标
		for (int i = 0; i < sequence.length-1; i++) {
			if (sequence[i]>end){
				mid=i;
				break;
			}
		}

		for (int i = 0; i < sequence.length-1; i++) {
			if (i<mid&&sequence[i]>end){
				return false;
			}
			if (i>=mid&&sequence[i]<end){
				return false;
			}
		}

		return doWork(Arrays.copyOfRange(sequence,0,mid))&&
				doWork(Arrays.copyOfRange(sequence,mid,sequence.length-1));
	}

	@Test
	public void test(){

		int[] a = new int[]{1,2,3,4,5};

		System.err.println(VerifySquenceOfBST(a));

//		System.err.println(Arrays.copyOfRange(a,3,3).length);
	}

}
