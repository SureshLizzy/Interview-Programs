package com.practice;

public class _k_StarReversePattern {

	/* print
	 *****
	 ****
	 ***
	 **
	 *
	 */

	private static void reverseStar() {
		int num =5;
		for (int i = 0; i < num; i++) {
			for (int j = num-1; j>=i ; j--) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		reverseStar();
	}

}
