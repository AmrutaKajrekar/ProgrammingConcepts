package problems.arrays;

import java.util.Arrays;

/**
 * @author amruta.kajrekar on 6/17/18.
 */
public class TwoSumClosest {
    public static void main(String[] args){
       TwoSumClosest clo = new TwoSumClosest();
        System.out.println(clo.threeSumClosest(new int[]{-1,2,1,-4,5,6,7,8}, 1));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff=Integer.MAX_VALUE;
        int sum = 0;int temp =Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int l=i+1; int r=nums.length-1;

            while(l<r){
                System.out.println(nums[l]+"," + nums[i]+"," +nums[r]);
                temp = nums[l]+nums[r]+nums[i];
                if(Math.abs(temp-target) < minDiff) {
                    minDiff = Math.min(minDiff, Math.abs(temp-target));
                    sum = temp;
                }
                if(temp<target) l++;
                else r--;
            }
        }

        return sum;
    }

}
