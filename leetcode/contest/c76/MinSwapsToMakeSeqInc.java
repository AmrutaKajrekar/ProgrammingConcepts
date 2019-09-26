package contest.c76;

/**
 * @author amruta.kajrekar on 3/17/18.
 * leetcode problem #801
 *
 * We have two integer sequences A and B of the same non-zero length.
 * We are allowed to swap elements A[i] and B[i].  Note that both elements are in the same index position in their respective sequences.
 * At the end of some number of swaps, A and B are both strictly increasing.  (A sequence is strictly increasing if and only if A[0] < A[1] < A[2] < ... < A[A.length - 1].)
 * Given A and B, return the minimum number of swaps to make both sequences strictly increasing.  It is guaranteed that the given input always makes it possible.

Example:
Input: A = [1,3,5,4], B = [1,2,3,7]
Output: 1
Explanation:
Swap A[3] and B[3].  Then the sequences are:
A = [1, 3, 5, 7] and B = [1, 2, 3, 4]
which are both strictly increasing.
Note:

A, B are arrays with the same length, and that length will be in the range [1, 1000].
A[i], B[i] are integer values in the range [0, 2000].
 */
public class MinSwapsToMakeSeqInc {

    public static void main(String[] args){
        MinSwapsToMakeSeqInc swap = new MinSwapsToMakeSeqInc();
        int[] A= new int[]{0,7,8,10,10,11,12,13,19,18};//{0,4,4,5,9};
        int[] B= new int[]{4,4,5,7,11,14,15,16,17,20};//{0,1,6,8,10};//

        System.out.print(swap.minSwap(A,B));
    }

    public int minSwap(int[] A, int[] B) {
       int[] C = A.clone();
       int[] D = B.clone();
       int countA = calculateAFirst(A,B);
       int countB = calculateBFirst(C,D);

       return Math.min(countA,countB);
    }

    private int calculateBFirst(int[] A, int[] B) {
        int count =0;
        for(int i=0;i<B.length-1;i++){
            if(B[i]>= B[i+1]){
                if(B[i]<A[i+1]){
                    //swap

                    int temp =B[i];
                    B[i]=A[i];
                    A[i]=temp;
                    count++;
                }
            }
        }
        for(int i=0;i<A.length-1;i++){
            if(A[i]>= A[i+1]){
                if(A[i]<B[i+1]){
                    //swap
                    int temp =B[i];
                    B[i]=A[i];
                    A[i]=temp;
                    count++;
                }
            }
        }
        return count;
    }

    private int calculateAFirst(int[] A, int[] B) {
        int count =0;
        for(int i=0;i<A.length-1;i++){
            if(A[i]>= A[i+1]){
                if(A[i]<B[i+1]){
                    //swap
                    int temp =B[i];
                    B[i]=A[i];
                    A[i]=temp;
                    count++;
                }
            }
        }

        for(int i=0;i<B.length-1;i++){
            if(B[i]>= B[i+1]){
                if(B[i]<A[i+1]){
                    //swap
                    int temp =B[i];
                    B[i]=A[i];
                    A[i]=temp;
                    count++;
                }
            }
        }
        return count;
    }

}
