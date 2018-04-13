package problems.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amruta.kajrekar on 3/6/18.
 * leetcode problem #131 - This solution does not run as expected
 *
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * Return all possible palindrome partitioning of s.

For example, given s = "aab",
Return

[
["aa","b"],
["a","a","b"]
]


[[a, a, b, aa, b], [a, a, b, aa, b]]


 [aaa]
 [aa,a]
 [a,a,a]
 */
public class PalindromePartitioning {

    public static void main(String[] args){
        PalindromePartitioning pal = new PalindromePartitioning();
        System.out.print(pal.partition("abb"));
    }

    public List<List<String>> partition(String s) {
       List<List<String>> res = new ArrayList<List<String>>();
       ArrayList<String> temp = new ArrayList<String>();

       findParts(res, temp, s);
       return res;
    }


    private void findParts(List<List<String>> res, ArrayList<String> temp, String s) {
        String ori = s;
        if(s.length()==0){
            res.add(new ArrayList<>(temp));
            System.out.println("res"+res);
            return;
        }
//        else if(isPal(s)){
//            temp.add(s);
//            findParts(res, temp, s.substring(s.length()-1));
//            temp.clear();
//        }
        int l=0;
        for(int i=l;i<s.length();i++){
            if(isPal(s.substring(0,l+1))){
                temp.add(s.substring(0,l+1));
                System.out.println("temp"+temp);
                findParts(res, temp, s.substring(l+1));
                temp.clear();
            }
        }
    }

    private boolean isPal(String s) {
        for (int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
}
