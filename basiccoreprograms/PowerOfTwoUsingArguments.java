package com.basiccoreprograms;

public class PowerOfTwoUsingArguments {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		double num2 = Double.parseDouble(args[0]);
		
		System.out.println(" Value of num 1 : "+num);
		System.out.println(" Value of num 2 : "+num2);
		int result = 1;
		
		for (int i = 1; i <= num; i++)
		{
			result *= 2;
			System.out.println(" 2^"+i+" = "+result);
		}
	}

}
