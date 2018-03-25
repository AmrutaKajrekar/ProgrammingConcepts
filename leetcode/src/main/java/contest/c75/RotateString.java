package contest.c75;

/**
 * @author amruta.kajrekar on 3/11/18.
 * leetcode problem #796
 *
 * We are given two strings, A and B.

A shift on A consists of taking string A and moving the leftmost character to the rightmost position.
For example, if A = 'abcde', then it will be 'bcdea' after one shift on A.
Return True if and only if A can become B after some number of shifts on A.

Example 1:
Input: A = 'abcde', B = 'cdeab'
Output: true

Example 2:
Input: A = 'abcde', B = 'abced'
Output: false
Note:

A and B will have length at most 100.
 */
public class RotateString {
    public static void main(String[] args){
        RotateString str = new RotateString();
        System.out.println(str.rotateString("abcde", "cdeab"));
    }

    public boolean rotateString(String A, String B) {
        if(A.length()!=B.length()) return false;

        for(int i=0; i<A.length(); i++){
            A = rightShiftByOne(A);
            System.out.println(A);
            if(B.equals(A)){
                return true;
            }
        }
        return false;
    }

    private String rightShiftByOne(String a) {
        return a.substring(1, a.length()) + a.substring(0,1);
    }

}
