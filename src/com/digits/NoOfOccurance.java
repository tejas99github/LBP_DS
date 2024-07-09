package com.digits;

import java.util.Scanner;

/*Number of Occurrences

Program to find number of occurences of the given digit in the number n

input ------> two numbers n and d
constraints-> no constraints
output -----> number of occurrences*/
public class NoOfOccurance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the No : ");
		int n = scanner.nextInt();
		System.out.println("Enter the Key No");
		int key = scanner.nextInt();
		int count = 0;
		while (n != 0) {
			if (n % 10 == key) {
				count++;
			}
			n = n / 10;
		}
		System.out.println("Total no of occurance of Key is : " + count);
		scanner.close();
	}

}
