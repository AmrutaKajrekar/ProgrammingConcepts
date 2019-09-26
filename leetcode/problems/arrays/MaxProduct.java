/**
 * 
 */
package problems.arrays;

import java.util.Arrays;

/**
 * @author amruta.kajrekar
 * leetcode problem #628
 */
public class MaxProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {-5,-3,1,2,3,4};
		MaxProduct max = new MaxProduct();
		System.out.print(max.maximumProduct(nums));
	}

	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int posProd = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
		int negProd = nums[0] * nums[1] * nums[nums.length-1];
		return Math.max(posProd, negProd);
    }
}
