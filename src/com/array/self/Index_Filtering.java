package com.array.self;

import java.util.Scanner;

/*Create a function that takes two inputs: idx (an array of integers) and str (a string).
The function should return another string with the letters of str at each index in idx in order.

input ----------> a string followed by size and an array
constraint -----> output must be in lower case but input many not be.
output ---------> a string contained in the specified locations given in the array.
logic:
She is the love of my love
3
7 11 14

tle

*/
public class Index_Filtering {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the string : ");
		String s = obj.nextLine();

		System.out.println("Enter size of array : ");
		int n = obj.nextInt();

		int a[] = new int[n];

		System.out.println("Enter element in array");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		for (int i = 0; i < n; i++)
			System.out.print(s.charAt(a[i]));

		obj.close();
	}

}
