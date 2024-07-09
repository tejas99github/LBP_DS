package com.array.self;

import java.util.Scanner;

/*LBP178 : flight

amir is travelling to mumbai, but this time he is taking flight. His brother has already told him about luggage weight limits but forgot it. Now he is taking with him 3 trolly bags.
As per the current airlines which amir will fly. has below weight limits.
There can be at max 2 check-in and 1 cabin luggage. Check-in has total limit of L1 and Cabin has limit of L2.
Now, amir has 3 luggage has weights as W1 and W2 and W3 respectively. Now he should be smart enough to make sure that he can travel with all the 3 luggage without paying extra charge.
Find out whether amir can take all of his luggage without any extra charges or not. If all good and no extra changes were paid, output "Yes" otherwise "No".
*/
public class Flight {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the weight of three trolly bag ");
		int w1 = obj.nextInt(), w2 = obj.nextInt(), w3 = obj.nextInt(), l1 = obj.nextInt(), l2 = obj.nextInt();
		if (w1 + w2 + w3 <= l1 + l2)
			System.out.println("Yes");
		else
			System.out.println("No");
		obj.close();
	}

}
