package com.array.self;

import java.util.Scanner;

/*LBP163 : Find the Single Number
Write a function that accepts an array of numbers (where each number appears three times except for one which appears only once) and finds that unique number in the array and returns it.
*/
public class SingleNumber {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("enter size : ");
		int n = obj.nextInt();
		int[] a = new int[n];

		System.out.println("enter element : ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		for (int i = 0; i < n; i++) {
			int t = 0;
			for (int j = 0; j < n; j++) {
				if (i != j && a[i] == a[j])
					t++;
			}
			if (t == 0)
				System.out.println(a[i]);
		}
		obj.close();
	}

}
