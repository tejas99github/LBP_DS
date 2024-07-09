package com.matrix_3;

import java.util.Scanner;

/*Count of prime digits in the given matrix
Implement a program to count number of prime digits present in the matrix.
*/
public class CountPrimeDigit {

	static int pc(int n) {
		int c = 0, d;
		while (n != 0) {
			d = n % 10;
			if (d == 2 || d == 3 || d == 5 || d == 7)
				c++;
			n = n / 10;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a[][] = new int[3][3];
		int i, j, c = 0;
		System.out.println("Enter the element in matrix");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = obj.nextInt();
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				c = c + pc(a[i][j]);
			}
		}
		System.out.println(c);
		obj.close();
	}

}

//given matrix :
//10 11 12
//13 14 15
//16 17 18
//	initial count :  0
//10 ----> 0+0 = 0
//11 ----> 0+0 = 0
//12 ----> 0+1 = 1
//13 ----> 1+1 = 2
//14 ----> 2+0 = 2
//15 ----> 2+1 = 3
//16 ----> 3+0 = 3
//17 ----> 3+1 = 4
//18 ----> 4+0 = 4
//final result:
//4
