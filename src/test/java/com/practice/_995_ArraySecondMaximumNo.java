package com.practice;

public class _995_ArraySecondMaximumNo {

	// find the second maximum number in the given numbers 100,500,300,200,400

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
		System.out.println("The second maximum number in array is: "+array[1]);
	}
}
