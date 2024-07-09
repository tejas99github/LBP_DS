package com.array.basic;

import java.util.Scanner;

/*increment every element in an array by one unit
Implement a program to increment every element by one unit in array.
*/
public class Increment_Ele_By1Unit {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter element in to array : ");

		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		for (int i = 0; i < size; i++) {
			System.out.print((a[i] + 1) + " ");
		}
		obj.close();
	}

}
