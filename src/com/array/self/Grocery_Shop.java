package com.array.self;

import java.util.Scanner;

/*LBP193 : Grocery Shop
There was a grocery shop. Shopkeeper would like to keep trasactions as simple as he can. Hence, he used to take money as whole number. 
To optimize trasactions, he decided if someone buys groceries from his shop, he will round money to the nearest whole number having zeros as last digit. 
Write a program to help shopkeeper to make trasactions much simple.
*/
public class Grocery_Shop {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = obj.nextInt();
		while (true) {
			if (n % 10 == 0) {
				System.out.println(n);
				break;
			} else
				n++;
		}
		obj.close();
	}

}
