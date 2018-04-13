package problems.string;

/**
 * @author amruta.kajrekar on 4/13/18.
 * leetcode problem #
 *
 * Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
[−231,  231 − 1].
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

 */
public class ReserverInteger {

    public static void main(String[] args){
        ReserverInteger rev = new ReserverInteger();
        System.out.print(rev.reverse(1534236469));
    }

    public int reverse(int x) {
        char[] c = String.valueOf(x).toCharArray();
        StringBuilder ret = new StringBuilder();
        int endpt = 0;
        if(c[0]=='-') {ret.append("-"); endpt = 1;}
        for(int i=c.length-1; i>=endpt; i--){
            ret.append(c[i]);
        }
        try {
            return Integer.parseInt(ret.toString());
        }catch (NumberFormatException e){
            return 0;
        }
    }
}
