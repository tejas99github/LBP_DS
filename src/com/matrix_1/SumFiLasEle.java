package com.matrix_1;

import java.util.Scanner;

/*sum of first and last element in the matrix
Write a program to find sum of first and last element in a matrix.
*/
public class SumFiLasEle {

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

		System.out.println(a[0][0] + a[2][2]);

		obj.close();
	}

}
