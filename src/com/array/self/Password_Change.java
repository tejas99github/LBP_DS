package com.array.self;

import java.util.Scanner;

/*LBP194 : Password change

Prakash a technical person wants to update his password for every 
15 days, to create a new password, he is converting all lower case letters to upper case and upper case 
letters to lower case, help prakash to update password. 
*/
public class Password_Change {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the current pwd : ");
		String s = obj.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				System.out.print((char) (s.charAt(i) - 32));
			else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				System.out.print((char) (s.charAt(i) + 32));
		}
		obj.close();
	}

}
