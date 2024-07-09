package com.freq;

import java.util.Scanner;

/*LBP259 : Morning Prayer

Student of a school are assembled in a straight line for the morning prayer. 
To uplift the sprit of the students, an exercise is conducted. 
THe initial letter of all the student's names is noted down(str). 
The task here is to substitute the intitial letters in the list with consonants 
such that if the initial letter of the student is a vowel, retain the student in the same position.

If the initial letter of the student is a vowel, swap with the next immediate consonants from the english alphabet sequence (a-z). 
Say, initial letter of a student starts with b swap with c, next immediate consonant. 
If the initial letter is 'z' swap with 'b'.

welcome -----> xemdone
*/
public class Print_String_witn_nxt_consonent {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter stirng : ");
		String s = obj.nextLine();
		obj.close();
		int i;
		char ch;
		for (i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				System.out.print(ch);
			else {
				char ch1 = ch;
				if (ch1 == 'z')
					ch1 = 'a';
				ch1++;
				if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
					ch1++;
				System.out.print(ch1);
			}
		}

	}

}
