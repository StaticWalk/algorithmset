package com.xxy.jianzhioffer;

import java.util.Stack;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/27
 * Time:18:43
 *
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的
 * 弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序
 * 列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列
 * 的弹出序列。（注意：这两个序列的长度是相等的）
 *
 * 别人的思路非常好
 * 入栈的时候也可以出栈
 * 借助一个辅助栈，通过出栈的顺序来回退入栈时的操作
 *
 */
public class DequeueOrder {

	public boolean IsPopOrder(int [] pushA,int [] popA) {
		if (pushA.length<=0||popA.length<=0){
			return false;
		}

		int index = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < pushA.length; i++) {

			stack.add(pushA[i]);
			while (!stack.empty()&&stack.peek()==popA[index]){
					stack.pop();
					index++;
			}
		}
		return stack.empty();
	}

}
