package com.array.self;

import java.util.Scanner;

/*LBP171 :Word Key

One programming language has the following keywords that cannot be used as identifiers. 
break,case,continue,default,defer,else,for,func,goto,if,map,range,return,struct,type,var

write a program to find if the given word is a keyword or not.

input ------> string from the user
con --------> con
output -----> true or false

break ----> true
class ----> false

*/
public class Word_Key {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string to check identifier or not : ");
		String s = obj.nextLine();
		String ss[] = { "break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map",
				"range", "return", "struct", "type", "var" };
		boolean flag = false;
		for (String sss : ss) {
			if (sss.equals(s)) {
				flag = true;
				break;
			}
		}
		System.out.println(flag);
		obj.close();
	}

}
