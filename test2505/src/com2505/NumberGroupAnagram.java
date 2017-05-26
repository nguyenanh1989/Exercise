package com2505;

import java.util.ArrayList;

/**
 * 
 * @author nguyen van anh
 *
 */
public class NumberGroupAnagram {

	
	/*get number of group*/
	public int getGroupList(ArrayList<String> inPutString) {
		int numberGroup=0;
		
		for (int i = 0; i < inPutString.size() - 1; i++) {

			for (int j = i + 1; j < inPutString.size(); j++) {
				if (isContain(inPutString.get(i), inPutString.get(j))) {
					inPutString.set(j, "$");
				}
			}

		}
		
		for (String s : inPutString) {
			if( !s.equals("$")){
				numberGroup++;
			}
		}

		return numberGroup;

	}

	public boolean isContain(String a, String b) {

		for (char b1 : b.toCharArray()) {
			if (!a.contains("" + b1)) {
				return false;
			}
		}
		return true;
	}

}
