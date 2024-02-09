package com.programs;

//Seperate zeros from non zeros in an array
public class Lab13 {

	public static void main(String[] args) {

		int a[] = { 0, 12, 13, 0, 3, 4, 0, 6 };
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[count] = a[i];
				count++;
			}
		}

		while (count < a.length) {
			a[count] = 0;
			count++;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(" " + a[i]);
		}

	}
}
