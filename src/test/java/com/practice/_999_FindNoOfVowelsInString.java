package com.practice;

public class _999_FindNoOfVowelsInString {

	// find the number of vowels in the given string May i help you!

	public static void main(String[] args) {
		String s = "I can do this all day";
		int count = 0;

		char[] charArray = s.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
			}
		}
		System.out.println("The no. of vowels in String is: " + count);
	}
}
