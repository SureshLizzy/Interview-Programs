package com.practice;

public class _7_PalindromeNumber {

	// Given number is palindrome or not

	// A palindrome is a word, number, phrase, or other sequence of symbols
	// that reads the same backwards as forwards, such as madam or racecar,
	// the date and time 12/21/33 12:21, and the sentence: "A man, a plan, a canal –
	// Panama".

	public static void main(String[] args) {
		int num = 123321;
		int temp = num;
		int rev = 0;

		while (num > 0) {
			int quo = num % 10;
			rev = (rev * 10) + quo;
			num = num / 10;

		}
		if (rev == temp) {
			System.out.println(temp + " is a palindrome number");
		} else {
			System.out.println(temp + " is not a palindrome number");
		}
	}

}
