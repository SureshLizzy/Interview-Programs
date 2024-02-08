package com.practice;

public class _j_NumberIncrementPattern {
	
	/*print
	1
	23
	456
	78910
	*/
	
	private static void number() {
		int num =1;
		for (int i = 0; i <4; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(num++);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		number();
	}
	

}
