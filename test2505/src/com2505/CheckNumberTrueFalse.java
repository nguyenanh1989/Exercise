package com2505;

import java.util.Arrays;
import java.util.HashSet;

public class CheckNumberTrueFalse  {

	public boolean getBoolDuplicateValue (Integer[] arrayNumber) {
		
		HashSet<Integer> haset = new HashSet<>(Arrays.asList(arrayNumber));
		if (arrayNumber.length == haset.size()){
			return false;
		}
		
		return true;
	}
		
}
