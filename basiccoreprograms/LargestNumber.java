package com.basiccoreprograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		int num[] = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(" Please Enter the "+(i+1)+" Number : ");
			num [i] = sc.nextInt();
		}
		
		System.out.println(" Three Number are "+num[0]+" "+num[1]+" "+num[2]);
		
		int larger = num[0];
		
		for (int i = 0; i < 3; i++) {
			if(larger < num[i]) {
				larger = num[i];
			}
		}
		System.out.println(" The lager Number among this Number "+num[0]+" "+num[1]+" "+num[2]+" is "+larger);
		sc.close();
	}

}
