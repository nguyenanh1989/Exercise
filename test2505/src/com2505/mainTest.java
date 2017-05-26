package com2505;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class executed All Exercise
 * 
 * @author nguyen van anh
 *
 */
public class mainTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// This Exercise 3
		String[] arr = { "cat", "act", "tac", "meo", "eom", "concho", "mio", "oim", "kaka", "akak", "kaak", "mioke",
				"oimek", "anhyeu", "Nguthe" };
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		System.out.println(new NumberGroupAnagram().getGroupList(list));

		// this Exercise 3
		int[] numberNotSort = { -3, -4, -5, 0, 6, 7, 8, 2 };
		for (int i : (new SquareNumberSort().getSortNumber(numberNotSort))) {
			System.out.println(i + " ");
		}

		// this Exercise 4
		Integer[] inputArrayNumber = { 1, 2, 3, 4, 5, 6, 4, 3, 2, 5, 4, 3, 2, 1, 6, 7, 4, 3, 2 };
		for (Integer i : new CountSmallerToTheRight().getCountSmallerToTheRight(inputArrayNumber)) {
			System.out.println(" : "+i);
		}

		// This Exercise 5
		Integer[] arrayNumber = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(new CheckNumberTrueFalse().getBoolDuplicateValue(arrayNumber));

		// This Exercise 6
		String inputString = "nguyen van anh hanoi oi ha noi oi oi ha noi ah hanoi ha ah ah haha";
		Object[] ob = new WordFrequency().getHighestFrequency(inputString);
		System.out.println(ob[0] + " " + ob[1]);

	}

}
