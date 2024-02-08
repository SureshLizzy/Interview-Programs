package com.practice;

public class _5_SumofOddandEvenNumber {

	//Print sum of all Even and odd numbers from 1 to 80
	
	public static void main(String[] args) {
		int maxNum = 80;
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i = 1; i<=maxNum; i++) {
			if (i%2==0) {
				evenSum = evenSum+i;
			}else
				oddSum=oddSum+i;
		}
		System.out.println("Sum of odd numbers from 1to80 is: "+oddSum);
		System.out.println("Sum of even numbers from 1to80 is: "+evenSum);
	}
	
}
