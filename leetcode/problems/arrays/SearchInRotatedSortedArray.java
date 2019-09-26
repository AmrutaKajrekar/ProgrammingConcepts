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
		System.out.println(search.quickSearch(nums,0));
	}

	public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]==target){
				return i;
			}
		}
		return -1;
    }

	public int quickSearch(int[] nums, int target) {
			if(nums==null || nums.length==0) return -1;
			if(nums.length==1 && nums[0]==target) return 0;

			return quick(nums,target, 0, nums.length-1);
		}

		public int quick(int[] nums, int target, int s, int e){
			while(s<e){
				int pivot = (e-s)/2;
				System.out.println(pivot);
				if(nums[pivot]==target) return pivot;
				else if(nums[pivot]<target) {
					s = pivot;
					return quick(nums, target, s, e);
				}else if(nums[pivot]>target){
					e = pivot;
					return quick(nums, target, s, e);
				}

			}
			return -1;
		}
}
