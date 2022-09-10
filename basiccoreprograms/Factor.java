package com.basiccoreprograms;

import java.util.Scanner;

public class Factor {
	
	public static int getLCF(int number) {
		for (int i=2; i*i<=number; i++ ) {
			if ( (number%i) == 0) {
				return i;
			}
		}
		return number;
	}

	public static void factors(int number) {
		int LCF = getLCF(number);
		System.out.println(LCF);
		if (number != LCF) {
			factors(number/LCF);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the Number to Find Factors !!! ");
		int num = sc.nextInt();
		System.out.println(" Factors of "+num+" is : ");
		factors(num);
		
		sc.close();
	}

}
