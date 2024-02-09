package com.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

		//find duplicate elements in an string
public class Lab1 {

	public static void main(String[] args) {

		String[] names = { "Java", "JavaScript", "Ruby", "C", "Java","C" };

		//1.
		Set<String> set = new HashSet<>();
		for (String name : names) {
			if (set.add(name) == false)
				System.out.println("Duplicate element :" + name	);
		}
		
		//2.
		Map<String, Integer> map=new HashMap<>();
		for(String name:names) {
			Integer count=map.get(name);
			if(count==null)
				map.put(name, 1);
			else
				map.put(name, ++count);
		}
		
		Set<Entry<String, Integer>>entrySet= map.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate element:"+ entry.getKey());
			}
		}
	}

}
