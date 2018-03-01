package problems.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author amruta.kajrekar
 * leetcode problem #767
 *
 * Given a string S, check if the letters can be rearranged so that two characters that are adjacent to each other are not the same.
If possible, output any possible result.  If not possible, return the empty string.

Example 1:

Input: S = "aab"
Output: "aba"
Example 2:

Input: S = "aaab"
Output: ""
Note:

S will consist of lowercase letters and have length in range [1, 500].
 */
public class ReorganizeStrings {

    public static void main(String[] args){
        ReorganizeStrings org = new ReorganizeStrings();
        System.out.println(org.reorganizeString("aab"));
    }

    private String reorganizeString(String s) {
        int[] chars = new int[26];
        for(int i=0;i<s.length(); i++) {
            chars[(s.charAt(i)) -'a'] += 100;
        }
        for (int i = 0; i < 26; ++i) chars[i] += i;
        Arrays.sort(chars);

        char[] array = new char[s.length()];
        for(int c: chars){

        }
        return "";
    }

    public String reorganizeString2(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        StringBuilder returnStr = new StringBuilder("");
        int maxCnt =0;
        for(int i=0;i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i), count);
                if(count>maxCnt) maxCnt=count;
            } else {
                map.put(s.charAt(i), 1);
                if(1>maxCnt) maxCnt=1;
            }
        }
//        if(maxCnt>)
            Iterator it = map.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry pair = (Map.Entry)it.next();
                if((returnStr.charAt(returnStr.length()-1)) != ((Character)pair.getKey()) );
                returnStr=returnStr.append(pair.getKey());
            }
        return returnStr.toString();
    }

}
