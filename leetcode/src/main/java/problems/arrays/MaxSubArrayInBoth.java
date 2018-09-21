package problems.arrays;

/**
 * @author amruta.kajrekar on 8/27/18.
 * problem # 718:
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
public class MaxSubArrayInBoth {

  public static void main(String[] args){
  MaxSubArrayInBoth max = new MaxSubArrayInBoth();
  System.out.print(max.findLength(new int[]{0,0,0,0,0,0,1,0,0,0}, new int[]{0,0,0,0,0,0,0,1,0,0,}));
  }
  public int findLength(int[] A, int[] B) {
    int max =0;
    int count=0;
    for(int i=0;i<A.length;i++){
      for(int j=0;j<B.length;j++){
        if (i<A.length && A[i]==B[j]) {
          i++;
          count++;
        }else{
          max = Math.max(max, count);
          count=0;
        }
      }

    }

    return Math.max(max, count);
  }

}
