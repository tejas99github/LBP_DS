package com.string;

import java.util.Scanner;

/*Say "Hello" Say "Bye"
Write a function that takes a string name and number num (either 1 or 0) and 
return "Hello"+name if number is 1, otherwise "Bye"+name.*/
public class HellowBye {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String s = obj.nextLine();
		System.out.println("Enter the no 0 or 1 : ");
		int n = obj.nextInt();
		obj.close();
		if (n == 1)
			System.out.println("Hello " + s);
		else
			System.out.println("Bye " + s);

	}

}
