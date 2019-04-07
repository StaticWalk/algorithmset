package com.xxy.sort;

import java.util.Arrays;

/**
 * Created by xiongxiaoyu
 * Data:2019/2/1
 * Time:19:29
 *
 * 二叉堆排序，使用了二叉树的特性
 *
 * 根元素的值最大，左子节点<根节点<右子节点
 * 父节点下标：(i-1)/2
 * 左右子节点：2*i+1 、 2*i+2
 *
 * 二叉堆、二项式堆、斐波那契堆  一般将二叉堆简称为堆
 *
 *
 * 时间复杂度 快排、归并排序、堆排序都是 O(N*logN)
 */
public class HeapSort {


	public static void main(String[] args) {

		int[] arrays = {6, 3, 4, 7, 5, 1, 2};

		for (int i = 0; i < arrays.length; i++) {

			//每完成一次建堆就可以排除一个元素了
			//为完成排序中最大值换到首位
			maxHeapify(arrays, arrays.length - i);

			//首个元素和未完成排序的最后一个元素交换位置
			int temp = arrays[0];
			arrays[0] = arrays[(arrays.length - 1) - i];
			arrays[(arrays.length - 1) - i] = temp;

		}

		System.out.println(Arrays.toString(arrays));

	}

	/**
	 * 完成一次建堆，最大值在堆的顶部(根节点)
	 */
	public static void maxHeapify(int[] arrays, int size) {

		for (int i = size/2-1; i >= 0; i--) {
			heapify(arrays, i, size);
		}
	}

	/**
	 * 建堆
	 *
	 * @param arrays          看作是完全二叉树
	 * @param currentRootNode 当前父节点位置
	 * @param size            节点总数
	 */
	public static void heapify(int[] arrays, int currentRootNode, int size) {
			//左子树和右字数的位置
			int left = 2 * currentRootNode + 1;
			int right = 2 * currentRootNode + 2;

			//把当前父节点位置看成是最大的
			int max = currentRootNode;

			if (left < size) {
				//如果比当前根元素要大，记录它的位置
				if (arrays[max] < arrays[left]) {
					max = left;
				}
			}
			if (right < size) {
				//如果比当前根元素要大，记录它的位置
				if (arrays[max] < arrays[right]) {
					max = right;
				}
			}
			//如果最大的不是根元素位置，那么就交换
			if (max != currentRootNode) {
				int temp = arrays[max];
				arrays[max] = arrays[currentRootNode];
				arrays[currentRootNode] = temp;

				//继续比较，直到完成一次建堆
				heapify(arrays, max, size);
			}
		}

}
