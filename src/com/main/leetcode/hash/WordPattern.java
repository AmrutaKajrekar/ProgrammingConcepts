package com.main.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author amruta.kajrekar
 * leetcode problem #290
 *
 * Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */
public class WordPattern {

    public static void main(String[] args){
        WordPattern pattern = new WordPattern();
        System.out.println(pattern.wordPattern("syyss","a abc abc a abc"));
    }

    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }


    public boolean wordPattern2(String pattern, String str) {

       if(!str.contains(" ")){
           if(pattern.length()==1) return true;
           else return false;
       }
        if(str.contains(" ")&& str.split(" ").length==pattern.length()){
           String[] words = str.split(" ");
           HashMap<String, Character> map = new HashMap<String, Character>();

           for (int i = 0; i  < pattern.length(); i++) {
               if (!map.containsValue(pattern.charAt(i))) {
                   map.put(";"+words[i]+";", pattern.charAt(i));
               }
           }

           StringBuilder newS=new StringBuilder();
           for (int i=0;i<words.length;i++){
               newS.append(";"+words[i]+ "; ");
           }
           if(' '==newS.charAt(newS.length()-1)){
            str =newS.toString().substring(0,newS.length()-1);
        }else{
               str =newS.toString();
           }

           for (Map.Entry entry : map.entrySet()) {
               str = str.replaceAll(entry.getKey().toString(), entry.getValue().toString());
           }
           str = str.replaceAll(" ", "");
            str = str.replaceAll(";", "");

        return pattern.equalsIgnoreCase(str);
        }
        return false;
    }
}
