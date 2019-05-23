package com.xxy.bishi;

/**
 * Created by xiongxiaoyu
 * Data:2019/4/22
 * Time:19:57
 */
public class _422 {

	public static void main(String[] args) {


		String sb = new StringBuilder("jaa").append("va").toString();
		System.out.println(sb.intern() == sb);

	}


}
