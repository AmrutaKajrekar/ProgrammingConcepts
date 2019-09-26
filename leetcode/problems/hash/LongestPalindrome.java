package problems.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author amruta.kajrekar on 6/5/18.
 */
public class LongestPalindrome {

    public static void main(String[] args){
        LongestPalindrome longest = new LongestPalindrome();
        System.out.println(longest);
    }

    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<s.length()-1;i++){
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1);
            else map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }

        int count =0; boolean odd = false;
        for(Map.Entry<Character, Integer> e:map.entrySet()){
            if(e.getValue() % 2 == 0){
                count++;
            }else{
                if((e.getValue()-1) % 2 == 0){
                    count++;
                }
            }
        }
        return 0;
    }
}
