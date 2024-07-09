package com.freq;

import java.util.Scanner;

/*LBP270 : sentence making

The teacher in a school has started to teach the very basics rule for a sentence is that it should start with a capital letter and ends with a full stop. 
If the sentence fails any of the above mentioned criteria, it will be an incorrect sentence.
Make a program to validate whether a given statement is a correct sentence or not. 
The program should return True/False based on the validity.
*/
public class Sentence_Validation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter sentence > ");

		String str = scan.nextLine();

		scan.close();

		if ((str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') && (str.charAt(str.length() - 1) == '.')) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

//		System.out.println(str.matches("[A-Z][a-zA-Z_0-9 ]*[.]"));

	}

}

/**
 * zero or more characters + one or more characters
 * 
 * ch ---> 0 or 1 or 2 or 3 and son on ---> atleast + ch ---> 1 or 2 or 3 and
 * son on --------> atmost
 */