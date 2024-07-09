package com.string;

import java.util.Scanner;

public class ShuffleName {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Firstname");
		String s1 = obj.nextLine();
		System.out.println("Enter Lasname");
		String s2 = obj.nextLine();
		System.out.println(s2 + " " + s1);
		obj.close();
	}

}
