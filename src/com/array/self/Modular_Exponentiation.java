package com.array.self;

import java.util.Scanner;

/*LBP196 : modular exponentiation

Given three numbers b,e, and m. 
fill in a function that takes these three positive integer values and outputs b^e mod m.

input ------> b,e and m values
con --------> no
output -----> b^e mod m

formula: (b^e)%m
*/
public class Modular_Exponentiation {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter value of base : ");
		int b = obj.nextInt();
		System.out.println("enter value of exponentiation : ");
		int e = obj.nextInt();
		System.out.println("enter value of mod : ");
		int m = obj.nextInt();
		System.out.println((int) Math.pow(b, e) % m);
		obj.close();
	}

}
