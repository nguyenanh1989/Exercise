package com2505;

import java.util.ArrayList;

public class CountSmallerToTheRight {

	public ArrayList<Integer> getCountSmallerToTheRight(Integer[] inputArrayNumber) {
		ArrayList<Integer> listNumber = new ArrayList<>();
		listNumber.add(0);
		int indexListNumber=0;
		int h = 0;		
		
		for (int i = 0; i < inputArrayNumber.length; i++) {
			for (int j = i + 1; j < inputArrayNumber.length;j++) {
				if (j > inputArrayNumber.length - 1) {
					break;
				} else {
					if (inputArrayNumber[i] > inputArrayNumber[j])
						listNumber.set(indexListNumber,++h);
				}
			}
			h = 0;
			listNumber.add(0);
			indexListNumber++;
		}
		listNumber.remove(listNumber.size()-1);
		return listNumber;
	}

}
