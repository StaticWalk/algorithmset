package com.xxy.jianzhioffer;

import java.util.Arrays;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/29
 * Time:16:45
 *
 *
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 */
public class SerializeBTree {

	static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}


	static int index = -1;

	 static String Serialize(TreeNode root) {

		StringBuffer sb = new StringBuffer();


		if (root == null){
			sb.append("#");
			return sb.toString();
		}
		sb.append(root.val);
		sb.append(Serialize(root.left));
		sb.append(Serialize(root.right));

		return sb.toString();

	}



	 static TreeNode Deserialize(String str) {

		if (str == null){
			return null;
		}

		char[] chars = str.toCharArray();

		System.out.println(Arrays.toString(chars));

		return DeserializeStr(chars);

	}

	static TreeNode DeserializeStr(char[] strSeg){

		index++;
		TreeNode treeNode = null;
		//字符串比较大小：== 不仅内容相同，引用地址也要相同（String类是不变类）！ .equals(""):内容相同即可
		if('#' != strSeg[index]){
			//新建此结点,字符串和包装类的转换
			treeNode = new TreeNode(Integer.valueOf(strSeg[index]));
			treeNode.left = DeserializeStr(strSeg);
			treeNode.right = DeserializeStr(strSeg);
		}

		return treeNode;
	}


	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
//		t1.left = null;
		t1.right = t3;

		System.out.println(Deserialize("1#3##").right.val);

	}

}
