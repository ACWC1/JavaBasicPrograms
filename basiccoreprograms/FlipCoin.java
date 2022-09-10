package com.basiccoreprograms;

import java.util.Scanner;

public class FlipCoin {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the No.to Flip the Coin : ");
		int num = scanner.nextInt();
		int tail = 0;
		int head = 0;
		
		if(num > 0 ) {
			for (int i = 0; i < num; i ++) {
				double value = Math.random();
				
				if (value < 0.5)
				{
					tail++;
				}
				else {
					head++;
				}
				
			}
			System.out.println("head"+head);
			System.out.println("tail"+tail);
			
			double PerOfHead = (head * 100) / num;
			double PerOfTail = (tail * 100) / num;
			
			System.out.println("Percetage of Head : "+PerOfHead);
			System.out.println("Percentage og Tail : "+PerOfTail);
		}
		scanner.close();
	}

}
