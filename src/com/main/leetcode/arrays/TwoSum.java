/**
 * 
 */
package com.main.leetcode.arrays;

/**
 * @author amruta.kajrekar
 * leetcode problem #1
 */
public class TwoSum {

	
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		int[] res = twoSum(nums, target);
		System.out.println("numbers are: "+ res[0] + ", " + res[1]);
	}
	
    public static int[] twoSum(int[] nums, int target) {
    	int[] res = new int[2];
        if(nums!=null && nums.length >=2){
        for (int i=0; i<nums.length-1; i++){
        	for (int j=i+1; j<nums.length; j++){
            	if(nums[i]+nums[j] == target){
            		res[0]=i;
            		res[1]=j;
            		break;
            	}
            }
        }
        }
		return res;
    }
}
