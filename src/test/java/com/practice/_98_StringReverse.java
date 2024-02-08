package com.practice;

public class _98_StringReverse {

	//Reverse the name
	
	public static void main(String[] args) {
		String name = "Suresh";
		for (int i = name.length()-1; i >=0; i--) {
			char charAt = name.charAt(i);
			System.out.print(charAt);
		}
	
	}
}
