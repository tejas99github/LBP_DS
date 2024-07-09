package com.exclude.digit;

import java.util.Scanner;

public class Check_DOB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Month of Birth");
		String month = scanner.nextLine();
		
		System.out.println("Enter the date of Birth day");
		int day = scanner.nextInt();

		if (month.equalsIgnoreCase("july") && day == 5) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		scanner.close();
	}

}
