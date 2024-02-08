package com.practice;

public class _991_ArrayDescendingOrder {

	// Arrange the given numbers 100,500,300,200,400 in descending order

	public static void main(String[] args) {

		// int[] i = {100,500,300,200,400}; //or

		int[] i = new int[5];
		i[0] = 100;
		i[1] = 500;
		i[2] = 300;
		i[3] = 200;
		i[4] = 400;

		for (int j = 0; j < i.length; j++) {
			for (int k = j + 1; k < i.length; k++) {
				if (i[j] < i[k]) {
					int temp = i[j];
					i[j] = i[k];
					i[k] = temp;
				}
			}
		}
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
			
		}

	}
}
