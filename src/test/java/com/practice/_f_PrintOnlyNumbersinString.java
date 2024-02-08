package com.practice;

public class _f_PrintOnlyNumbersinString {

	// print only numbers in string
	// input = Welcome@12345
	// output = 12345

	private static String printOnlyNumbers(String input) {
		String s1 = "";
		for (int i = 0; i < input.length(); i++) {
			char charAt = input.charAt(i);
			if (charAt >= '0' && charAt <= '9') {
				s1 = s1 + charAt;
			}
		}
		System.out.println(s1);
		return s1;
	}

	public static void main(String[] args) {
		printOnlyNumbers("Welcome@12345");
	}

}
