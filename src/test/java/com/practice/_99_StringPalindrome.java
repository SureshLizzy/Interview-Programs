package com.practice;

public class _99_StringPalindrome {

	//find the given string malayalam is palindrome or not
	
	private void stringPalindrome(String name) {
		String rev ="";
		for (int i = name.length()-1; i >=0; i--) {
			rev = rev+name.charAt(i);
		}
		if (rev.equals(name)) {
			System.out.println(name+" is a palindrome");
		}else {
			System.out.println(name+" is not a palindrome");
		}
	}
	
	public static void main(String[] args) {
		_99_StringPalindrome s = new _99_StringPalindrome();
		s.stringPalindrome("malayalam");
	}
}
