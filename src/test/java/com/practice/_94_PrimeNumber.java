package com.practice;

public class _94_PrimeNumber {

	// 13 is prime or not?
	// PrimeNumber: It is a number that has exactly two distinct
	// positive divisors: 1 and itself. It is a natural number greater than

	public static void main(String[] args) {
		int num = 13;
//		boolean prime = true;
		int count=0;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
//				prime = false;
				count++;
			}
		}
		if (count==0) {
			System.out.println(num + " is not a prime number");
		} else {
			System.out.println(num + " is a prime number");
		}
	}
}
