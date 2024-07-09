package com.matrix_3;

import java.util.Scanner;

public class SwappingColumns {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int i, j, temp;
		System.out.println("Enter the elements in martix : ");
		int a[][] = new int[3][3];

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}

		System.out.println("Enter the no of 1st swapping column to swap with 2nd column ");
		int m = obj.nextInt();

		System.out.println("Enter the no of 2nd swapping column to be swapped by 1st column");
		int n = obj.nextInt();

		for (i = 0; i < 3; i++) {
			temp = a[i][m - 1];
			a[i][m - 1] = a[i][n - 1];
			a[i][n - 1] = temp;
		}

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		obj.close();

	}

}
