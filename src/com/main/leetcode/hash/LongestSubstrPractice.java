package com.main.leetcode.hash;

import java.util.HashMap;

/**
 * @author amruta.kajrekar
 * leetcode problem #3
 */
public class LongestSubstrPractice {
    public static void main(String[] args){
        LongestSubstrPractice prac = new LongestSubstrPractice();
//        System.out.println(prac.longestSubStr("rpwwkeirss"));
        System.out.println(prac.lengthOfLongestSubstring("bmmrpwrxybzabc"));

    }

    private int lengthOfLongestSubstring(String str) {
        int i=0,j=0,max=0;
        Integer prev = null;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String maxSubStr="";

        if(str.length()==0) return 0;
        else if(str.length()==1) return 1;
        else if(str.length()==2){
            if(str.charAt(0)==str.charAt(1)) return 1;
            else return 2;
        }
        else{

            while(j<str.length()){

                Integer newTemp = map.put(str.charAt(j), j);
                if((newTemp!=null && prev ==null) || (newTemp!=null && prev!=null && newTemp>prev)){
                    prev = newTemp;
                }

                if(prev!=null){
                    if(maxSubStr.length()< (j-i)) {
                        maxSubStr = str.substring(i, j);
                        max = Math.max(maxSubStr.length(), max);
                        System.out.println(maxSubStr);
                    }
                    i=prev+1;
                }
                j++;

            }//end of while
        }

        return Math.max((j-i),max);
    }

    public int longestSubStr(String str){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int i=0,j=0,max=0;
        Integer prev = null;
        String maxSubStr ="";

        if(str.length()==0) return 0;
        else if(str.length()==1) return 1;
        else if(str.length()==2) {
            if(str.charAt(0)!=str.charAt(1)) return 2;
            else return 1;
        }else{
            //for length longer than 2

            while(j<str.length()){

                Integer newTemp = map.put(str.charAt(j),j);
                if((newTemp!=null && prev ==null) || (newTemp!=null && prev!=null && newTemp>prev) ){
                    prev= newTemp;
                }
                if(prev!=null){
                    if(maxSubStr.length()<(j-i)){
                        maxSubStr = str.substring(i,j);
                    }
                    max=Math.max((j-i),max);
                    i=prev+1;
                }

                j++;
            }//end of while
        }

        return Math.max((j-i), max);
    }

}
