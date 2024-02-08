package com.practice;

public class _95_PrimeNo_1to50 {

	// print primenumber from 1 to 50

	public static void main(String[] args) {
		int maxNum = 50;
		System.out.println("prime numbers from 1 to 50 are:");

		for (int i = 2; i <= maxNum; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {

				System.out.println(i);
			}
		}

	}

}
