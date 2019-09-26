package problems.string;

import java.util.*;

/**
 * @author amruta.kajrekar on 4/8/18.
 * leetcode problem # 49
 * Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
Return:

[
["ate", "eat","tea"],
["nat","tan"],
["bat"]
]
Note: All inputs will be in lower-case.

 */
public class GroupAnagrams {

    public static void main(String[] args){
        GroupAnagrams group = new GroupAnagrams();
        System.out.print(group.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<List<String>>();

        HashMap<String, ArrayList> hashmap = new HashMap<String, ArrayList>();

        for(int i=0; i<strs.length; i++){
            char[] sorted = strs[i].toCharArray();
            Arrays.sort(sorted);
            if(!hashmap.containsKey(String.valueOf(sorted))){
                ArrayList l = new ArrayList();
                l.add(strs[i]);
                hashmap.put(String.valueOf(sorted),l);
            }else{
                ArrayList l = ((ArrayList) hashmap.get(String.valueOf(sorted)));
                l.add(strs[i]);
                hashmap.put(String.valueOf(sorted),l);
            }
        }

        Iterator it = hashmap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            list.add((ArrayList)pair.getValue()); // avoids a ConcurrentModificationException
        }
        return list;
    }

}
