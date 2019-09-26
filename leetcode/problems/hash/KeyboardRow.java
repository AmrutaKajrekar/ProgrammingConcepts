package problems.hash;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * @author amruta.kajrekar on 4/14/18.
 * leetcode problem # 500 KeyboardRow
 * Given a List of words, return the words that can be typed using letters of
 * alphabet on only one row's of American keyboard like the image below.
 * American keyboard.
 *
Example 1:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.
 */
public class KeyboardRow {

    public static void main(String[] args){
        KeyboardRow row = new KeyboardRow();
        System.out.print(row.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
    }

    public String[] findWords(String[] words) {
        ArrayList<String> retlist = new ArrayList<String>();

        Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
        table.put('q',1);table.put('w',1);table.put('e',1);table.put('r',1);table.put('t',1);table.put('y',1);table.put('u',1);table.put('i',1);table.put('o',1);table.put('p',1);
        table.put('a',2);table.put('s',2);table.put('d',2);table.put('f',2);table.put('g',2);table.put('h',2);table.put('j',2);table.put('k',2);table.put('l',2);
        table.put('z',3);table.put('x',3);table.put('c',3);table.put('v',3);table.put('b',3);table.put('n',3);table.put('m',3);

        for(int i=0;i<words.length;i++){
            //each word: find row number
            int row =  table.get(words[i].toLowerCase().charAt(0));
            boolean isPresent = true;
            for(int k=1;k<words[i].length();k++){
                if(row!= table.get(words[i].toLowerCase().charAt(k))) {
                    isPresent = false;
                    break;
                }
            }
            if(isPresent) retlist.add(words[i]);
        }
        return retlist.toArray(new String[0]);
    }
}
