package problems.bitManipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amruta.kajrekar
 * leetcode problem #477
 *
 *The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Now your job is to find the total Hamming distance between all pairs of the given numbers.

Example:
Input: 4, 14, 2
Output: 6

Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just
showing the four bits relevant in this case). So the answer will be:
HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
Note:
Elements of the given array are in the range of 0 to 10^9
Length of the array will not exceed 10^4
 */

public class TotalHammingDistance {
    
    public static void main(String[] args){
        TotalHammingDistance hamming = new TotalHammingDistance();
        System.out.println("final" +hamming.totalHammingDistance(new int[]{6,1,8,6,8}));
    }

    public int totalHammingDistance(int[] nums) {

        if(nums.length <2) return 0;

        int counter=0;
        List<String> bitStr = new ArrayList<String>();
        int max_size=0;
        //convert all int to binary strings
        for (int i=0;i<nums.length;i++){
            String str= Integer.toBinaryString(nums[i]);
            bitStr.add(str);
            if(str.length()>max_size){
                max_size=str.length();
            }
        }

        //find the max size and make all String lengths equal
        for(int i=0;i<bitStr.size();i++) {
            StringBuilder sb = new StringBuilder();
            if (bitStr.get(i).length() < max_size) {
                while (sb.length() + bitStr.get(i).length() < max_size) {
                    sb.append('0');
                }
            }
            sb.append(bitStr.get(i));
            bitStr.set(i,sb.toString());
            System.out.println("Str= " + bitStr.get(i));
        }

        HammingDistance ham = new HammingDistance();

        //iterate through the list and calculate haming distance for each of the 2 strings
        // and keep the counter adding
        if(bitStr.size()>2) {
            for (int i = 0; i < bitStr.size() - 1; i++) {
                int newCounter = ham.hammingDistance(bitStr.get(i), bitStr.get(i + 1));
                counter += newCounter;
                System.out.println("dist"+ newCounter);
            }
        }
        counter+=ham.hammingDistance(bitStr.get(0),bitStr.get(bitStr.size()-1));
        return counter;
    }
}
