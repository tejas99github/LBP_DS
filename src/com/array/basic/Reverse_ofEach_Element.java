package com.array.basic;

import java.util.Scanner;

/*print reverse of each number in an array
Implement a program to print reverse of each element in an array
*/
public class Reverse_ofEach_Element {

	static int reverseNo(int n) {
		int rev = 0;
		while (n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		return rev;
	}

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");

		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Add element into array a : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		for (int i = 0; i < size; i++) {
			System.out.print(reverseNo(a[i]) + " ");
		}
		obj.close();
	}

}
