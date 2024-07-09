package com.digits;

import java.util.Scanner;

/*Palindrome number in java: A palindrome number is a number that is same after reverse. 
 * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
 */
public class Palindrome_No {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no to check palindrome or not : ");
		int n = scanner.nextInt();
		int reverse = 0;
		int temp = n;
		while (n != 0) { // 343,34, 3 ,0
			int d = n % 10; // 343%10=3, 34%10=4, 3%10=3
			reverse = reverse * 10 + d; // 0*10+3=3, 3*10+4=34, 34*10+3=343
			n = n / 10; // 34, 3, 0
		}
		System.out.println((temp == reverse) ? "It is Palindrome No !" : "It is not Palindrome No ! ");
		scanner.close();
	}

}
