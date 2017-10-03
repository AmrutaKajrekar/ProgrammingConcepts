/**
 * 
 */
package com.main.leetcode.arrays;

import java.util.Arrays;

/**
 * @author amruta.kajrekar
 * leetcode problem #414
 */
public class ThirdMax {

	public static void main(String[] args) {
		int[] nums = {3, 2,2, 1};
		ThirdMax max = new ThirdMax();
		System.out.println(max.thirdMax(nums));
	}

	public int thirdMax(int[] nums) {
		Arrays.sort(nums);
		int counter=1;
		for(int i=nums.length-1; i>0;i--){
			if(nums[i]!=nums[i-1]){
				counter++;
			}
			if(counter==3){
				return nums[i-1];
			}
		}
		return nums[nums.length-1];
    }
}
