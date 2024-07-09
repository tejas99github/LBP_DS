package com.freq;

import java.util.Scanner;

/*LBP268

Be Positive 

Write a program to get two inputs from the user and find the absolute difference between the sum of two numbers and the product of two numbers.

*/
public class Diff_Sum_Product {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first no : ");
		int a = obj.nextInt();
		System.out.println("Enter second no : ");
		int b = obj.nextInt();
		obj.close();
		System.out.println(Math.abs((a + b) - (a * b)));
	}

}
