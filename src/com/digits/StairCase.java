package com.digits;

import java.util.Scanner;

/*You are climbing a stair case. 
It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

input --------> a number from the user
constriants --> no
output -------> number of ways*/
public class StairCase {

	static int fib(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no of stairs > ");
		int n = obj.nextInt();
		System.out.println("Total no of ways to climb on top >> ");
		System.out.println(fib(n));
		obj.close();
	}

}
