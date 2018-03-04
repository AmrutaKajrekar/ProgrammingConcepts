package problems.arrays;

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.
 * @author amruta.kajrekar
 * leetcode problem #33
 */
public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();
		int[] nums ={4,5,6,7,0,1,2,3};
		search.search(nums, 3) ;
		
	}

	public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]==target){
				return i;
			}
		}
		return -1;
    }

}
