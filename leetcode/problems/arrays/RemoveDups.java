package problems.arrays;

/**
 * @author amruta.kajrekar
 * leetcode problem #
 */
class Solution {
    public static void main(String[] args){

        Solution remove = new Solution();
        int[] nums= new int[]{1,1,1};
        System.out.println(remove.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        if(nums.length==2){ return nums[0]==nums[1] ? 1: 2; }


        int last = nums.length-1;
        for(int i=0;i<last;i++){
            for(int j=i+1;j<=last;j++){
                if(nums[i]==nums[j]){
                    //swap with last pointer
                    int temp=nums[last];
                    nums[last]=nums[j];
                    nums[j]=temp;
                    last--;
                }
            }
        }
        for(int i=0;i<last+1;i++){
            System.out.println(nums[i]);
        }
        return last+1;
    }
}
