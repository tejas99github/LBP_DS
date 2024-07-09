package com.freq;

import java.util.Scanner;

/*LBP253 : encrypted digits

A company trasfers an encrypted code to one of its clients. 
The code needed to be decrypted so that it can be used for accessing all the required information. 
The code can be decrypted by interchanging each consecutive digit and once if the digit got interchanged then it cannot be used again. 
If at a certain point there is no digits to be interchanged with, then that single digit must be left as it is.

Write an algorithm to decrypt the code so that it can be used to access the required information.
*/
public class Digit_Interchange {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter size of array : ");

		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter array elements : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = obj.nextInt();
		}

		obj.close();
		int i;

		if (size % 2 == 0) {
			for (i = 0; i < size; i = i + 2)
				System.out.print(a[i + 1] + " " + a[i] + " ");
		} else {
			for (i = 0; i < size - 1; i = i + 2)
				System.out.print(a[i + 1] + " " + a[i] + " ");
			System.out.print(a[i]);
		}

	}

}
