/**
 * 
 */
package com.main.leetcode.arrays;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 * @author amruta.kajrekar
 * leetcode problem #628
 */
public class MoveZeros {
	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12};
		MoveZeros move = new MoveZeros();
		move.moveZeroes(nums);
		System.out.print("final = ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
	public void moveZeroes(int[] nums) {
		for (int j = 0; j < nums.length; j++) {
			if(nums[j]==0){
			for (int i = j+1; i < nums.length; i++) {
				if(nums[i]!=0){
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
					break;
				}
		
			}
			}
		}

    }
}
