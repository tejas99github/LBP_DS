package com.array.self;

import java.util.Scanner;

/*LBP180 : parity bits

Michael wants to check the parity of the given number. To find the parity, follow below steps.

1. convert decimal number into binary number.
2. count the number of 1's and 0's in the binary representation.

if it contains odd number of 1-bits, then it is "odd parity" and if contains even number of 1-bits then "even parity" 
Write a program to validate the given number belongs to odd parity or even parity.

*/
public class Parity_Bits {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n, c = 0;
		n = obj.nextInt();
		while (n != 0) {
			if (n % 2 == 1)
				c++;
			n = n / 2;
		}
		System.out.println((c % 2 == 0) ? "even" : "odd");
		obj.close();
	}

}
