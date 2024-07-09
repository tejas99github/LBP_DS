package com.matrix_3;

import java.util.Scanner;

/*sort all the elements in a matrix in asc order
Implement a program to sort all the elements in asc order in the matrix
*/
public class SortAscMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] a = new int[3][3];
		int[] b = new int[9];

		int i, j, t, k;

		System.out.println("Enter the elements to add in matrices: ");

		// Input the elements of the matrix
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		// Flatten the matrix into a 1D array
		k = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				b[k++] = a[i][j];
			}
		}

		// Sort the 1D array
		for (i = 0; i < k; i++) {
			for (j = i + 1; j < k; j++) {
				if (b[i] < b[j]) {// Reverse the comparison condition for descending order if required
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}

		// Rearrange the sorted elements back into a 2D array
		k = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = b[k++];
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
