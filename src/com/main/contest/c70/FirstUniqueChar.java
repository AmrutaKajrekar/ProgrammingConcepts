package com.main.contest.c70;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author amruta.kajrekar
 * leetcode problem #387
 */
public class FirstUniqueChar {
    public static void main(String[] args){
        FirstUniqueChar first = new FirstUniqueChar();
        System.out.println(first.firstUniqChar("z"));
    }
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        public int firstUniqChar(String s) {
            char[] array= s.toCharArray();
            for(int i=0; i<array.length; i++){
                if(!map.containsKey(array[i])){
                    map.put(array[i],1);
                }else{
                    map.put(array[i], map.get(array[i])+1);
                }
            }
            boolean found = false;
            final char[] key = new char[1];
            for(Map.Entry entry:map.entrySet())
            {
                System.out.println(entry.getKey()+","+entry.getValue());
                if(Integer.parseInt(entry.getValue().toString())==1) return (s.indexOf(entry.getKey().toString()));
            }

            return -1;
        }
    }
