package com.practice;

public class _c_printSpecialcharNumberSmallCaps {

	// print and count small letter, capital letter, digit, special character using
	// ASCII

	public static void main(String[] args) {
		String str = "CaptianAmerica100@MARVEL.com";
		int s = 0;
		int c = 0;
		int d = 0;
		int sp = 0;
		String small = "";
		String caps = "";
		String digit = "";
		String specialCh = "";

		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (charAt >= 97 && charAt <= 122) {
				s++;
				small = small + charAt;
			} else if (charAt >= 65 && charAt <= 90) {
				c++;
				caps = caps + charAt;
			} else if (charAt >= 48 && charAt <= 57) {
				d++;
				digit = digit + charAt;
			} else {
				sp++;
				specialCh = specialCh + charAt;
			}
		}
		System.out.println("Small Letters: " + small + "\n" + "Count: " + s);
		System.out.println("Capital Letters: " + caps + "\n" + "Count: " + c);
		System.out.println("Digits Letters: " + digit + "\n" + "Count: " + d);
		System.out.println("Special characters Letters: " + specialCh + "\n" + "Count: " + sp);

		//////////////////////////////////////////////////////////

		// using character class methods
		
//		for (int i = 0; i < str.length(); i++) {
//			char charAt = str.charAt(i);
//			if (Character.isLowerCase(charAt)) {
//				s++;
//				small = small + charAt;
//			} else if (Character.isUpperCase(charAt)) {
//				c++;
//				caps = caps + charAt;
//			} else if (Character.isDigit(charAt)) {
//				d++;
//				digit = digit + charAt;
//			} else {
//				sp++;
//				specialCh = specialCh + charAt;
//			}
//		}
//		System.out.println("--------------------------------------");
//		System.out.println("Small Letters: " + small + "\n" + "Count: " + s);
//		System.out.println("Capital Letters: " + caps + "\n" + "Count: " + c);
//		System.out.println("Digits Letters: " + digit + "\n" + "Count: " + d);
//		System.out.println("Special Letters: " + specialCh + "\n" + "Count: " + sp);

	}
}