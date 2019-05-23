package com.xxy.bishi;
	
	import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/4/23
 * Time:20:18
 */
public class _423 {


    static	HashMap<Integer,Integer> map1=new HashMap();
	static HashMap<Integer,Integer> map2=new HashMap();



	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		int t=0;
		int k0 = 0,k1 = 0;
		int temp,number00=1,number01=1,number10=0,number11=0;
		for (int i=0;i<m;i++){
			for (int j=0;j<n;j++){
				temp=scanner.nextInt();
				int number;
				if (t==0){
					if (map1.containsKey(temp)){
						number=map1.get(temp);
						map1.put(temp,number+1);
						if (number00<number+1){
							number00=number+1;
							k0=temp;
						}else if(number01<number+1){
							number01=number+1;
						}
					}else {
						map1.put(temp,1);
					}
					t++;
				}else {
					if (map2.containsKey(temp)){
						number=map2.get(temp);
						map2.put(temp,number+1);
						if (number10<number+1){
							number10=number+1;
							k1=temp;
						}else if(number11<number+1){
							number11=number+1;
						}
					}else {
						map2.put(temp,1);
					}
					t--;
				}
			}
		}
		if (k0!=k1){
			System.out.println(n*m-number00-number10);
		}else {
			if (number01+number10<number11+number00){
				System.out.println(n*m-number00-number11);
			}else {
				System.out.println(n*m-number01-number10);
			}
		}
	}

}





//
//	static int [][] arr;
//	static HashMap<Integer,Integer> map1 = new HashMap();
//	static HashMap<Integer,Integer>  map2 = new HashMap();
//	public static void main(String[] args) {
//
//		Scanner scanner=new Scanner(System.in);
//		int m = scanner.nextInt();
//		int n = scanner.nextInt();
//		arr = new int[m][n];
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				 int x = scanner.nextInt();
//				if (i+j%2==0){
//					if (!map1.containsKey(x)){
//						map1.put(x,1);
//					}else {
//						int y = map1.get(x)+1;
//						map1.put(x,y);
//					}
//				} else{
//					if (!map2.containsKey(x)){
//						map2.put(x,1);
//					}else {
//						int y = map2.get(x)+1;
//						map2.put(x,y);
//					}
//				}
//			}
//		}
//		System.out.println(4);
//	}

