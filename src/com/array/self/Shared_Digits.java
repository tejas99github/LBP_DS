package com.array.self;

import java.util.Scanner;

/*Create a function that returns true if each pair of adjacent numbers in an array shares at least one digit and false otherwise.
124, 452, 589, 888	true
124, 333, 589, 888	false
*/
public class Shared_Digits {

	static boolean contains(int key, int n) {
		while (n != 0) {
			if (n % 10 == key)
				return true;
			n = n / 10;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Size or array : ");
		int n = obj.nextInt();

		int a[] = new int[n];

		System.out.println("Ele of array : ");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		int c = 0;
		for (int i = 0; i < n - 1; i++) {
			int x = a[i];
			while (x != 0) {
				if (contains(x % 10, a[i + 1]) == true) {
					c++;
					break;
				}
				x = x / 10;
			}
		}
		System.out.println(c == n - 1);
		obj.close();
	}

}
