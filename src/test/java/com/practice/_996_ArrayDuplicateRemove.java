package com.practice;

import java.util.Set;
import java.util.TreeSet;

public class _996_ArrayDuplicateRemove {
	
	// Remove duplicate 100,500,300,200,400,100,300,700,600

		public static void main(String[] args) {

			int[] array = {100,500,300,200,400,100,300,700,600};
		
			System.out.println("Array with duplicate:");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
			
			Set<Integer> s = new TreeSet<Integer>();
			for (int i = 0; i < array.length; i++) {
				s.add(array[i]);
			}
			
			System.out.println("Array after removing duplicate");
			for (Integer i : s) {
				System.out.println(i);
			}
			
			
		}

	
}
