package com.string;

import java.util.Scanner;

public class GameScore {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = obj.next();
		obj.close();
		int ac = 0;
		int bc = 0;
		int cc = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				ac++;
			}
			if (str.charAt(i) == 'B') {
				bc++;
			}
			if (str.charAt(i) == 'C') {
				cc++;
			}

		}
		System.out.println(ac + "" + bc + "" + cc);

	}

}
