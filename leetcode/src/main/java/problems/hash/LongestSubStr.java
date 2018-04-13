package problems.hash;

import java.util.HashMap;

/**
 * @author amruta.kajrekar
 * leetcode problem #3
 * Given a string, find the length of the longest substring without repeating characters.

Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3.

Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubStr {


    public static void main(String[] args){
        LongestSubStr str = new LongestSubStr();
        System.out.println(str.lengthOfLongestSubstring("dvdf")); //("rpwwkeirsss"));
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        int max =0, i=0, j=0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        String maxSubStr="";
        Integer prev=null;
        while(j<s.length()){
            Integer newTemp = map.put(s.charAt(j),j);
            if((newTemp!=null && prev==null) || (newTemp!=null && prev!=null && newTemp>prev)){
                prev=newTemp;
            }
            if(prev!=null){ //this means it is duplicate
                if(maxSubStr.length() < (j-i)) {
                    maxSubStr = s.substring(i, j);
                }
                max= Math.max((j-i),max);
                i=prev+1;
            }
            j++;
        }
        System.out.println(s.substring(i, j));
        return Math.max((j-i),max);
    }
}
