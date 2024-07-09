package com.matrix_3;

import java.util.Scanner;

/*Symmetric matrix
Implement a program to read a matrix and check whether the given matrix is symmertric matrix or not
*/
public class Symmetric_Matrix {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a[][] = new int[3][3];
		int i, j, c = 0;

		System.out.println("Enter element into matrix  :");

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (a[i][j] == a[j][i])
					c++;
			}
		}
		System.out.println((c == 9) ? "Yes" : "No");
		obj.close();
	}

}

// example : 
//  1 0 0
//  0 1 0
// 	0 0 1

//  1 2 3
//  2 0 5
//  3 5 8
