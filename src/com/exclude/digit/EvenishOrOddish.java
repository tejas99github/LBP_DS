package com.exclude.digit;

import java.util.Scanner;

/*Create a function that determines whether a number is Oddish or Evenish. 
A number is Oddish if the sum of all of its digits is Odd, 
and number is Evenish if the sum of all of its digits is even, 
if a number is Oddish return Oddish else return Evenish.*/
public class EvenishOrOddish {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = obj.nextInt();
		int s = 0, d;
		while (n != 0) {
			d = n % 10;
			s = s + d;
			n = n / 10;
		}
		System.out.println((s % 2 == 0) ? "Evenish" : "Oddish");
		obj.close();
	}

}
