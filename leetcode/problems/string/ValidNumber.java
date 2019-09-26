package problems.string;

import java.util.regex.Pattern;

/**
 * @author amruta.kajrekar on 4/27/18.
 * leetcode problem # 65
 * Validate if a given string is numeric.

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true

Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.
 */
public class ValidNumber {

    public static void main(String[] args){
        ValidNumber num = new ValidNumber();
        System.out.print(num.isNumber("2e0"));
    }

    //all numbers
    //numbers and period
    //numbers and expo
    //numbers expo and +
    //letters
    //letters and numbers
    //more than 1 .
    //Pattern.matches("[-+]?(([0-9]+([.][0-9]*)?)|[.][0-9]+)(e[-+]?[0-9]+)?", s.trim())

    public boolean isNumber(String s){
        s=s.trim();
        return Pattern.matches("[-+]?(([0-9]+([.][0-9]*)?)|[.][0-9]+)(e[-+]?[0-9]+)?",s);
    }
    public boolean isNumber2(String s) {
        s=s.trim();
        if(s.length()==0) return false;
        char[] c = s.toCharArray();
        if(s.length()==1 && (s.charAt(0)=='.' ||s.charAt(0)==' ')) return false;
        boolean atLeastDigit = false; int count = 0;
        boolean expoFound = false; int expo =0;

        for (int i=0;i<c.length;i++){
//            if(!(Character.isDigit(c[i])||c[i]=='.')){
//                return false;
//            }
            if(Character.isDigit(c[i])) atLeastDigit = true;
            else if(c[i]=='.'){
                count++;
                if(count>1) return false;
            }
            else if (Character.isLetter(c[i])){
                if(c[i]=='e') {
                    expoFound=true;
                    expo++;
                }
                else return false;
            }
        }

        if(expoFound && expo==1){
            try{
                Double.valueOf(s).longValue();
                return true;
            }catch (NumberFormatException n){
                return false;
            }
        }
        if(atLeastDigit && count<=1){
            return true;
        }
        else return false;
    }
}
