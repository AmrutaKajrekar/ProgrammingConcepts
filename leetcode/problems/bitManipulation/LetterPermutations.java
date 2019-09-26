package problems.bitManipulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author amruta.kajrekar
 * leetcode problem #784
 *
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.

Examples:
Input: S = "a1b2"
Output: ["a1b2", "a1B2", "A1b2", "A1B2"]

Input: S = "3z4"
Output: ["3z4", "3Z4"]

Input: S = "12345"
Output: ["12345"]
 *
 */
public class LetterPermutations {

    public static void main(String[] args){
        LetterPermutations perm = new LetterPermutations();
        System.out.println(perm.letterCasePermutation("3z4"));
    }
    public List<String> letterCasePermutation(String S) {
        int combo = (int)Math.pow(2,S.length());
        Set result = new HashSet<String>();
//        List<String> result = new ArrayList<String>();

        for(int i=0;i<combo; i++){
           char[] out = S.toCharArray();
            for(int j=0;j<S.length();j++){
                if(((i>>j) & 1) == 1 ){
                    out[j] = S.toUpperCase().charAt(j);
                }
                else{
                    out[j] = S.toLowerCase().charAt(j);
                }
            }
            result.add(new String(out));
        }
        List<String> list = new ArrayList<String>(result);
        return list;
    }
    
}
