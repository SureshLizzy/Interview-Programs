package com.practice;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class _b_PrintConsonantValuesInString2 {

	// Print Consonant and its values in the given string

	public static void main(String[] args) {

		// 1. Print Consonant using MAP

		String s = "There is no greater purpose than help those in need";
		Map<Character, Integer> m = new TreeMap<Character, Integer>();
		char[] charArray = s.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
					|| c == 'O' || c == 'U')) {
				if (m.containsKey(c)) {
					Integer x = m.get(charArray[i]);
					m.put(c, x + 1);
				} else {
					m.put(c, 1);
				}
			}
		}

		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);

		}
		System.out.println("----------------------------------------");

		//////////////////////////////////////////////////////////////////////

		// using Set

		String s1 = "There is no greater purpose than help those in need";
		char[] charArray2 = s1.toCharArray();
		Set<Character> set = new TreeSet<Character>();
		int consonantCount = 0;
		for (int i = 0; i < charArray2.length; i++) {
			char c1 = charArray2[i];
			if (!(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' || c1 == 'A' || c1 == 'E' || c1 == 'I'
					|| c1 == 'O' || c1 == 'U')) {
				consonantCount++;
				set.add(c1);
			}
		}
		for (Character character : set) {
			System.out.println(character);
		}
		System.out.println("consonant count=" + consonantCount);

		////////////////////////////////////////////////////////////////////////////

		// normal method
		String s2 = "There is no greater purpose than help those in need";
		String lowerCase = s2.toLowerCase();
		char[] charArray3 = lowerCase.toCharArray();

		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		int spaceCount = 0;

		for (int i = 0; i < charArray3.length; i++) {
			char c3 = charArray3[i];
			if (c3 == 'b') {
				aCount++;
			} else if (c3 == 'c') {
				eCount++;
			} else if (c3 == 'd') {
				iCount++;
			} else if (c3 == 'f') {
				oCount++;
			} else if (c3 == 'g') {
				uCount++;
			} else if (c3 == ' ') {
				spaceCount++;
			}
		}

		System.out.println("-------------------------------------");
		System.out.println("b count=" + aCount);
		System.out.println("c count=" + eCount);
		System.out.println("d count=" + iCount);
		System.out.println("f count=" + oCount);
		System.out.println("g count=" + uCount);
		System.out.println("space count="+ spaceCount);
	}
}
