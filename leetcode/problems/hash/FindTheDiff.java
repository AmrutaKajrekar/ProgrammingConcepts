package problems.hash;

import java.util.HashMap;

/**
 * @author amruta.kajrekar on 5/12/18.
 */
public class FindTheDiff {

    public static void main(String[] args){
        FindTheDiff diff = new FindTheDiff();
        System.out.println(diff.findTheDifference("abcd", "badct"));
    }
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1);
            else map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }

        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))) return t.charAt(i);
            else {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                if(map.get(t.charAt(i)) == -1) return t.charAt(i);
            }
        }

        return 0;
    }

}
