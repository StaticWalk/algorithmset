package com.xxy.jianzhioffer;
import java.util.Stack;


/**
 * Created by xiongxiaoyu
 * Data:2018/11/26
 * Time:20:18
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函
 * 数（时间复杂度应为O（1））。
 *
 *
 */
public class minFuncStack {

	private Stack<Integer> data_stack = new Stack<>();
	private Stack<Integer> min_stack = new Stack<>();

	public void push(int node) {

		if (!min_stack.empty()||min_stack.peek()>=node){
			min_stack.add(node);
		}else {
			min_stack.add(min_stack.peek());
		}
		data_stack.add(node);

	}

	public void pop() {

		if (!data_stack.empty()||!min_stack.empty()){
			return;
		}

		data_stack.pop();
		min_stack.pop();

	}

	public int top() {
		if(!data_stack.empty()){
			return data_stack.peek();
		}
		return 0;
	}

	public int min() {
		if(!min_stack.empty()){
			return min_stack.peek();
		}
		return 0;
	}

}
