package problems.dynamicProgramming;

/**
 * @author amruta.kajrekar on 4/25/18.
 * leetcode problem # 718
 *
 * Given two integer arrays A and B, return the maximum length of an subarray that appears in both arrays.
Example 1:
Input:
A: [1,2,3,2,1]
B: [3,2,1,4,7]
Output: 3
Explanation:
The repeated subarray with maximum length is [3, 2, 1].
Note:
1 <= len(A), len(B) <= 1000
0 <= A[i], B[i] < 100

 */
public class MaxRepeatedSubArray {
    public static void main(String[] args){
        MaxRepeatedSubArray sub = new MaxRepeatedSubArray();
        int[] A = new int[]{1,2,3,2,1};
        int[] B = new int[]{3,2,1,4,7};
        System.out.print(sub.findLength(A,B));
    }

    public int findLength2(int[] A, int[] B) {
        int min = Math.min(A.length,B.length);
        int count=0;int i=0;int j=0;

        while(i<A.length){
            while(j<B.length){
                if(A[i]==B[j]){
                    j++;
                    count++;
                    break;
                }else{
                    j++;
                    count=0;
                }
            }
            i++;
        }
        return count;
    }


    public int findLength(int[] A, int[] B) {
        int[][] dp = new int[A.length + 1][B.length + 1];
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], 1 + dp[i][j]);
                    max = Math.max(max, dp[i + 1][j + 1]);
                }
            }
        }
        return max;
    }
}
