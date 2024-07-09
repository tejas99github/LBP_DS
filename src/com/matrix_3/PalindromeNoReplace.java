package com.matrix_3;

import java.util.Scanner;

/*Keep paliandrome number and replace remaining with 0's
Implement a program to keep all paliandrome numbers as it is and replace remaining with 0.
*/
public class PalindromeNoReplace {

	static int reverse(int n) {
		int r = 0;
		while (n != 0) {
			int d = n % 10;
			r = r * 10 + d;
			n = n / 10;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a[][] = new int[3][3];
		int i, j;
		System.out.println("Enter the element in matrix");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (a[i][j] == reverse(a[i][j])) {
					System.out.print(a[i][j] + " ");
				} else {
					System.out.print("0  ");
				}
			}
			System.out.println();
		}

		obj.close();

	}

}
