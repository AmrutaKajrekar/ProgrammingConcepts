package problems.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * @author amruta.kajrekar on 4/15/18.
 * leetcode problem # 712
 * Given two strings s1, s2, find the lowest ASCII sum of deleted characters to make two strings equal.

Example 1:
Input: s1 = "sea", s2 = "eat"
Output: 231
Explanation: Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.
Deleting "t" from "eat" adds 116 to the sum.
At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.
Example 2:
Input: s1 = "delete", s2 = "leet"
Output: 403
Explanation: Deleting "dee" from "delete" to turn the string into "let",
adds 100[d]+101[e]+101[e] to the sum.  Deleting "e" from "leet" adds 101[e] to the sum.
At the end, both strings are equal to "let", and the answer is 100+101+101+101 = 403.
If instead we turned both strings into "lee" or "eet", we would get answers of 433 or 417, which are higher.
Note:

0 < s1.length, s2.length <= 1000.
All elements of each string will have an ASCII value in [97, 122].

 */
public class MinAsciiDelete {

    public static void main(String[] args){
        MinAsciiDelete min = new MinAsciiDelete();
        System.out.print(min.minimumDeleteSum("delete", "leet"));
    }

    public int minimumDeleteSum(String s1, String s2) {
        int sum=0;
        String substr = findlongestSubStr(s1,s2);

        return sum;
    }

    private String findlongestSubStr(String s1, String s2) {
        String str ="";
        if(s1.length()>s2.length())
        for(int i=0,j=s1.length();i<s1.length() && j>=0;i++,j--){

        }

        return str;
    }

    public int minimumDeleteSum2(String s1, String s2) {
        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
        char[] s1c = s1.toCharArray();
        char[] s2c = s2.toCharArray();

        map1 = addToMap(s1c,map1);
        map1 = removeFromMap(s2c,map1);

        map2 = addToMap(s2c,map2);
        map2 = removeFromMap(s1c,map2);

        int sum = findAsciiSum(map1)+findAsciiSum(map2);
        return sum;
    }

    private int findAsciiSum(HashMap<Character, Integer> map) {
        int sum=0;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            sum += e.getKey() * e.getValue();
        }
        return sum;
    }

    private HashMap<Character,Integer> removeFromMap(char[] s, HashMap<Character, Integer> map) {
        for (int i = 0; i < s.length; i++) {
            if(map.containsKey(s[i])) {
                if(map.get(s[i])-1==0)
                    map.remove(s[i]);
                else
                    map.put(s[i], map.get(s[i]) - 1);
            }
        }
        return map;
    }

    private HashMap<Character,Integer> addToMap(char[] s, HashMap<Character, Integer> map) {
        for (int i = 0; i < s.length; i++) {
            if (map.containsKey(s[i])) {
                map.put(s[i], map.get(s[i]) + 1);
            } else {
                map.put(s[i], 1);
            }
        }
        return map;
    }


}
