package com.practice;

public class _97_PrimeNoSum_1to30 {

	// Sum of primenumbers from 1 to 30

	private void primenumberSum(int num) {
		
		System.out.println("The primenumbers from 1 to 30 are: ");
		int sum = 0;
		int total = 0;
		
		for (int i = 2; i <= num; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				total++;
				sum = sum + i;
				System.out.println(i);

			}
		}
		System.out.println("Total primenuber = " + total);
		System.out.println("sum of primenumber = " + sum);
	}

	public static void main(String[] args) {
		_97_PrimeNoSum_1to30 p = new _97_PrimeNoSum_1to30();
		p.primenumberSum(30);
	}
}
