package com.matrix_2;

import java.util.Scanner;

/*find the frequency of odd and even 
 Write a program to find frequency of odd and even elements in the matrix excluding 0.
*/
public class FreqOddEven {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of row :");
		int row = obj.nextInt();
		System.out.println("Enter the size of column :");
		int column = obj.nextInt();

		int a[][] = new int[row][column];

		System.out.println("Give the Element for 3*3 Matrix ");

		int i, j;

		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				a[i][j] = obj.nextInt();
			}
		}

		int ec = 0; // even count
		int oc = 0; // odd count

		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				if (a[i][j] % 2 == 0 && a[i][j] != 0) {
					ec++;
				} else if (a[i][j] != 0) {
					oc++;
				}
			}
		}
		System.out.println("Even count : " + ec + " Odd Count : " + oc);
		obj.close();
	}

}
