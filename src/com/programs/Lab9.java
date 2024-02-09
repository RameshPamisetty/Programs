package com.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Duplicate elements in an array
public class Lab9 {

	public static void main(String[] args) {

		int arr[]= {2,5,3,1,5,7,5,3,9,8,7,8};
		
		Map<Integer, Integer> map= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> entrySet= map.entrySet();
		for(Map.Entry<Integer, Integer> entry:entrySet) {
			if(entry.getValue()>1)
				System.out.println(entry.getKey());
		}
		
	}

}
