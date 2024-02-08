package com.practice;

public class _1_OddorEvenNumber {

	// 1. Find the Given number is odd or not 15
	// Odd numbers which is not divisible by 2
	// Even numbers which is divisible by 2
	// 0 is neither odd nor even number

	public static void main(String[] args) {
		int num = 15;
		if (num % 2 != 0) {
			System.out.println(num + " is an Odd number");
		} else {
			System.out.println(num + " is an Even number");
		}

	}
}
