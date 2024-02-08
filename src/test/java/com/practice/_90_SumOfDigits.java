package com.practice;

public class _90_SumOfDigits {

	// Sum of digits of the given number

	public static void main(String[] args) {

		int num = 2345;
		int sum = 0;

		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("The sum of digit= " + sum);
	}
}
