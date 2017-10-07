package com.main.leetcode.arrays;

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
Find the minimum element.
You may assume no duplicate exists in the array.

 * @author amruta.kajrekar
 * leetcode problem #153
 */
public class MinInRotatedSortedArray {

	public static void main(String[] args) {
		MinInRotatedSortedArray search = new MinInRotatedSortedArray();
		int[] nums ={1,2};
		System.out.println(search.findMin(nums) );
	}
	
	public int findMin(int[] nums) {
		int min = Integer.MAX_VALUE;
		if(nums.length == 1){
			return nums[0];
		}
        for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] < min){
				min = nums[i];
			}
			if(nums[i]>nums[i+1]){
				return nums[i+1];
			}
		}
        if(min < Integer.MAX_VALUE)
        	return min;
        else
        	return 0;
    }
	
}
