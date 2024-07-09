package com.matrix_3;

import java.util.Scanner;

/*Sum of even indexed cols in matrix
Implement a program to find sum of even indexed cols in the given matrix.
*/
public class SumEvenIndexColumn {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a[][] = new int[3][3];
		int i, j, s = 0;

		System.out.println("Enter element in matrix");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (j % 2 == 0)
					s = s + a[i][j];
			}
		}
		System.out.println(s);
		obj.close();

	}

}

//logic
//colum	 0 1 2

//0 ---> 1 2 3
//1----> 4 5 6
//2 ---> 7 8 9

//1+4+7+3+6+9 =30
