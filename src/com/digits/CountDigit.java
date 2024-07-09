package com.digits;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scanner.nextInt();
		int counter = 0;
		while (n != 0) { // 150,15,1
			counter++;
			n = n / 10;
		}
		System.out.println("Total count of digit is : " + counter);

		// By taking predefined method
//		System.out.println("Enter number : ");
//		
//		String strNo = scanner.nextLine();
//
//		// Call the replaceAll() method to remove all white spaces
//		strNo = strNo.replaceAll("\\s", "");
//
//		System.out.println(strNo);
//
//		System.out.println(strNo.length());

		scanner.close();
	}
}
