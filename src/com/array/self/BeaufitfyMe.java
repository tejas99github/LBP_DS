package com.array.self;

import java.util.Scanner;

/*LBP174 : BeautifyMe

The cosmetic company "BeauityMe" wishes to know the alphabetic product code from the product barcode. The barcode of the product is a numeric value and the alphabeitc product is a string value tagged 'a-j'. The alphabetic range 'a-j' represents the numeric range '0-9'. To produce the alphabetic product code. each digit in the numeric barcode is replace by the corresponding matching letters.

Write an algorithm to display the alphabetic product code from the numeric barcodes.
*/
public class BeaufitfyMe {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the stirng ");
		String s = obj.nextLine();
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) - 97);
		}
		obj.close();
	}

}
