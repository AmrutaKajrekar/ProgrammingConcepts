package com.main.leetcode.arrays;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
 * @author amruta.kajrekar
 * leetcode problem #27
 */
public class RemoveElement {

	public static void main(String[] args) {
		RemoveElement remove = new RemoveElement();
		int[] nums = {3,2,2,3};
		System.out.println(remove.removeElement(nums, 3));
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
	}

	public int removeElement(int[] nums, int val) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==val){
				nums[i] = Integer.MIN_VALUE;
			}
		}
		int k=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=Integer.MIN_VALUE){
				k++;
			}
		}
		
		for (int j = 0; j < nums.length; j++) {
			if(nums[j]==Integer.MIN_VALUE){
			for (int i = j+1; i < nums.length; i++) {
				if(nums[i]!=Integer.MIN_VALUE){
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
					break;
				}
		
			}
			}
		}
		return k;
    }

}
