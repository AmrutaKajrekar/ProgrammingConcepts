package problems.dynamicProgramming;

/**
 * @author amruta.kajrekar on 4/26/18.
 * leetcode problem #209
 * Given an array of n positive integers and a positive integer s,
 * find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint.
 */
public class MinSubArray {

    public static void main(String[] args){
        MinSubArray arr = new MinSubArray();
        System.out.print(arr.minSubArrayLen(11,new int[]{1,2,3,4,5}));
    }

    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1 && nums[0]==s) return 1;
        if(nums.length==1 && nums[0]!=s) return 0;

        int count=Integer.MAX_VALUE;
        int i=0;
        while(i<nums.length){
            int tempCount =0;

            for(int j=i;j<nums.length;j++){
                tempCount+=nums[j];
                if(tempCount>=s){
                    if(j-(i-1) < count)
                    count= j-(i-1);

                }else if(tempCount>s){
                    break;
                }
            }
            i++;
        }

        if(count==Integer.MAX_VALUE) return Math.min(count,0);
        else return count;
    }



}
