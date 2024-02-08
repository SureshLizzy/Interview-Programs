package com.practice;

public class _997_FindNoOfCharacterInString {

	// find the number of characters in the given string Suresh@1234

	public static void main(String[] a) { //args can give whatever we want

		String s = "Suresh@1234";
		System.out.println(s.length());

		// or

		char[] charArray = s.toCharArray();
		System.out.println(charArray.length);
	}
}
