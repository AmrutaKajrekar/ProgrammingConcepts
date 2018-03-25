package problems.dynamicProgramming;

/**
 * @author amruta.kajrekar on 3/15/18.
 * leetcode problem # 279
 *
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 * For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.
 */
public class PerfectSquares {

    public static void main(String[] args){
        PerfectSquares sq = new PerfectSquares();
        System.out.println(sq.numSquares(12));
    }

    public int numSquares(int n) {
        int count = 0;

//        while(n>0 && temp>0) {
//            double sqrt = Math.sqrt(temp);
//            if(sqrt==(int)sqrt){
//                n-=(sqrt*sqrt);
//                temp = n;
//                count++;
//            }
//            else{
//                temp--;
//            }
//        }

        for(int i=1; i*i <=n; i++){

        }
        return count;
    }
}
