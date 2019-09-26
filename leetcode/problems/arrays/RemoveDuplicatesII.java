package problems.arrays;

/**
 * @author amruta.kajrekar on 7/19/18.
 */
public class RemoveDuplicatesII {

    public static void main(String[] args){
        RemoveDuplicatesII dup = new RemoveDuplicatesII();
        int[] arr = new int []{1,1,1,1,2,2,3};
        int l = dup.removeDuplicates(arr);
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+",");
        }
    }

    public int removeDuplicates(int[] nums) {
        int c=0;
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[c]==nums[i]){
                j++;
                if(i==nums.length-1){
                    nums[++c]=nums[i];
                }
            }else{
                if(j>=2) c=c+2;
                else c++;
                nums[c]=nums[i];
                j=1;
            }
        }

        return c+1;
    }
}
