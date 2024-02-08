package com.practice;

public class _8_CountNumberOfDigits {
	
	//Count total number of digits in the given number

	public static void main(String[] args) {
		int num = 450110;
		int count = 0;
		while (num>0) {
			count++;
			num=num/10;
		}
		System.out.println("Digits count= "+count);
	}

}
