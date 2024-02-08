package com.practice;

public class _3_EvenNumberFrom5to50 {

	//print all the even numbers from 5 to 50
	
	public static void main(String[] args) {
		int num =50;
		
		for (int i = 5; i <=num; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}
}
