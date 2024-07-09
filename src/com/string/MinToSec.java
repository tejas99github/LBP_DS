package com.string;

import java.util.Scanner;

/*Accept video length in minutes the format is mm:ss in String format, 
create a function that takes video length and return it in seconds.
The character '0' (Unicode value 48) minus '0' (Unicode value 48) equals 0.
The character '1' (Unicode value 49) minus '0' (Unicode value 48) equals 1.
The character '2' (Unicode value 50) minus '0' (Unicode value 48) equals 2.
*/
public class MinToSec {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the video length in minutes : ");
		String videoLength = obj.nextLine(); // 10:15
		int seconds = convertToSeconds(videoLength);
		System.out.println("Video length in seconds: " + seconds);
		obj.close();
	}

	public static int convertToSeconds(String videoLength) {
		int minutes = 0; // 1, 10
		int seconds = 0; // 1, 15

		// Parsing minutes
		int i = 0;
		while (i < videoLength.length() && videoLength.charAt(i) != ':') {// 0<5, 1<5, 2<5&& chatAt(2)==:
			minutes = minutes * 10 + (videoLength.charAt(i) - '0'); // 0+(49-48)=1,10+(48-48)=10
			i++;
		}

		// Parsing seconds
		i++; // Skip the ':' //2

		while (i < videoLength.length()) { // 3<5,4<5
			seconds = seconds * 10 + (videoLength.charAt(i) - '0'); // 0+(49-48)=1, 10+(53-48)=15
			i++; // 4
		}

		// Converting minutes to seconds and adding to the total
		int totalSeconds = (minutes * 60) + seconds; // (10*60)+15=600+15=615

		return totalSeconds;
	}
}
