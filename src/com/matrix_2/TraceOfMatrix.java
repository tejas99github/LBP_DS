package com.matrix_2;

import java.util.Scanner;

/*trace of the given matrix
Implement a program to find trace(sum of diagonal elements) of the given matrix.
*/
public class TraceOfMatrix {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the matrix element");
		int a[][] = new int[3][3];
		int i, j, s;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		s = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i == j)
					s = s + a[i][j];
			}
		}
		System.out.println(s);
		obj.close();
	}

}
