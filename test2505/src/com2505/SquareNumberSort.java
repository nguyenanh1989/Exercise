package com2505;

import java.util.Arrays;

public class SquareNumberSort {

	public int[] getSortNumber(int[] numberNotSort) {

		int[] numberSort = numberNotSort;
		for (int i = 0; i < numberSort.length; i++) {
			numberSort[i]=numberNotSort[i]*numberNotSort[i];
		}
		Arrays.sort(numberSort);
		return numberSort;
	}

}
