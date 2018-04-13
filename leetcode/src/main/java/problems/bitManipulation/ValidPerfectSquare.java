package problems.bitManipulation;

/**
 * @author amruta.kajrekar on 3/3/18.
 * leetcode problem #367
 *
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Returns: True
Example 2:

Input: 14
Returns: False
 */
public class ValidPerfectSquare {

    public static void main(String[] args){

        ValidPerfectSquare sq=  new ValidPerfectSquare();
        sq.isPerfectSquare(16);
    }

    public boolean isPerfectSquare(int num) {
        if(num==1) return true;

        long t=num;
        while(t*t>num){
            t=(num/t + t)/2;
        }
        return (t*t==num);
    }
}
