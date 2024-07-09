package com.matrix_1;

import java.util.Scanner;

/*sum of all even elements

Write a program to find sum of all even elements in the matrix.
*/
public class SumOfEvenEleMatx {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of row :");
		int row = obj.nextInt();
		System.out.println("Enter the size of column :");
		int column = obj.nextInt();

		int a[][] = new int[row][column];

		int i, j;
		int sum = 0;

		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				a[i][j] = obj.nextInt();
			}
		}

		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				if (a[i][j] % 2 == 0) {
					sum = sum + a[i][j];
				}
			}

		}
		System.out.println(sum);
		obj.close();

	}

}
