package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author amruta.kajrekar on 7/23/18.
 */
public class CombinationSum {

  public static void main(String[] args){
    CombinationSum sum = new CombinationSum();
    System.out.print(sum.combinationSum(new int[]{2,3,5}, 8));
  }

  public List<List<Integer>> combinationSum(int[] nums, int target) {
    Arrays.sort(nums);
    return combo(nums,target, 0);
  }

  public List<List<Integer>> combo(int[] nums, int target, int start){
    List<List<Integer>> list = new ArrayList<List<Integer>>();

    for(int i=start;i<nums.length;i++){
      if(nums[i]>target) break;
      int rem = target-nums[i];
      if(rem==0){
        List<Integer> l = new ArrayList<Integer>();
        l.add(nums[i]);
        list.add(l);
      }else{
        List<List<Integer>> pre = combo(nums, rem, i);
        for(List<Integer> p:pre){
          p.add(0,nums[i]);
          list.add(p);
        }
      }
    }

    return list;
  }

}
