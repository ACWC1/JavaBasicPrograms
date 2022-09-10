package com.basiccoreprograms;

public class SwipeTwoNumber {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		int temp = 0;
		
		System.out.println(" The Value of A is : "+a+"\n The Value of B is : "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("****** After Swipe ******* \n The Value of A is : "+a+"\n The Value of B is : "+b);
	}

}
