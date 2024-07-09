package com.string;

/*Given a string containing unique letters, 
return a sorted string with the letters that don't appear in the string.
*/
import java.util.Scanner;

public class MissingLetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the alpha line : ");
		String s = scanner.next();
		scanner.close();
		int[] a = new int[256]; // Assuming ASCII character set

		for (int i = 0; i < s.length(); i++) {
			a[(int) s.charAt(i)]++;
		}

		for (int i = 97; i <= 122; i++) {
			if (a[i] == 0) {
				System.out.print((char) i);
			}
		}
	}
}
