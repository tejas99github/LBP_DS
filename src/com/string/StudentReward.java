package com.string;

import java.util.Scanner;

/*You are given a string representing an attendance record for a student.
The record only contains the following three characters: 'A' : Absent. 'L' : Late. 'P' : Present. 
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.
*/
public class StudentReward {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Presenty : ");
		String s = obj.nextLine();
		obj.close();
		int ac = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A')
				ac++;
		}
		if (ac > 1 || s.contains("LLL"))
			System.out.println("No");
		else
			System.out.println("Yes");

	}

}
