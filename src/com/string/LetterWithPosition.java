package com.string;

/*Replace Letters With Position In Alphabet
Create a function that takes a string and replaces each letter with its appropriate position in the alphabet. 
"a" is 1, "b" is 2, "c" is 3, etc, etc.
Note: If any character in the string isn't a letter, ignore it.
abc ---> 123

a-96=97-96=1
b-96=98-96=2
c-96=99-96=3 and so on

*/
import java.util.Scanner;

public class LetterWithPosition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the letters : ");
		String s = scanner.nextLine();
		scanner.close();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				// Convert uppercase to lowercase by adding 32
				ch = (char) (ch + 32);
			}
			if (ch >= 'a' && ch <= 'z') {
				// Print the position in the alphabet (a=1, b=2, ..., z=26)
				System.out.print((int) (ch - 'a' + 1) + " ");
			}
		}
	}
}
