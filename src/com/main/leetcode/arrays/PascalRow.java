package com.main.leetcode.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
 * @author amruta.kajrekar
 * leetcode problem #119
 */
public class PascalRow {
	public static void main(String[] args) {
		PascalRow pascal = new PascalRow();
		List<Integer> result = pascal.getRow(0);
		System.out.print(result);
	}

	public List<Integer> getRow(int rowIndex) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		result.add(1);
		for (int i = 1; i <= rowIndex; i++) {
			for (int j = result.size()-2; j>=0 ;j--) {
				result.set(j+1, result.get(j)+result.get(j+1));
			}
			result.add(1);
		}
		
		return result;
    }

}
