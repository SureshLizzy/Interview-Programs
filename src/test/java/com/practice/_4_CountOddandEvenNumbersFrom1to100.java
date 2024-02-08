package com.practice;

public class _4_CountOddandEvenNumbersFrom1to100 {

	//Count all the odd numbers and Even numbers from 1 to 100
	
	public static void main(String[] args) {
		int maxNum = 100;
		int oddCount=0;
		int evenCount=0;
		
		for (int i = 1; i <=maxNum; i++) {
			if (i%2!=0) {
				oddCount++;
			}else {
				evenCount++;
			}
		}
		System.out.println("Odd Count= "+oddCount);
		System.out.println("Even Count= "+evenCount);
	}
}
