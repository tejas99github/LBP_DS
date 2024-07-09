package com.digits;

import java.util.Scanner;

/*Create PIN using Three given numbers

"Secure Assets Private Ltd", a small company that deals with lockers has recently started manufacturing digital locks which can be locked and unlocked using PINs (passwords). 
You have been asked to work on the module that is expected to generate PINs using three input numbers. 

The three given input numbers will always consist of three digits each 
i.e. each of them will be in the range >=100 and <=999.

Bellow are the rules for generating the PIN.

1. The PIN should made up of 4 digits.
2. The unit (ones) position of the PIN should be the least of the units position of the three numbers.
3. The tens position of the PIN should be the least of the tens position of the three input numbers.
4. The hundreds position of the PIN should be least of the hundreds position of the three numbers.
5. The thousands position of the PIN should be the max of all digits in the three input numbers.

input ----------> three numbers
constraints ----> all the numbers must be in the range of >=100 and <=999
output ---------> PIN value*/
public class Pin_Generation {

	public static int maxDigit(int n) {
		int max = 0; // 5,9
		while (n != 0) { // 915,91,9,0
			if (n % 10 > max) { // 915%10=5(5>0), 91%10=1(1>5), 9%10=9(9>5)
				max = n % 10; // 5,9
			}

			n = n / 10; // 91,9,0
		}
		return max;// 9

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the 1st No > ");
		int n1 = scan.nextInt();

		System.out.println("Enter the 2nd No > ");
		int n2 = scan.nextInt();

		System.out.println("Enter the 3rd No > ");
		int n3 = scan.nextInt();

		int d1, d2, d3, d4, pin;

		d1 = Math.min(Math.min(n1 % 10, n2 % 10), n3 % 10);
		d2 = Math.min(Math.min((n1 / 10) % 10, (n2 / 10) % 10), (n3 / 10) % 10);
		d3 = Math.min(Math.min((n1 / 100) % 10, (n2 / 100) % 10), (n3 / 100) % 10);
		d4 = Math.max(Math.max(maxDigit(n1), maxDigit(n2)), maxDigit(n3));

		pin = d4 * 1000 + d3 * 100 + d2 * 10 + d1;

		System.out.println(pin);

//		System.out.println("Max Digit : " + maxDigit(915));

		scan.close();

	}

}
