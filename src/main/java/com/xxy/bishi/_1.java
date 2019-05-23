package com.xxy.bishi;

import java.util.Scanner;

/**
 * Created by xiongxiaoyu
 * Data:2019/4/14
 * Time:11:16
 */
public class _1 {

	static int[][] area = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[10][10];
		int row = 0;
		int col = 0;
		while (scanner.hasNext()) {
			String[] temp = scanner.nextLine().split(" ");
			for (int i = 0; i < temp.length; i++) {
				arr[row][i] = temp[i].charAt(0) - '0';
			}
			col = temp.length;
			row++;
		}
		int count = 0;
		while (true) {
			boolean isChange = false;

			boolean[][] visited = new boolean[row][col];

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {

					if (arr[i][j] == 2 || arr[i][j] == 0) {
						continue;
					}

					boolean flag = false;
					for (int k = 0; k < 4; k++) {

						int posX = i + area[k][0];
						int posY = j + area[k][1];

						if (posX < 0 || posX >= row || posY < 0 || posY >= col
								|| arr[posX][posY] == 0 || arr[posX][posY] == 1) {
							continue;
						}

						if (visited[posX][posY]) {
							continue;
						}
						flag = true;
					}
					if (flag) {
						arr[i][j] = 2;
						visited[i][j] = true;
						isChange = true;
					}
				}
			}
			if (!isChange) {
				break;
			}
			count++;
		}
		boolean flag = true;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == 1) {
					flag = false;
					break;
				}
			}
			if (!flag) {
				break;
			}
		}
		System.out.println(flag ? count : "-1");
	}

}