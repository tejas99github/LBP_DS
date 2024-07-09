package com.matrix_2;

import java.util.Scanner;

/*max element in each row of a matrix
Implement a program to print max element in each row of a matrix
*/
public class MaxInRow {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of row :");
		int row = obj.nextInt();
		System.out.println("Enter the size of column :");
		int column = obj.nextInt();

		int a[][] = new int[row][column];

		System.out.println("Give the Element for 3*3 Matrix ");

		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			int max = a[i][0];

			for (j = 0; j < 3; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
			System.out.println(max);
			obj.close();
		}
	}
}
