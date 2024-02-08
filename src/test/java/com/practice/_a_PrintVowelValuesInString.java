package com.practice;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class _a_PrintVowelValuesInString {

	// Print vowel and its values in the given string

	
	public static void main(String[] args) {
		
		//1. Print vowel using MAP
		
		String s = "There is no greater purpose than help those in need";

		char[] charArray = s.toCharArray();
		Map<Character, Integer> m = new TreeMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				if (m.containsKey(c)) {
					Integer x = m.get(charArray[i]);
					m.put(c, x+1);
				}else {
					m.put(c, 1);
				}
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		System.out.println("------------------------------------------------");
		
		
	///////////////////////////////////////////////////////////////////
		
		//2. Print vowel using set
				
		String s1 = "There is no greater purpose than help those in need";
		char[] charArray2 = s1.toCharArray();
		int count=0;
		Set<Character> set = new TreeSet<Character>();
		
		for (int i = 0; i < charArray2.length; i++) {
			char c1 =charArray2[i];
			if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' || c1 == 'A' || c1 == 'E' || c1== 'I' || c1 == 'O'
					|| c1 == 'U') {
				count++;
				set.add(c1);
			}
		}
		for (Character character : set) {
			System.out.println(character);
		}
		System.out.println("Vowels count: "+count);
		System.out.println("-----------------------------------------");
		
////////////////////////////////////////////////////////////////////////////////
		
		//3. Vowels count by normal method
		
		String s3 = "There is no greater purpose than help those in need";
		int aCount=0; int eCount=0; int iCount=0;
		int oCount=0; int uCount=0;
		
		String lowerCase = s3.toLowerCase();
		
		char[] charArray3 = lowerCase.toCharArray();
		
		for (int i = 0; i < charArray3.length; i++) {
			char ch =charArray3[i];
			if (ch=='a') {
				aCount++;
			}else if (ch=='e') {
				eCount++;
			}else if (ch=='i') {
				iCount++;
			}else if (ch=='o') {
				oCount++;
			}else if (ch=='u') {
				uCount++;
			}
		}
		
		System.out.println("A: "+aCount);
		System.out.println("E: "+eCount);
		System.out.println("I: "+iCount);
		System.out.println("O: "+oCount);
		System.out.println("U: "+uCount);
	}
}
