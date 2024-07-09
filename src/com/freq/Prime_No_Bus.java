package com.freq;

import java.util.Scanner;

/*LBP269 : Prime Number Busses

James wants to travel by bus to reach his friend John's home. 
John gave a hint that all busses from Jame's location will reach his home 
if the bus number is prime number.
Write a program to help James find the bus that reaches John's home.
*/
public class Prime_No_Bus {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter bus no : ");
		int n = obj.nextInt(), i, f;
		obj.close();
		f = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0)
				f++;
		}
		System.out.println((f == 2) ? "yes" : "no");

	}

}
