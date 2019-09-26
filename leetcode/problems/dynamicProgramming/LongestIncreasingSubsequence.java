package problems.dynamicProgramming;

import java.util.Arrays;
import java.util.List;

/**
 * @author amruta.kajrekar on 4/16/18.
 * leetcode problem # 300
 * Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?
 */
public class LongestIncreasingSubsequence {

    public static void main(){
        LongestIncreasingSubsequence sub = new LongestIncreasingSubsequence();
        System.out.print(sub.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
    public int lengthOfLIS(int[] nums) {
        List list = Arrays.asList(nums);

        for(int i=1;i<list.size();i++){
            if(nums[i]<nums[i-1]){
//                nums.
            }
        }
        return 0;
    }

}
