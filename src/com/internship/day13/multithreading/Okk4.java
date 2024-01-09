package com.internship.day13.multithreading;

public class Okk4 {
	private static void rotate(int[] nums, int k) {
		int n = nums.length;
		k %= n;

		for (int i = 0; i < k; i++) {
			int temp = nums[n - 1];
			for (int j = n - 1; j > 0; j--) {
				nums[j] = nums[j - 1];
			}
			nums[0] = temp;
		}
	}
	
	public static void rotString(char[] wawa, int l) {
		int p=wawa.length;
		l %=p;
		
		for(int i=0;i<l;i++) {
			int temp2=wawa[l-1];
			
			
		}
		
		
	}

	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5 };
		int rc = 2;

		rotate(myArray, rc);

		for (int num : myArray) {
			System.out.print(num + " ");
		}
	}
	
}
