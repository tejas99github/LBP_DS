package com.array.self;

import java.util.Scanner;

/*LBP162 : Count 5s And Win
Arun is obsessed with primes, especially five. 
He considers a number to be luckiest if it has the highest number of five in it. 
If two numbers have the same frequency of five, Arun considers the last occurence of them to be luckiest, 
and if there is no five in any number, the first given number is considered luckiest. 
Help him choose the luckiest number.
*/
public class Count_5S_And_Win {

	static int contains(int n) {
		int c = 0;
		while (n != 0) {
			if (n % 10 == 5)
				c++;
			n = n / 10;
		}
		return c;
	}

	public static void main(String args[]) throws Exception {
		Scanner obj = new Scanner(System.in);
		System.out.println("ente size");
		int n = obj.nextInt();

		int a[] = new int[n];
		System.out.println("ente ele");
		for (int i = 0; i < n; i++)
			a[i] = obj.nextInt();

		int c = 0;// to keep track of the maximum count of occurrences of digit 5,
		int cc = 0;// the count of numbers without digit 5,
		int element = 0;// the luckiest number respectively.

		for (int i = 0; i < n; i++) {
			int x = contains(a[i]);
			if (c <= x) {
				c = x;
				element = a[i];
			}
			if (x == 0)
				cc++;
		}
		System.out.println((cc == n) ? a[0] : element);
		obj.close();
	}
}
