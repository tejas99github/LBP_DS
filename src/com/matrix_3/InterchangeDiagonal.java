package com.matrix_3;

import java.util.Scanner;

/*interchange the diagonals
Program to accept a matrix of order 3x3 & interchange the diagonals.
*/
public class InterchangeDiagonal {

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

		for (i = 0; i < 3; i++) {
			temp = a[i][i];
			a[i][i] = a[i][3 - i - 1];
			a[i][3 - i - 1] = temp;
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

/*
 * i=0 ==> 1 2 3 i=1 ==> 4 5 6 i=2 ==> 7 8 9
 * 
 * a[i][i] a[i][3-i-1]
 * 
 * diagonal elements ====> a[0][0],a[1][1],a[2][2] ===> 1, 5, 9 diagonal
 * elements ====> a[0][2],a[1][1],a[2][0] ===> 3, 5, 7
 * 
 * swap a[i][i] and a[i][3-i-1]
 */