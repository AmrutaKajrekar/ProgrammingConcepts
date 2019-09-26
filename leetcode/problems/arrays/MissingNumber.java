package problems.arrays;

/**
 * @author amruta.kajrekar on 5/12/18.
 * leetcode problem #268
 */
public class MissingNumber {

    public static void main(String[] args){
        MissingNumber num = new MissingNumber();
        System.out.println(num.missingNumber(new int[] {1,2}));
    }
    public int missingNumber(int[] nums) {
        int[] arr= new int[nums.length+1];

        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]==0) return i;
        }

        return 0;
    }

}
