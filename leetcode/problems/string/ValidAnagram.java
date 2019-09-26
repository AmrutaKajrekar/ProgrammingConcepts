package problems.string;

import java.util.Arrays;

/**
 * @author amruta.kajrekar on 4/8/18.
 */
public class ValidAnagram {
    public static void main(String[] args){
        ValidAnagram ana = new ValidAnagram();
        System.out.print(ana.isAnagram("a","a"));
    }

    public boolean isAnagram(String s, String t) {
        if(s==null || t== null) return false;
        if(s.length()==t.length() && s.length()==0) return true;
        char[] sc = s.toCharArray();
        char[] st = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(st);

        if(String.valueOf(sc).equalsIgnoreCase(String.valueOf(st))){
            return true;
        }else{
            return false;
        }
    }

}
