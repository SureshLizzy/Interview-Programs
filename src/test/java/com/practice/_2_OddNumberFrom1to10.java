package com.practice;

public class _2_OddNumberFrom1to10 {

	//Print odd numbers from 1 to 10
	
	public static void main(String[] args) {
		int num = 10;
		
		for (int i = 1; i<=num; i++) {
			if (i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}
}
