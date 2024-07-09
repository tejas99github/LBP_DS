package com.matrix_2;

import java.util.Scanner;

/*min element in matrix
Implement a program to print min element in an matrix
*/
public class MinEleinMatrx {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of row :");
		int row = obj.nextInt();
		System.out.println("Enter the size of column :");
		int column = obj.nextInt();

		int a[][] = new int[row][column];

		System.out.println("Give the Element for 3*3 Matrix ");

		int i, j;

		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				a[i][j] = obj.nextInt();
			}
		}

		int min = a[0][0];

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (min > a[i][j]) {
					min = a[i][j];
				}
			}

		}
		System.out.println(min);
		obj.close();

	}

}
