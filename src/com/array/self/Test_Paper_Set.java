package com.array.self;

import java.util.Scanner;

/*LBP191 : test paper set
In an online exam, the test paper set is categorized by the letters A-Z. The students enrolled in the exam have been assigned a numeric value called application ID. To assign the test set to the student, firstly the sum of all digits in the application ID is calculated. If the sum is within the numeric range 1-26 the corresponding alphanetic set code is assigned to the student, else the sum of the digits are calcualted again and so on unitil the sum falls within the 1-26 range.
A=1
B=2
C=3
D=4
E=5
F=6
123==> 1+2+3=6 ---> F
786==>7+8+6=21 ----> U
*/
public class Test_Paper_Set {

	static int sum(int n) {
		int s = 0;
		while (n != 0) {
			s = s + (n % 10);
			n = n / 10;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = obj.nextInt();
		while (true) {
			if (n >= 1 && n <= 26) {
				System.out.println((char) (64 + n));
				break;
			} else
				n = sum(n);
		}
		obj.close();
	}

}