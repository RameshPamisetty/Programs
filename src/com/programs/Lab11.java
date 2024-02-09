package com.programs;

import java.util.HashMap;
import java.util.Map;

//Remove duplicates from array
public class Lab11 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5, 42, 5, 7, 2 };

		Map<Integer, Integer> map = new HashMap<>();
		int len = arr.length;

		for (int i = 0; i < len-1; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}

		map.forEach((k,v) -> System.out.println(k +" "));
	}
}
