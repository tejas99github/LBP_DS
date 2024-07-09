package com.exclude.string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramBuiltin {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first String ");
		char ch1[] = obj.nextLine().toCharArray();
		System.out.println("Enter first String ");
		char ch2[] = obj.nextLine().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch1, ch2));
		obj.close();
	}

}
