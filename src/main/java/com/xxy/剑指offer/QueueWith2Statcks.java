package com.xxy.剑指offer;

import java.util.Stack;

/**
 * Created by xiongxiaoyu
 * Data:2018/11/7
 * Time:19:18
 *
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class QueueWith2Statcks {

	/**
	 * 栈先进后出，队列先进先出
	 *
	 * stack1来添加新的元素，stack2如果为空就补充stack1中的全部元素，
	 * 取出队列中的元素直接stack2.pop(),取出最上面的元素实现
	 */

	Stack<Integer> stack1 = new Stack();
	Stack<Integer> stack2 = new Stack();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop()  {

		if (stack2.empty()){
			while(!stack1.empty())
			{
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}
