/**
 * 
 */
package problems.arrays;

/**
 * Given an array of integers and an integer k, 
 * find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] 
 * and the absolute difference between i and j is at most k.
 * @author amruta.kajrekar
 * leetcode problem #219
 */
public class ContainsDuplicateII {

	public static void main(String[] args) {
		ContainsDuplicateII dup2 = new ContainsDuplicateII();
		int[] nums = {1,2,3,4,5,6,7,8,9,9};
		System.out.println(dup2.containsNearbyDuplicate(nums, 3));
	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {

		for(int i=0, j=i+1;i<nums.length-1;){
			if(i!=j && nums[i]==nums[j] && Math.abs(i-j)<=k) return true;
			else{
				if(Math.abs(i-j)<=k && j+1<nums.length) j++;
				else {
					i++;
					j=i+1;
				}
			}
		}

		return false;
	}

	public boolean containsNearbyDuplicate2(int[] nums, int diff) {
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j] && (Math.abs(i-j)) <= diff){
					return true;
				}
			}
		}
        return false;
    }
}
