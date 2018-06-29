package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author amruta.kajrekar on 6/18/18.
 */
public class FourSum {

    public static void main(String[] args){
        FourSum four = new FourSum();
        System.out.println(four.fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> retList = new HashSet<>();
        int l=0;
        int r=nums.length-1;int maxsum = Integer.MIN_VALUE+1;
//        int diff =Integer.MIN_VALUE;

        while(l<r) {
            for (int i = l + 1; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    List<Integer> set = new ArrayList<Integer>();
                    int sum = nums[r] + nums[l] + nums[i] + nums[j];
                    if (sum == target) {
                        System.out.println(
                                nums[r] + "," + nums[l] + "," + nums[i] + "," + nums[j] + " = " + sum);
                        set.add(nums[r]);
                        set.add(nums[l]);
                        set.add(nums[i]);
                        set.add(nums[j]);
                        Object[] arr = set.toArray();
                        Arrays.sort(arr);
                        List<Integer> list = new ArrayList<>();
                        for(int k=0;k<arr.length;k++) {
                            list.add((int)arr[k]);
                        }
                        retList.add(list);
                    }
//                    diff = Math.min(Math.abs(target-maxsum), Math.abs(target-sum));
                    maxsum = Math.abs(target-sum) < Math.abs(target-maxsum) ? sum : maxsum;
                }
            }
                if(maxsum<target) l++;
                else r--;
        }
        return new ArrayList<List<Integer>>(retList);
    }

    public List<List<Integer>> fourSum22(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
//        Set<String> set = new HashSet<>();
        if(nums.length<4 || target==0) return ret;
        int l=0;
        int r=nums.length-1;int maxsum=Integer.MIN_VALUE;

        while(l<r) {
            for (int i = l+1; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    List<Integer> set = new ArrayList<>();
                    int sum = nums[r] + nums[l] + nums[i] + nums[j];
                    if (sum == target) {
                        System.out.println(
                                nums[r] + "," + nums[l] + "," + nums[i] + "," + nums[j] + " = " + sum);
                        set.add(nums[r]);
                        set.add(nums[l]);
                        set.add(nums[i]);
                        set.add(nums[j]);
                        ret.add(set);
                    }
                    maxsum= Math.max(maxsum, sum);
                }
            }
            if(maxsum<target) l++;
            else r--;
        }

        return ret;
    }

}
