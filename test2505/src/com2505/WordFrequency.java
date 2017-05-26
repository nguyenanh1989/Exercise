package com2505;


import java.util.HashMap;
import java.util.Map;


public class WordFrequency {

	public Object[] getHighestFrequency(String inputString) {
		Object[] ob = new Object[2];
		String[] arrayString = inputString.split(" ");
		HashMap<String, Integer> hasMap = new HashMap<>();

		for (String str : arrayString) {
			if (hasMap.containsKey(str)) {
				hasMap.put(str, hasMap.get(str) + 1);
			} else {
				hasMap.put(str, 1);
			}
		}
		int max = 0;
		for ( Map.Entry<String,Integer> set1 : hasMap.entrySet()) {
			if ((Integer) set1.getValue() > max) {
				ob[0]=set1.getKey();
				ob[1]=set1.getValue();
			}
		}
		return ob;

	}

}
