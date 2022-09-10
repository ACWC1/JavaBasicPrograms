package com.basiccoreprograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please Enter the Number to check Even or Odd ");
		int num = sc.nextInt();
		
		if (num % 2 == 0 ) {
			System.out.println(" The Entered Number is EVEN !!! ");
		}
		else {
			System.out.println(" The Entered Number is ODD !!! ");
		}
		sc.close();
	}

}
