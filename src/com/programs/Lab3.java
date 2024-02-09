package com.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Non Repeated character
public class Lab3 {

	public static void main(String[] args) {

		String input = "AABCDBECF";

		Map<Character, Integer> map = new HashMap<>();
		/*
		 for (int i = 0; i < input.length(); i++) {
		  char ch = input.charAt(i);
		  if (map.containsKey(ch)) {
		   		map.put(ch, map.get(ch) + 1);
		  } else {
		   map.put(ch,1);
		  }
		}
		 */
		char[] ch = input.toCharArray();
		for (char c : ch) {
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}

		System.out.println(map);

		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
