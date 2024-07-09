package com.matrix_3;

import java.util.Scanner;

/*print diagonal elements
Implement a program to read a matrix and display only diagonal elements.
*/
public class PrintDiagonalEle {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a[][] = new int[3][3];
		int i, j;

		System.out.println("Enter element into matrix  :");

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i == j)
					System.out.print(a[i][j] + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		obj.close();
	}

}
