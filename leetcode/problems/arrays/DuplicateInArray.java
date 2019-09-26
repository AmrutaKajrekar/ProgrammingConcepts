package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author amruta.kajrekar on 6/12/18.
 */
public class DuplicateInArray {

    public static void main(String[] args){
        DuplicateInArray dup= new DuplicateInArray();
        System.out.println(dup.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        for(int j=0;j<nums.length;j++) {
            int v = Math.abs(nums[j])-1;
            if(nums[v]>0) nums[v] = -nums[v];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) list.add(i+1);
        }
        return list;
    }


    public List<Integer> findDisappearedNumbers2(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int k=1; boolean processed = false;
        for(int j=0;j<nums.length;j++) System.out.print(nums[j]+",");
        for(int i=0;i<nums.length;){
            System.out.println(nums[i]+","+k);
            if(nums[i] != k){
                System.out.println(nums[i]+","+i);
                list.add(nums[i]);
            }
            while(nums[i]==nums[i+1] && i<nums.length){
                processed=true;
                i++;
            }
            if(!processed){
                i++;
                processed=false;
            }
            k++;
        }
        return list;
    }
}
