package com.programs;

import java.util.HashMap;
import java.util.Map;

//find duplicate character in string
public class Lab2 {

	public static void main(String[] args) {

		String names = "Java2Jee";

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < names.length(); i++) {
			char c = names.charAt(i);
			if (map.get(c) != null) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
			System.out.println(map);
		}

		
	}

}
