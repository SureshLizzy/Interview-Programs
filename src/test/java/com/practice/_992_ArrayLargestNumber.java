package com.practice;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.sound.midi.Synthesizer;

public class _992_ArrayLargestNumber {
	
	// find the largest number in the given numbers 100,500,300,200,400

		public static void main(String[] args) {

			int[] array = {100,500,300,200,400};
			for (int i = 0; i < array.length; i++) {
				for (int j = i+1; j < array.length; j++) {
					if(array[i]<array[j]) {
						int temp = array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
			System.out.println("The largest number in array is: "+array[0]);
		}

	
}
