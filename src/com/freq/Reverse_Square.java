package com.freq;

import java.util.Scanner;

/*LBP265 : mathematical tricks

Aryan is studying in the 5th standard. 
He is very interested in mathematical tricks and always wanted to play with numbers. 
Aryan would like to replace existing numbers with some other numbers. 
Today he decided to replace all digits of the number 
(which is greater than or equal to 2 digits) by its squares and print it in reverse order. 
Write a program to help him to replace numbers accordingly.
*/
public class Reverse_Square {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Ente the no  ");
		int n = obj.nextInt();
		obj.close();
		int d;
		while (n != 0) {
			d = n % 10;
			System.out.print(d * d);
			n = n / 10;
		}

	}

}
