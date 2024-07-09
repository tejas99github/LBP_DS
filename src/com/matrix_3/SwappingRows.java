package com.matrix_3;

import java.util.Scanner;

/*swaping of two rows
Implement a program to swap two given rows.
*/
public class SwappingRows {

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

		System.out.println("Enter the no of 1st swapping row to swap with 2nd row ");
		int m = obj.nextInt();

		System.out.println("Enter the no of 2nd swapping row to be swapped by 1st row");
		int n = obj.nextInt();

		for (i = 0; i < 3; i++) {
			temp = a[m - 1][i];
			a[m - 1][i] = a[n - 1][i];
			a[n - 1][i] = temp;
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
