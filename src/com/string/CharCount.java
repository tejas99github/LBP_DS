package com.string;

import java.util.Scanner;

/*You are given Strings jewels representing the types of stones that are jewels, 
and stones representing the stones you have. 
Each character in stones is a type of stone you have 
you want to know how many of the stones you have are also jewels.

Letter are case sensitive. so "a" is considered as a different type of stone from "A".*/
public class CharCount {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter  String");
		String s1 = obj.nextLine(); // seek
		System.out.println("Enter character to serach ");
		String s2 = obj.nextLine(); // e
		int count = 0;

		for (int i = 0; i < s1.length(); i++) { // 0<4, 1<4, 2<4 ,3<4, 4<4
			for (int j = 0; j < s2.length(); j++) { // 0<1 
				if (s1.charAt(i) == s2.charAt(j)) { //s!=e, e==e, e==e, k!=e
					count++;		//1,2
				}
			}
		}
		System.out.println(count);
		obj.close();
	}

}
