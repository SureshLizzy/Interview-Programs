package com.practice;

public class _92_SwappingTwoNumbersw_o3rdVariable {

	// Swapping two numbers w/o third variable

	public static void main(String[] args) {

		int a = 20;
		int b = 50;

		System.out.println("Before Swapping: ");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

		a = a + b; // a=20+50=70
		b = a - b; // b=70-50=20
		a = a - b; // a=70-20=50

		System.out.println("After Swapping: ");
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}
}
