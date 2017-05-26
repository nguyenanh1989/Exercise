package com2505;

import java.util.LinkedList;

/**
 * 
 * Exercise 2
 * 
 * @author nguyen van anh
 *
 */
public class CheckNumber {

	public int getNumber(Integer[] arraynumber) {

		LinkedList<Integer> linker = new LinkedList<Integer>();
		for (int i = 0; i < arraynumber.length; i++) {

			if (linker.contains(i)) {
				return arraynumber[i];
			}
		}

		return -1;
	}

}
