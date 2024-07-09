package com.array.self;

import java.util.Scanner;

/*LBP183

product with successor

Given an integer N and integer array A as the input, where N denotes the length of A 
write a program to find an integer the sum of all these product with successors.
*/
public class Product_With_Successor {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("enter size of array : ");
		int n = obj.nextInt();
		int a[] = new int[n];
		System.out.println("Enter ele into array ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		int sum = 0;

		for (int i = 0; i < n; i++)
			sum = sum + (a[i] * (a[i] + 1));

		System.out.println(sum);
		obj.close();
	}

}
