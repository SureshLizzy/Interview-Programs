package com.practice;

import java.util.Set;
import java.util.TreeSet;

public class _m_PrintUniqueNumbersinArray {

	// print unique numbers in Array

	private static void uniqueArray() {
		int[] a = new int[7];
		a[0] = 10;
		a[1] = 20;
		a[2] = 10;
		a[3] = 30;
		a[4] = 20;
		a[5] = 60;
		a[6] = 80;

		Set<Integer> s = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		uniqueArray();
	}

}
