package com.main.leetcode.arrays;

/**
 * @author amruta.kajrekar
 * leetcode problem #189
 */
public class RotateArray {
 
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		RotateArray rotate = new RotateArray();
		rotate.rotate(nums, 11);
	}

	public void rotate(int[] nums, int k) {
		int[] res = new int[nums.length];
		if(nums.length<k){
		k = k-nums.length;	
		}
		int j=0;
        for (int i = nums.length-k; i < nums.length; i++) {
			res[j] = nums[i];
			j++;
		}
        for (int i = 0; i < nums.length-k; i++) {
			res[j] = nums[i];
			j++;
		}
		for (int i = 0; i < res.length; i++) {
			nums[i] = res[i];
			System.out.print(nums[i]);
		}
    }

}
