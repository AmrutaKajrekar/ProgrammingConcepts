package problems.arrays;

/**
 * @author amruta.kajrekar on 9/7/18.
 * leetcode problem #41
 * Given an unsorted integer array, find the smallest missing positive integer.

Example 1:

Input: [1,2,0]
Output: 3
Example 2:

Input: [3,4,-1,1]
Output: 2
Example 3:

Input: [7,8,9,11,12]
Output: 1
Note:

Your algorithm should run in O(n) time and uses constant extra space.
 */
public class FirstMissingPositive {
  public static void main(String[] args){
    FirstMissingPositive missing = new FirstMissingPositive();
    System.out.print(missing.firstMissingPositive(new int[]{-2,0,-1,1,2,3}));
  }

  public int firstMissingPositive(int[] nums) {
    int i=0;
    while(i<nums.length){
      if(nums[i] == i+1 || nums[i] <= 0 || nums[i] > nums.length) i++;
      else if(nums[nums[i]-1] != nums[i]) swap(nums, i, nums[i]-1);
      else i++;
    }
    i=0;
    while(i<nums.length && nums[i]==i+1) i++;
    return i+1;
  }

  private void swap(int[] A, int i, int j){
    int temp = A[i];
    A[i]=A[j];
    A[j]=temp;
  }
}



