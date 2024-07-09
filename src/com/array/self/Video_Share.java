package com.array.self;

import java.util.Scanner;

/*LBP195 : Video share
Video share is an online video sharing platform. The company has decided to rate its users channels based on the sum total of the number of views received online and the subscribers. This sum total is referred to as user points. The rating will be given according to the below charts.
User points	rating
30-50		Average
51-60		Good
61-80		Excellent
81-100		Outstanding
*/
public class Video_Share {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the user points : ");
		int n = obj.nextInt();
		if (n >= 30 && n <= 50)
			System.out.println("Average");
		else if (n >= 51 && n <= 60)
			System.out.println("Good");
		else if (n >= 61 && n <= 80)
			System.out.println("Excellent");
		else
			System.out.println("Outstanding");
		obj.close();
	}

}
