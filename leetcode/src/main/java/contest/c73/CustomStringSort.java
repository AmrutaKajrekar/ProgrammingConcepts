package contest.c73;

import java.util.*;

/**
 * @author amruta.kajrekar
 */
public class CustomStringSort {
    public static void main(String[] args){
        CustomStringSort custom = new CustomStringSort();
        System.out.println(custom.customSortString("cba", "axxbxxcxxabc"));
    }

    public String customSortString(String S, String T) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<S.length(); i++){
            map.put(S.charAt(i),i);
        }

        List<Character> list = new ArrayList<Character>();

        for(int j=0;j<T.length();j++){
            if(map.containsKey(T.charAt(j))) list.add(T.charAt(j));
        }

        Collections.sort(
                list, (Character a, Character b)-> map.get(a)-map.get(b));

        char[] result = new char[T.length()];
        for(int i=0,j=0;i<result.length;i++){
            char c = T.charAt(i);
            result[i]= map.containsKey(c)? list.get(j++) : c;
        }
        return new String(result);

    }


    public String customSortString2(String S, String T) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), i);
        }

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            if (map.containsKey(c)) list.add(c);
        }

        Collections.sort(list, (Character a, Character b) -> map.get(a) - map.get(b));

        char[] result = new char[T.length()];

        for (int i = 0, j = 0; i < result.length; i++) {
            char c = T.charAt(i);
            result[i] = map.containsKey(c) ? list.get(j++) : c;
        }

        return new String(result);
    }
}
