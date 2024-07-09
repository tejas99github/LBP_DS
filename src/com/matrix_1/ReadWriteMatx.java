package com.matrix_1;

import java.util.Scanner;

/*read and write matrix elements
Write a program to read matrix and display on the console.
*/
public class ReadWriteMatx {

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
			for (j = 0; j < column; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		obj.close();
	}

}
