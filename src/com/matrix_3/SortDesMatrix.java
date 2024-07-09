package com.matrix_3;

import java.util.Arrays;
import java.util.Scanner;

/*sort all the elements in a matrix in desc order
Implement a program to sort all the elements in desc in the matrix
*/
public class SortDesMatrix {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		int a[][] = new int[3][3];
		int i, j, k;
		int b[] = new int[9];

		System.out.println("Enter the elements to add in matrices: ");

		// Input the elements of the matrix
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
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
		Arrays.sort(b); // default method for sorting

		// Rearrange the sorted elements back into a 2D array
		k = 9 - 1;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = b[k--];
			}
		}

		// Print the sorted matrix
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		obj.close();
	}

}
