package com.array.self;

import java.util.Scanner;

/*LBP200 : Perfect Math

Perfect math is an online math program. In once of the assignments the system displays a list of N number and a value K, and students need to calculate the sum of remainders after dividing all the numbers from the list of N numbers by K. The system need to develop a program to calcualte the correct answer for the assignment.

Write an algorithm to calcualte the correct answer for the assignment.

input -----> size N and N elements and K value
con -------> no
output ----> an int value.
*/
public class Perfect_Math {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = obj.nextInt();
		int a[] = new int[n];
		System.out.println("Enter element in array : ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();
		System.out.println("Enter value : ");
		int k = obj.nextInt();
		int s = 0;
		for (int i = 0; i < n; i++) {
			s = s + a[i] % k;
		}
		System.out.println(s);
		obj.close();
	}

}
