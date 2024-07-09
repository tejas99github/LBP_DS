package com.exclude.digit;

import java.util.Scanner;

public class C_To_F {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Temperature in Celsius");

		int celsius = scanner.nextInt();

		// Celsius (°C) scale to its Fahrenheit (°F) formula
		int fahrenheit = (celsius * 9 / 5) + 32;

		System.out.println("Temperature in fahrenheit is : " + fahrenheit);

		scanner.close();
	}

}
