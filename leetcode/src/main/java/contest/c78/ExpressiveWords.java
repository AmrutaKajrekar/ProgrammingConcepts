package contest.c78;

import java.util.HashMap;
import java.util.Map;

/**
 * @author amruta.kajrekar on 3/31/18.
 * leetcode problem #809. Expressive Words
Sometimes people repeat letters to represent extra feeling, such as "hello" -> "heeellooo", "hi" -> "hiiii".  Here, we have groups, of adjacent letters that are all the same character, and adjacent characters to the group are different.  A group is extended if that group is length 3 or more, so "e" and "o" would be extended in the first example, and "i" would be extended in the second example.  As another example, the groups of "abbcccaaaa" would be "a", "bb", "ccc", and "aaaa"; and "ccc" and "aaaa" are the extended groups of that string.

For some given string S, a query word is stretchy if it can be made to be equal to S by extending some groups.  Formally, we are allowed to repeatedly choose a group (as defined above) of characters c, and add some number of the same character c to it so that the length of the group is 3 or more.  Note that we cannot extend a group of size one like "h" to a group of size two like "hh" - all extensions must leave the group extended - ie., at least 3 characters long.

Given a list of query words, return the number of words that are stretchy.

Example:
Input:
S = "heeellooo"
words = ["hello", "hi", "helo"]
Output: 1
Explanation:
We can extend "e" and "o" in the word "hello" to get "heeellooo".
We can't extend "helo" to get "heeellooo" because the group "ll" is not extended.
Notes:

0 <= len(S) <= 100.
0 <= len(words) <= 100.
0 <= len(words[i]) <= 100.
S and all words in words consist only of lowercase letters
 */
public class ExpressiveWords {

    public static void main(String[] args){
        ExpressiveWords words = new ExpressiveWords();
        System.out.print(words.expressiveWords("heeellooo", new String[]{"hello", "hi", "helo"}));
    }

    public int expressiveWords(String S, String[] words) {
        HashMap<Character, Integer> smap = new HashMap<Character, Integer>();
        int count=0;
        for(int i=0; i<S.length();i++){
            if(!smap.containsKey(S.charAt(i)))
            smap.put(S.charAt(i),getCount(S,i));
        }

        for(int p=0;p<words.length;p++){
            HashMap<Character, Integer> temp = new HashMap<Character, Integer>();
            for(int i=0; i<words[p].length();i++){
                if(!temp.containsKey(words[p].charAt(i)))
                    temp.put(words[p].charAt(i),getCount(words[p],i));
            }

            //3 conditions:
            //temp.val == word.val
            //temp.val< word.val
            //else skip
            boolean wordValid = false;
            for (Map.Entry<Character, Integer> e:smap.entrySet()) {
                int tempVal =0;
                wordValid = false;
                if(temp.containsKey(e.getKey())) {
                    tempVal = temp.get(e.getKey());
                }
                if(tempVal>0) {
                    if (tempVal == e.getValue()) {
                        wordValid = true;
                    } else if (tempVal < e.getValue()) {
                        if (e.getValue() >= 3) {
                            wordValid = true;
                        }
                        else{
                            wordValid = false;
                            break;
                        }
                    } else {
                        wordValid = false;
                        break;
                    }
                }

            }
            if(wordValid) count++;

        }
    return count;
    }

    private Integer getCount(String S, int i) {
        int j=i+1, c =1;
            while (j<S.length() && S.charAt(i) == S.charAt(j)) {
                c++;
                if (j < S.length() - 1) {
                    j++;
                } else {
                    break;
                }
            }
        return c;
    }

    public int expressiveWords2(String S, String[] words) {
        StringBuilder word = new StringBuilder("");
        int i=0,j=1, count =0;
                //keep 2 pointers i & j// compare
//        word.append(S.charAt(i));
        while(j<S.length()) {
            count =1;
            while (S.charAt(i) == S.charAt(j)) {
                count++;
                if(j<S.length()-1) {
                    j++;
                }else{
                    break;
                }
            }
            if(count>=3) {
                word.append(S.charAt(j-1));
            }else{
                word.append(S.substring(i,j));
            }
            i=j;
            j++;
        }
//        System.out.print("word="+word);
        count=0;
        for(int k=0;k<words.length;k++){
            if(word.toString().contains(words[k])){
                count++;
            }
        }
        return count;
    }
}
