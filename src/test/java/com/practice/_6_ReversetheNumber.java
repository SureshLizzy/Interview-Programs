package com.practice;

public class _6_ReversetheNumber {

	// Reverse the number 1005

	public static void main(String[] args) {
		int num = 1005;
		int rev = 0;

		while (num > 0) {
			int quo = num % 10;
			rev = (rev * 10) + quo;
			num = num / 10;
		}
		System.out.println("The reversed number is: " + rev);
	}
}
