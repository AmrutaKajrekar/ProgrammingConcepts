package problems.arrays;

import java.util.HashMap;

/**
 * @author amruta.kajrekar
 * leetcode problem #1
 */
public class TwoSum {

    public int[] twoSum(int[] n, int target){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = new int[2];

        for(int i=0;i<n.length;i++){
            if(map.containsKey(target - n[i])){
                int index = map.get(target - n[i]);
                result[0]=index;
                result[1]=i;
            }else{
                map.put(n[i],i);
            }
        }
        return result;
    }

    public static void main(String[] args){
        TwoSum p= new TwoSum();
        int[] n = new int[]{3,2,4};
        int[] res= p.twoSum2(n,6);
        for (int i=0; i<res.length;i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        if(nums!=null && nums.length <2) return res;
            for (int i=0; i<nums.length; i++){
                if(map.containsKey(target-nums[i])){
                    res[1] = i;
                    res[0] = map.get(target-nums[i]);
                    return res;
                }
                map.put(nums[i], i);
            }

        return res;
    }
}
