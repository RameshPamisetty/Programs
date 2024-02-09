package com.programs;

//subarray with given sum
public class Lab14 {

	public static void main(String[] args) {
		int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int sum = 23;
		int[] result = subArraysum(arr, sum);

		for (int val : result) {
			System.out.println(val + " ");
		}
	}

	public static int[] subArraysum(int[] arr, int k) {
		int start = 0;
		int end = 1;
		int sum = arr[0];
		int len = arr.length;

		while (end <= len) {
			while (sum > k && start < end - 1) {
				sum = sum - arr[start];
				start++;
			}
			if (sum == k)
				return new int[] { start, end - 1 };

			if (end < len)
				sum = sum + arr[end];

			end++;
		}
		return new int[] { -1 };
	}
}
