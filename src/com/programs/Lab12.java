package com.programs;

//Reverse a string without affecting special character
public class Lab12 {

	public static void main(String[] args) {
		String str = "a,v,c,@,f,h,$,&,j";
		System.out.println(arrayReversal(str));
	}

	public static String arrayReversal(String str) {

		char[] arr = str.toCharArray();

		int l = 0;
		int r = arr.length - 1;

		while (l < r) {
			if (!Character.isAlphabetic(arr[l])) {
				l++;
			} else if (!Character.isAlphabetic(arr[r])) {
				r--;
			} else {
				char temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
		}
		return new String(arr);
	}
}
