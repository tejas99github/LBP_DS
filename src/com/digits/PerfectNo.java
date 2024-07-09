package com.digits;

import java.util.Scanner;

/*A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. 

Proper divisors of a number are the positive divisors that are less than the number itself.

For example, the number 6 is a perfect number because its proper divisors are 1, 2, and 3, 
and 
Another example is the number 28. Its proper divisors are 1, 2, 4, 7, and 14,  
*/
public class PerfectNo {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = obj.nextInt();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}

		}
		System.out.println((n == sum) ? "It is perfect no" : "It is not perfect no");
		obj.close();
	}

}
