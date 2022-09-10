package com.basiccoreprograms;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		String vowel = "aeiouAEIOU";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please Enter the Alphabet to Check the Vowel or Consonant !!! ");
		String alphabet = sc.nextLine();
		
		if(vowel.contains(alphabet)) {
			System.out.println(alphabet+" is a Vowel !!! ");
		}
		else {
			System.out.println(alphabet+" is a Consonant !!! ");
		}
		
		sc.close();
	}

}
