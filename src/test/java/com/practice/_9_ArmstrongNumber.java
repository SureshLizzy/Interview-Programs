package com.practice;

public class _9_ArmstrongNumber {

	// Sum of its own digit each raised to the power of the number of digits is
	// equal to the original digit then it is said to armstrong number
	//eg: 153, 1634, 370,371

	public static void main(String[] args) {

		int num = 1634;
		int temp = num;
		int arm = 0;

		while (num > 0) {
			int r = num % 10;
			arm = arm + (r * r * r * r);
			num = num / 10;
		}
		System.out.println("arm =" + arm);
		if (arm == temp) {
			System.out.println(temp + " is an Armstrong number");
		} else {
			System.out.println(temp + " is not an Armstrong number");
		}
	}

}
