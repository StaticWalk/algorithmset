package com.xxy.jianzhioffer;

/**
 * Created by xiongxiaoyu
 * Data:2019/3/20
 * Time:21:30
 *
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示
 * 它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。例
 * 如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 *
 */
public class Regular {


	public boolean match(char[] str, char[] pattern)
	{
		int s=0;
		int p=0;

		for (int j = 0; j < pattern.length; j++) {

			while (pattern[j+2] != '.' && pattern [j+1] != '*'){
				if (str[s] != pattern[p]){
					return false;
				}
				s++;
				p++;
			}
			if (pattern[j+1] == '.'){

			}



		}


		return  true;

	}

	public static void main(String[] args) {


	}

}
