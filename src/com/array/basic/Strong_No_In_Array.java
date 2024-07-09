package com.array.basic;

import java.util.Scanner;

/*sum of strong numbers in an array
Implement a program to read an array elements and print sum of all strong numbers in array.
*/

/*Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number. 
Given a number,
123 = 1! + 2! + 3! = 1+2+6 = 9 No
145 = 1! + 4! + 5! = 1+24+120 = 145 Yes
 */

public class Strong_No_In_Array {

	static int strong(int n) {
		int sum = 0;
		int fact = 1;
		while (n != 0) {
			int d = n % 10;
			for (int i = 1; i <= d; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = obj.nextInt();
		int a[] = new int[n];

		System.out.println("Enter the array element");
		for (int i = 0; i < n; i++) {

			a[i] = obj.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < n; i++) {

			if (a[i] == strong(a[i])) {

				sum = sum + a[i];
			}
		}

		System.out.println(sum);
		obj.close();
	}

}
