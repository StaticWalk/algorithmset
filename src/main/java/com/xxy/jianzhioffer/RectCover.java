package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/23
 * Time:19:29
 *
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无
 * 重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * 典型的递归
 *
 */

public class RectCover {


	public int RectCover(int target) {

		if(target < 4){
			return target;
		}
		else {
			return RectCover(target-1)+RectCover(target-2);
		}

	}
}
