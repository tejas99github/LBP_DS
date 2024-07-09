package com.string;

/*Email name should be starts with alphabet and should follw by number or underscore. 
It should contains either numbers or underscore finally ends with @gmail.com only, 
Then given email id is true otherwise false.*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the email: ");
		String email = scanner.next();
		isValidEmails(email);
		scanner.close();
	}

//	static boolean isValidEmail(String email) {
//		int i;
//		for (i = 0; i < email.length() && Character.isAlphabetic(email.charAt(i)); i++)
//			;
//
//		if ((i == 0 && Character.isDigit(email.charAt(i))) || (i == 0 && email.charAt(i) == '_'))
//			return false;
//		else if (Character.isDigit(email.charAt(i))) {
//			i++;
//			if (email.charAt(i) != '_' && email.substring(i).equals("@gmail.com"))
//				return true;
//			else
//				return false;
//		} else if (email.charAt(i) == '_' && email.substring(i + 1).equals("@gmail.com"))
//			return true;
//		else
//			return false;
//	}

	static void isValidEmails(String email) {

		System.out.println("Built in method ");
		Pattern p = Pattern.compile("[a-z]+[_|0-9]@gmail[.]com"); // [_|0-9] means only once
		// Pattern p = Pattern.compile("[a-z]+[_|0-9]+@gmail[.]com"); // + means one or
		// more
		// Pattern p = Pattern.compile("[a-z]+[_|0-9]*@gmail[.]com"); // * means may or
		// may not
		// Pattern p = Pattern.compile("[a-z]+[_|0-9]?@gmail[.]com"); //? means exactly
		// once
		Matcher m = p.matcher(email);
		
		System.out.println(m.find() && m.group().equals(email));

	}
}
