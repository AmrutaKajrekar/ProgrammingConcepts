package problems.dynamicProgramming;

import java.util.ArrayList;

/**
 * @author amruta.kajrekar on 4/17/18.
 * leetcode problem #647 Palindromic sub string
 * Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:
Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:
Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
Note:
The input string length won't exceed 1000.

 */
public class PalindromicSubString {

    public static void main(String[] args){
        PalindromicSubString sub = new PalindromicSubString();
        System.out.print(sub.countSubstrings("abcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcttttttttttttrtewwerwqereqwraaaaaaaaaaaaaaaaaaaaaaaaaaaaaasfdsafadadsasdasdasdasdasdasdasdasdasdasddasdasdasasdaa"));
    }

    public int countSubstrings(String s) {
        ArrayList<String> list = new ArrayList<>();
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<=str.length && j>=i;j++) {
                if (isPal(s.substring(i, j))) {
                    list.add(s.substring(i, j));
                }
            }
        }
        return list.size();
    }

    private boolean isPal(String substring) {
        for(int i=0;i< substring.length()/2;i++){
            if(substring.charAt(i)!=substring.charAt(substring.length()-1-i)) return false;
        }
        return true;
    }

    private boolean isPal3(String substring) {
        int i=0;
        while(i<substring.length()/2){
            if(substring.charAt(i)!=substring.charAt(substring.length()-1-i)) return false;
            i++;
        }
        return true;
    }

    public int countSubstrings2(String s) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
//            for(int j=i+1;j<=str.length && j>=i;j++) {
//                if (isPal(s,i,j)) {
//                    list.add(s.substring(i, j));
//                }
//            }
            if(isPal2(s,i,i)) list.add(s.substring(i, i));
            if(isPal2(s,i,i+1)) list.add(s.substring(i, i+1));
        }
        return list.size();
    }

    private boolean isPal2(String s, int i, int j) {
        while(i>=0 && j>=0 && i<s.length() && j<s.length()){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }

}
