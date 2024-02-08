package com.practice;

public class _93_Factorial {

	// Factorial of number 5?
	// Facitorial is the product of all the integers below it.
	// Eg: 4! = 4*3*2*1 = 24
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;

		while (num > 0) {
			fact = fact * num;
			num--;
		}
		System.out.println("Factorial of the number 5 is: " + fact);
	}
}
