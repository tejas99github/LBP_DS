package com.matrix_1;

import java.util.Scanner;

/*row wise sum in matrix
Write a program to find row wise sum in the matrix.
*/
public class RowWiseSuminMatx {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of row :");
		int row = obj.nextInt();
		System.out.println("Enter the size of column :");
		int column = obj.nextInt();

		int a[][] = new int[row][column];

		int i, j;

		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				a[i][j] = obj.nextInt();
			}
		}

		for (i = 0; i < row; i++) {
			int sum = 0;
			for (j = 0; j < column; j++) {

				sum = sum + a[i][j];

			}
			System.out.println(sum);
		}

		obj.close();

	}

}
