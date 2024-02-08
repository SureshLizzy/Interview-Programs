package com.practice;

public class _96_PrimeNoTotal_1to30 {

	//Print the total number of prime numbers from 1 to 30
	
	private void primeNumberTotal(int number) {
		int total =0;
		System.out.println("Prime numbers from 1 to 30 are:");
		
	for (int i = 2; i <= number; i++) {
		int count =0;
		for (int j = 2; j < i; j++) {
			if (i%j==0) {
				count++;
			}
		}
		if (count==0) {
			total++;
			System.out.println(i);
		} 
	}
	System.out.println("The total number of prime numbers are: "+total);
	}
	
	public static void main(String[] args) {
		_96_PrimeNoTotal_1to30 p = new _96_PrimeNoTotal_1to30();
		p.primeNumberTotal(30);
	}
}
