package com.basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber {
	
public static double harmonic(int n) {
		
		if(n == 1) {
			return 1;
		}
		else {
			return harmonic(n-1) + ((double)1/n);
		}

	}
	public static void main(String[] args) {
		
		System.out.println(" Welcome to Harmonic Numbers !!! ");
		Scanner scnner = new Scanner(System.in);
		
		System.out.println("Please Enter the Num : ");
		int n = scnner.nextInt();
		if (n != 0) {
		System.out.println(" Hrmonic Numbers are upto : "+n);
		
		System.out.println(n+" Harminic "+harmonic(n));
		}
		else {
			System.out.println("Please Enter Number Greater than Zero !!! ");
		}
		scnner.close();
	}

}
