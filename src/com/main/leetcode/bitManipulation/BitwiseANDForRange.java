package com.main.leetcode.bitManipulation;

/**
 * @author amruta.kajrekar
 * leetcode problem #201
 *
 *Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
For example, given the range [5, 7], you should return 4.
 */
public class BitwiseANDForRange {


    public static void main(String[] args){

        BitwiseANDForRange range = new BitwiseANDForRange();
        System.out.println(range.rangeBitwiseAnd(5,7));
    }

    public int rangeBitwiseAnd(int m, int n) {
//        int add = m & n;
//        int or = m ^ n;
//        int inor = m | n;
        if(m==n){
            return m;
        }
        if(n==m+1) {
            int addition = m & m + 1;
            return addition;
        }
         else if(n> m+1){
            int addition = m & (m + 1);
            for (int i = m+2; i <= n; i++) {
                addition = addition & i;
//                int carry = addition & i;
//                addition &= carry & sum;
            }
            return addition;
        }
        return 0;
    }
}
