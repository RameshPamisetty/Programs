package com.programs;

import java.util.HashSet;
import java.util.Set;

//Intersection of Two arrays
public class Lab8 {

	public static void main(String[] args) {

		int arr1[] = { 2, 3, 6, 7, 9, 11 };
		int arr2[] = { 4, 6, 8, 9, 12 };

		Set<Integer> set = new HashSet<>();

		for (int val : arr1) {
			set.add(val);
		}
		for (int val : arr2) {
			if (set.contains(val))
				System.out.println(val);
		}

	}

}
