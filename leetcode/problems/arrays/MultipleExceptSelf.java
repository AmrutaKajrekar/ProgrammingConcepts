package problems.arrays;

/**
 * @author amruta.kajrekar on 7/17/18.
 */
public class MultipleExceptSelf {
    public static void main(String[] args){
        MultipleExceptSelf self = new MultipleExceptSelf();
        System.out.println(self.productExceptSelf(new int[]{1,2,3,4}));
    }

    public int[] productExceptSelf(int[] nums) {
        int [] res = new int[nums.length];
        res[0] = 1;
        for(int i = 1; i < nums.length; i++){
            System.out.println("nums[i - 1]="+ nums[i - 1]+ ", res[i - 1]="+ res[i - 1]);
            res[i] = nums[i - 1] * res[i - 1];
        }
        int right = 1;

        for(int i = nums.length - 1; i >= 0; i--){
            System.out.println("res[i] * right="+ res[i] * right + ", nums[i] * right="+ nums[i] * right);
            res[i] = res[i] * right;
            right = nums[i] * right;
        }
        return res;
    }
}
