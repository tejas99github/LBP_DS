package com.string;

import java.util.Scanner;

/*Integer to English Words
Convert a non-negative integer num to its English words representation.
*/
public class IntToEngWord {
	static String[] belowten = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
	static String[] belowtwenty = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
			"Seventeen", "Eighteen", "Nineteen" };
	static String[] belowhundred = { "", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	static String helpme(int n) {
		String result = "";
		if (n < 10) {
			result = belowten[n];
		} else if (n < 20) {
			result = belowtwenty[n];
		} else if (n < 100) {
			result = belowhundred[n / 10] + " " + helpme(n % 10);
		} else if (n < 1000) {
			result = helpme(n / 100) + " Hundred " + helpme(n % 100);
		} else if (n < 10000)
			result = helpme(n / 1000) + " Thousand " + helpme(n % 1000);
		return result;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter digits to convert in words");
		int n = obj.nextInt();
		obj.close();
		if (n == 0)
			System.out.println("Zero");
		else
			System.out.println(helpme(n));

	}
}
