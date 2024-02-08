package com.practice;

public class _d_Eachletterof1WordCaps {

	// Convert each word 1st letter caps
	// normal method

	 public static void main(String[] args) {
	 String str = "i love you in every universe";
	 String[] split = str.split(" ");
	 String s2 = "";
	
	 for (String string : split) {
	 char charAt = string.charAt(0);
	 char upperCase = Character.toUpperCase(charAt);
	 String substring = string.substring(1);
	 s2=s2+upperCase+substring+" ";
//	 System.out.println(substring);
//	 System.out.println(upperCase);
	 }
	 System.out.println(s2);
	 }

	///////////////////////////////////////////////////////////////////

	// Using String Builder

//	public static String firstLetterCaps(String input) {
//		char[] charArray = input.toCharArray();
//		boolean capitalizeNext = true;
//
//		// String builder is created becuase string doesn't join(concat) the char[]
//		StringBuilder sb = new StringBuilder();
//
//		for (char c : charArray) {
//			if (Character.isWhitespace(c)) {
//				capitalizeNext = true;
//				sb.append(c);
//			} else if (capitalizeNext) {
//				sb.append(Character.toUpperCase(c));
//				capitalizeNext = false;
//			} else {
//				sb.append(c);
//			}
//		}
//		return sb.toString();
//	}
//
//	public static void main(String[] args) {
//		String firstLetterCaps = firstLetterCaps("i can do this all day");
//		System.out.println(firstLetterCaps);
//	}

}
