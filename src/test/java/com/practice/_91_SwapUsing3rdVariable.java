package com.practice;

public class _91_SwapUsing3rdVariable {

	// Swapping two numbers using third variable

	public static void main(String[] args) {
		int a = 20;
		int b = 50;
		int temp;

		System.out.println("Before Swapping: ");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println("After Swapping: ");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

	}
}
