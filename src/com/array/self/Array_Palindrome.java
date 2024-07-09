package com.array.self;

import java.util.Scanner;

/*LBP168 : Array pliandrome

Implement a program to check whether an array is paliandrome or not.
*/
public class Array_Palindrome {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no : ");
		int n = obj.nextInt();
		int a[] = new int[n];
		System.out.println("Enter ele : ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		boolean flag = true;

		int low = 0;
		int high = n - 1;
		while (low <= high) {
			if (a[low] != a[high]) {
				flag = false;
				break;
			}
			low++;
			high--;
		}
		System.out.println(flag);
		obj.close();
	}

}
