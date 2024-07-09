package com.matrix_3;

import java.util.Scanner;

/*sort all the elements in a row in asc order
Implement a program to sort all the rowwise elements in asc order
*/
public class Row_Asc_Sort_Matrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] a = new int[3][3];
		int i, j, k, t;

		System.out.println("Enter the elements of the matrix:");

		// Input the elements of the matrix
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		// Sort each row in ascending order
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				// For each element a[i][j] in the current row,
				// compare it with all subsequent elements in the row
				for (k = j + 1; k < 3; k++) {
					if (a[i][j] > a[i][k]) { // reverse the comparison condition for descending order if required
						// Swap elements if they are out of order
						t = a[i][j];
						a[i][j] = a[i][k];
						a[i][k] = t;
					}
				}
			}
		}

		// Print the sorted matrix
		System.out.println("Sorted Matrix:");

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}
}
