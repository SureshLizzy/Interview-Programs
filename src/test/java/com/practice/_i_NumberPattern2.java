package com.practice;

public class _i_NumberPattern2 {
	
	/*print
	1
	12
	123
	1234
	12345
	*/
	
	private static void number() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		number();
	}
	

}
