package com.string;

import java.util.Scanner;

/*Print all permutations of a string

Given a string str, the task is to print all the permutations of str.
A permutation is an arrangement of all or part of a set of objects, 
with regard to the order of the arrangement. For instance, the words  
bat  and  tab  represents two distinct permutation (or arrangements) of a 
similar three letter word.

*/
public class PermutationOfString {

	public static void permute(String s, int left, int right) {
		if (left == right)
			System.out.print(s + " ");
		else {
			for (int i = left; i <= right; i++) {
				s = swap(s, left, i);
				permute(s, left + 1, right);
				s = swap(s, left, i);
			}
		}
	}

	static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Give a String : ");
		String s = obj.nextLine();
		permute(s, 0, s.length() - 1);
		obj.close();
	}

}
