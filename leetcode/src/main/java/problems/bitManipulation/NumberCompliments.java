package problems.bitManipulation;

/**
 * @author amruta.kajrekar on 4/29/18.
 * leetcode problem #476
 * Given a positive integer, output its complement number.
 * The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.

 */
public class NumberCompliments {

    public static void main(String[] args){
        NumberCompliments num = new NumberCompliments();
        System.out.print(num.findComplement(5));
    }

    public int findComplement(int num) {
        if(num<0) return 0;
        String binary = Integer.toBinaryString(num);
        String complement = Integer.toBinaryString(~num);

        String s = complement.substring(complement.length()-binary.length());
        return Integer.parseInt(s,2);
    }
}
