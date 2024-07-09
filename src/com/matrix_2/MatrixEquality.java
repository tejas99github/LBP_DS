package com.matrix_2;

import java.util.Scanner;

/*two matrices are equal or not
Implement a program to check whether the given matrices are equal or not
*/
public class MatrixEquality {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 3*3 Matrices a and b");
		int i, j;
		boolean flag = true;
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				b[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (a[i][j] != b[i][j]) {
					flag = false;
					break;
				}
			}
		}
		System.out.println((flag) ? "Yes" : "No");

		obj.close();

	}

}
