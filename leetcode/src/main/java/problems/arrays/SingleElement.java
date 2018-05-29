package problems.arrays;

/**
 * @author amruta.kajrekar on 5/15/18.
 */
public class SingleElement {
    public static void main(String[] args){

        SingleElement num = new SingleElement();
        System.out.println(num.singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
    }

    public int singleNonDuplicate(int[] nums) {
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]!=nums[i] && nums[i+1]!=nums[i]){
                return nums[i];
            }
        }
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];

        return 0;
    }

}
