package com.freq;

import java.util.Scanner;

/*LBP256 : GlobalAdd

The media compnay "GlobalAdd" has received a batch of advertisements from different product brands. 
The batch of advertisements is a numeric value where each digit represnets the number of advertisements the media company has received from different product brands. 
Since the company banners permit only even numbers of advertisements to be displayed, 
the media company needs to know the totoal number of advertisements it will be able to display from the given batch.

Write an algorithm to calculate the total number of advertisements that will be displayed from the batch.
*/
public class Even_No_Count {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n = obj.nextInt();
		obj.close();
		int d, c = 0;
		while (n != 0) {
			d = n % 10;
			if (d % 2 == 0)
				c++;
			n = n / 10;
		}
		System.out.println(c);

	}

}
