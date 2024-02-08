package com.practice;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _n_RemoveDuplicateinString {

	// Remove duplicate in string
	//input=Congratulation
	//output = Congratuli

	private static void removeDuplicate(String input) {
		Map<Character,Integer> m = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < input.length(); i++) {
			char charAt = input.charAt(i);
			if (!(m.containsKey(charAt))) {
				m.put(charAt, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.print(entry.getKey());
		}
	}
		
	
	//remove duplicate using Set
	private static void removeDuplicatesSet(String input) {
		char[] charArray = input.toCharArray();
		Set<Character> s = new LinkedHashSet<>();
		for (int i = 0; i < charArray.length; i++) {
			s.add(charArray[i]);
		}
		System.out.println();
		for (Character character : s) {
			System.out.print(character);
		}
	}
	
	public static void main(String[] args) {
		removeDuplicate("Congratulation");
		removeDuplicatesSet("Congratulation");
	}

}
