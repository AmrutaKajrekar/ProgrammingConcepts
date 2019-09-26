package problems.dynamicProgramming;

/**
 * @author amruta.kajrekar on 6/14/18.
 */
public class ArithmeticSlices {

    public static void main(String[] args){
        ArithmeticSlices slice = new ArithmeticSlices();
        System.out.println(slice.numberOfArithmeticSlices(new int[]{1,2,3,4,6,7,8}));
    }

    public int numberOfArithmeticSlices(int[] A) {
        int[] dp = new int[A.length];
        dp[0]=0;
        int count =0;

        for(int i=1;i<A.length;i++){
            dp[i] = A[i]-A[i-1];
        }

        for(int i=1;i<dp.length-2;i++){
            if(dp[i]==dp[i+1] && dp[i]==dp[i+2]){
                count++;
            }
        }

        boolean isequal = true;
        for(int i=1;i<A.length-2;i++){
            if(dp[i]!=dp[i+1]) isequal=false;
        }

        if(isequal) count++;

        return count+1;
    }
}
