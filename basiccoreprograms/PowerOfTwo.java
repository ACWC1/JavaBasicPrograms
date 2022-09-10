package com.basiccoreprograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for Power of 2 table below 31 : ");
		
		int num = scanner.nextInt();
		int result = 1;
		
		for (int i = 0; i <= num; i++) {
			
			result *= 2;
			System.out.println(" 2^"+i+" = "+result);
		}
		scanner.close();
	}
}
