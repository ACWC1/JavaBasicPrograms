package com.basiccoreprograms;

import java.util.Scanner;

public class QuotientAndReminder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Welcome to Quotient And Reminder Calculator !!! ");
		
		System.out.println("\n Please Enter the Dividend : ");
		int dividend = sc.nextInt();
		
		System.out.println("\n Pleasse Enter the divisior : ");
		int divisor = sc.nextInt();
		
		if (dividend != 0 || divisor != 0 ) {
			System.out.println("Quotient is "+(dividend/divisor));
			System.out.println("Reminder is "+(dividend%divisor));
		}
		else {
			System.out.println(" Please Enter Positive Values !!! ");
		}
		sc.close();

	}

}
