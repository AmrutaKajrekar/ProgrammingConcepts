package problems.arrays;

import java.util.Arrays;

/**
 * @author amruta.kajrekar on 5/12/18.
 * leetcode problem #136
 */
public class SingleNumber {

    public static void main(String[] args){
        SingleNumber num = new SingleNumber();
        System.out.println(num.singleNumber2(new int[] {4,1,2,1,2}));
    }

    public int singleNumber2(int[] nums)
    {
        if (nums.length==0) return 0;
        if (nums.length==1) return nums[0];
        Arrays.sort(nums);

        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1])
            {
                System.out.println(nums[i]);
                return nums[i];
            }
        }
        if(nums[0]!=nums[1])
        {
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2])
        {
            return nums[nums.length-1];
        }
        return 0;
    }

}
