package com.basiccoreprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the 4 Dogit Year : ");
		int year = scanner.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year%400 == 0) {
			System.out.println("This is leap Year!");
		
		}
		else {
			System.out.println("This is not a Leap Year !");
		}
		scanner.close();
	}
}
