package com.array.basic;

import java.util.Scanner;

/*reading and writing an array
Implement a program to read an array element and write on the screen.
*/
public class ReadWriteArray {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Ente the element : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}

		obj.close();
	}

}
