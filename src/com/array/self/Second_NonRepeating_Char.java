package com.array.self;

import java.util.Scanner;

/*LBP181 : second non-repeating character
sofia loved to play with the programs unfortunately. she got stuck in one of the questions. she tought to take help of james. james asked her the problem statement. The problem statement was.
"for the given string S of length N consist of stream of character not in predefined order. Write a program to find second non-repeating character in a string S. Write a program to help sofia and james for the given problem statements.
logic:
welcome ---> wlcm --> l
india -----> nda ---> d
indian ----> da ----> a
*/
public class Second_NonRepeating_Char {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = obj.nextLine();

		boolean u = false;

		// store unique char
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			u = true;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					u = false;
					break;
				}
			}
			if (u == true) {
				c++;
				if (c == 2) {
					System.out.println(s.charAt(i));
					break;
				}
			}

			obj.close();
		}

	}

}
