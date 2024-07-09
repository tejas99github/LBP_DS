package com.exclude.digit;

import java.util.Scanner;

/*There is a great war between the even and odd numbers. 
Many numbers already lost thier life in this war and its your task to end this. 
You have to determine which group sums larger. the even, or the odd, the larger group wins.
Create a function that takes an array of integers , sums the even and odd numbers seperately, 
then return the difference between sum of even and odd numbers.*/
public class WarOfNo {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = obj.nextInt(), i, se = 0, so = 0;
		int a[] = new int[n];
		for (i = 0; i < n; i++)
			a[i] = obj.nextInt();
		for (i = 0; i < n; i++) {
			if (a[i] % 2 == 0)
				se = se + a[i];
			else
				so = so + a[i];
		}
		System.out.println(Math.abs(se - so));
		obj.close();
	}

}
/*
 * Math.abs() -> Returns the absolute value of an int value.If the argument is
 * not negative, the argument is returned.If the argument is negative, the
 * negation of the argument is returned
 */