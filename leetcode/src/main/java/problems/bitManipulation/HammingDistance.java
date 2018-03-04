package problems.bitManipulation;

/**
 * @author amruta.kajrekar
 * leetcode problem #461
 *
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.
Note:
0 ≤ x, y < 231.

Example:
Input: x = 1, y = 4
Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
 */

public class HammingDistance {


    public static void main(String[] args){
        HammingDistance hamming = new HammingDistance();
        System.out.println(hamming.hammingDistance(1,4));
    }

    public int hammingDistance(String x,String y){
        int counter=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)!=y.charAt(i)){
                counter++;
            }
        }
        return counter;
    }


    public int hammingDistance(int x, int y) {
        String bin1= Integer.toBinaryString(x);
        String bin2= Integer.toBinaryString(y);

        StringBuilder sb = new StringBuilder();
        if(bin1.length() < bin2.length()) {
            while (sb.length() + bin1.length() < bin2.length()) {
                sb.append('0');
            }
            sb.append(bin1);
            bin1=sb.toString();
        }
        sb = new StringBuilder();
        if(bin2.length() < bin1.length()) {
            while (sb.length() + bin2.length() < bin1.length()) {
                sb.append('0');
            }
            sb.append(bin2);
            bin2=sb.toString();
        }
        int counter=0;
        for(int i=0;i<bin1.length(); i++){
            if(bin1.charAt(i)!=bin2.charAt(i)){
                counter++;
            }
        }
        return counter;
    }

}
