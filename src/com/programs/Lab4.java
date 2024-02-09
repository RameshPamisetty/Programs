package com.programs;

import java.util.HashMap;
import java.util.Map;

//Count occurrence of each character
public class Lab4 {

	public static void main(String[] args) {

		String input = "abcdABCDabcd";

		char[] chars = input.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for (char ch : chars) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}
		System.out.println(map);
	}

}
