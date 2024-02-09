package com.programs;

//rotate by k steps
public class Lab10 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int k = 4;
		reverse(k, k, arr);
		
	}

	public static int[] reverse(int start, int end, int arr[]) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
		return arr;
	}
}
