package com.freq;

import java.util.Scanner;

/*LBP262 : puzzle

Dennis was solving a puzle. 
the puzzle was to verify a number whose cube ends with the number itself. 
Help Dennis to find the solution of the puzzle and write the code accordingly.

*/
public class Verify_LastDig {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = obj.nextInt();
		obj.close();
		System.out.println(n * n * n % 10 == n);

	}

}
