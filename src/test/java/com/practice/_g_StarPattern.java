package com.practice;

public class _g_StarPattern {
	
	/*print
	*
	**
	***
	****
	******/
	
	private static void star() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		star();
	}
	

}
