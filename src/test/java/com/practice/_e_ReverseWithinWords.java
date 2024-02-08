package com.practice;

public class _e_ReverseWithinWords {

	// STring reverse within words
	// input = Avengers Assemble
	// output = sregnevA elbmessA

	private static String wordReverse(String input) {
		String[] split = input.split(" ");
		String s2 = "";

		for (String string : split) {
			String s1 = "";
			for (int i = string.length() - 1; i >= 0; i--) {
				char charAt = string.charAt(i);
				s1 = s1 + charAt;
			}
			s2 = s2 + s1 + " ";
		}
		System.out.println(s2);
		return s2;
	}

	public static void main(String[] args) {
		wordReverse("Avengers Assemble");
	}

}
