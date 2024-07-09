package com.array.self;

import java.util.Scanner;

/*Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".
*/
public class SevenBoom {

	static boolean contains(int n) {
		while (n != 0) {
			if (n % 10 == 7)
				return true;
			n = n / 10;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = obj.nextInt(), i;
		int a[] = new int[n];
		System.out.println("Enter the ele : ");
		for (i = 0; i < n; i++)
			a[i] = obj.nextInt();
		
		boolean flag = false;
		
		for (i = 0; i < n; i++) {
			if (contains(a[i])) {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "Boom!" : "there is no 7 in the array");
		obj.close();
	}

}
