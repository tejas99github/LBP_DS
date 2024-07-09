package com.exclude.digit;

import java.util.Scanner;

/*A company wishes to devise an order confirmation procedure. 
They plan to require an extra confirmation instead of simply auto-confirming 
the order at the time it is placed. for this purpose, 
the system will generate one time password to be shared with the customer. 
The customer who is placing the order has to enter the OTP to confirm the order. 
The OTP generated for the requested order ID, as the product of the digits in orderID. 
*/
public class OTP {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the order no ");
		int n = obj.nextInt(), p, d;
		p = 1;
		while (n != 0) {
			d = n % 10;
			p = p * d;
			n = n / 10;
		}
		System.out.println(p);
		obj.close();
	}
}
