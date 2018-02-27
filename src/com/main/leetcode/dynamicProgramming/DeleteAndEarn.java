package com.main.leetcode.dynamicProgramming;

/**
 * @author amruta.kajrekar
 * leetcode problem #740
 *
 * Given an array nums of integers, you can perform operations on the array.

In each operation, you pick any nums[i] and delete it to earn nums[i] points. After, you must delete every element equal to nums[i] - 1 or nums[i] + 1.

You start with 0 points. Return the maximum number of points you can earn by applying such operations.

Example 1:
Input: nums = [3, 4, 2]
Output: 6
Explanation:
Delete 4 to earn 4 points, consequently 3 is also deleted.
Then, delete 2 to earn 2 points. 6 total points are earned.
 */
public class DeleteAndEarn {
    public static void main(String[] args){
        DeleteAndEarn del = new DeleteAndEarn();
        System.out.println(del.deleteAndEarn(new int[]{3,4,2}));
    }
    public int deleteAndEarn(int[] nums) {
        if (nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return nums[0];
        else if (nums.length == 2) {
            if (nums[0] != (nums[1] + 1) || nums[0] != (nums[1] - 1)) {
                return nums[0] + nums[1];
            } else {
                return Math.max(nums[0], nums[1]);
            }
        }
        else if (nums.length > 2) {
            int n = 10001;
            int[] count = new int[n];
            for (int num : nums) {
                count[num] += num;
            }
            int[] earned = new int[n];//2 more than limit
            for (int i = 2; i <= 10000; i++) {
                earned[i] = Math.max(count[i-2] + earned[i - 2], earned[i - 1]);
            }
            return earned[earned.length-1];
        }
        return 0;
    }
    public int deleteAndEarn4(int[] nums) {
        int n = 10001;
        int[] values = new int[n];
        for (int num : nums)
            values[num] += num;

        int take = 0, skip = 0;
        for (int i = 0; i < n; i++) {
            int takei = skip + values[i];
            int skipi = Math.max(skip, take);
            take = takei;
            skip = skipi;
        }
        return Math.max(take, skip);
    }

    private int deleteAndEarn3(int[] nums) {
        int points = 0;
        int[] earned = new int[nums.length + 1];

        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        if (nums.length > 2) {

            earned[0] = nums[0];
            earned[1] = Math.max(nums[0], nums[1]);
            for (int j = 0; j < nums.length; j++) {

            if(nums[j]!=0) {
                for (int i = 2; i < nums.length; i++) {
                    //earned[i] = Math.max(nums[i-2]+ nums[i], nums[i-1]);
                    //points = earned[i];
                    if (nums[i] == (earned[0] - 1) || nums[i] == (earned[0] + 1)) {
                        //delete
                        nums[i] = 0;
                    } else {
                        earned[i] = nums[i];
                    }
                    points = earned[i];
                }
            }
        }
    }
        return points;
    }

    public int deleteAndEarn2(int[] nums) {
        int points = 0;

        for(int i=0;i<nums.length; i++){
            int[] temp = nums.clone();
            //delete i and add to points
            int p = deletei2(i,temp, nums[i]-1, nums[i]+1);
            //iterate through nonzero elements;
//            for()
            if( p > points){
                points = p;
            }
        }
        return points;
    }

    private int deletei2(int i, int[] temp,int before, int after) {
        int p = temp[i];
        for(int j=0;j<temp.length;j++){
            if(temp[j]==before || temp[j]==after){
//                System.arraycopy(temp);
                temp[j]=0;
//                System.arraycopy(temp,);
            }
        }
        temp[i] = 0;
        return p;
    }

}
