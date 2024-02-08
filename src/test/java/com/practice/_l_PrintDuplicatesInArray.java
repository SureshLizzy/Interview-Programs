package com.practice;

public class _l_PrintDuplicatesInArray {

	//print duplicates in Array
	 
	private static void arrayDuplicate() {
		int[] a = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=10;
		a[3]=30;
		a[4]=20;
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		arrayDuplicate();
	}

}
