package com.practice;

public class _998_FindNoOfWordsInString {

	// find the number of Words in the given string May i help you!

	public static void main(String[] a) { //args can give whatever we want

		String s = "May i help you!";
		String[] split = s.split(" ");
		System.out.println("No. of words in the string is: "+split.length);
	}
}
