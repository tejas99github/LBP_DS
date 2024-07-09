package com.freq;

import java.util.Scanner;

/*LBP266 : coding standards

Tom has joined a new company and he is assigned a program to code. 
But before starting to code, he needs to know the coding standards. 
He need to make sure that the variable name should meet the below standards, 

=> contains only english letter
=> and/or digits
=> and/or underscore (_)
=> should not start with digits

The program should return True/False based on the above conditions
*/
public class Coding_Standard {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter stirng : ");
		String s = obj.nextLine();
		obj.close();
		System.out.println(s.matches("[a-zA-Z_][a-zA-Z0-9_]+"));

	}

}
