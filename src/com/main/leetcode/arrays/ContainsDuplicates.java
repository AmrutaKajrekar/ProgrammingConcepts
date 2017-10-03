package com.main.leetcode.arrays;

import java.util.Arrays;

/**
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * 
 * @author amruta.kajrekar
 *leetcode problem #217
 */
public class ContainsDuplicates {

	public static void main(String[] args) {
		ContainsDuplicates dup = new ContainsDuplicates();
		int[] nums = {2,4,-1,6,9,2,5};
		System.out.println(dup.containsDuplicate(nums));
	}
	
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] == nums[i+1]){
				return true;
			}
		}
        return false;
    }
}
