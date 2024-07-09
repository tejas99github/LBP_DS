package com.matrix_2;

import java.util.Scanner;

/*min element in each row of a matrix
Implement a program to print min element in each row of a matrix
*/
public class MinInRow {

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
			int min = a[i][0];

			for (j = 0; j < 3; j++) {
				if (min > a[i][j]) {
					min = a[i][j];
				}
			}
			System.out.println(min);
			obj.close();

		}
	}
}
