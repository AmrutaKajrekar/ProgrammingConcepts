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
            if(map.containsKey(n[i])){
                int index = map.get(n[i]);
                result[0]=index;
                result[1]=i;
            }else{
                map.put(target - n[i],i);
            }
        }
        return result;
    }

    public static void main(String[] args){
        TwoSum p= new TwoSum();
        int[] n = new int[]{2,7,11,15};
        int[] res= p.twoSum(n,9);
        for (int i=0; i<res.length;i++) {
            System.out.println(res[i]);
        }
    }
}
