package problems.hash;

import java.util.Hashtable;

/**
 * @author amruta.kajrekar
 * leetcode problem #771
 *
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
Each character in S is a type of stone you have.
You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: J = "aA", S = "aAAbbbb"
Output: 3
 */

public class JewelsAndStones {
    public static void main(String[] args){
        JewelsAndStones jewels = new JewelsAndStones();
        jewels.numJewelsInStones("aA","aAAAbbb");
    }

    public int numJewelsInStones(String J, String S) {
        //iterate J-> for each J, increcement the counter if letter found in S

        Hashtable<Character, Integer> stone= new Hashtable<Character, Integer>();
        for(int i=0;i<S.length();i++){
            if(stone.containsKey(S.charAt(i))){
                stone.put(S.charAt(i),stone.get(S.charAt(i)) +1);
            }else{
                stone.put(S.charAt(i),1);
            }
        }
        int counter =0;
        for(int i=0;i<J.length();i++){
            if(stone.containsKey(J.charAt(i))){
                counter+=stone.get(J.charAt(i));
            }
        }
        return counter;
    }
}
