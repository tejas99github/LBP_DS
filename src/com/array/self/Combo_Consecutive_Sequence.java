package com.array.self;

import java.util.Arrays;
import java.util.Scanner;

/*Write a function that returns true if two arrays, when combined, form a consecutive sequence. 
A consecutive sequence is a sequence without any gaps in the integers, 
e.g. 1, 2, 3, 4, 5 is a consecutive sequence, but 1, 2, 4, 5 is not.
*/
public class Combo_Consecutive_Sequence {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Size of 1st array ");
		int n1 = obj.nextInt();
		int a[] = new int[n1];
		System.out.println("Enter ele in 1st array ");
		for (int i = 0; i < n1; i++)
			a[i] = obj.nextInt();

		System.out.println("Size of 2nd array ");
		int n2 = obj.nextInt();
		int b[] = new int[n2];

		System.out.println("Enter ele in 2nd array ");
		for (int i = 0; i < n2; i++)
			b[i] = obj.nextInt();

		int j = 0;

		int c[] = new int[n1 + n2];

		for (int i = 0; i < n1; i++)
			c[j++] = a[i];

		for (int i = 0; i < n2; i++)
			c[j++] = b[i];

		Arrays.sort(c);

		int count = 0;

		for (int i = 0; i < (n1 + n2) - 1; i++) {
			if (c[i] + 1 == c[i + 1])
				count++;
		}
		System.out.println(count == (n1 + n2) - 1);
		obj.close();
	}

}
