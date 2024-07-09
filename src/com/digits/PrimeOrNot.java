package com.digits;

import java.util.Scanner;

/*Write a program to check whether the given number is prime number or not. 
A number is said to prime if it is having only two factors. i.e. 1 and number itself.*/
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check prime or not : ");

		int n = scan.nextInt();

		int factor = 0; 

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				factor++;
			}
			
		}

		System.out.println((factor == 2) ? "It is Prime No" : "It is not Prime No");
		scan.close();
	}

}
