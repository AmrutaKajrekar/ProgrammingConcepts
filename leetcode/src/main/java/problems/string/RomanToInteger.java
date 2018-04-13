package problems.string;

/**
 * @author amruta.kajrekar on 3/24/18.
 * leetcode problem #13
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 */
public class RomanToInteger {

    public static void main(String[] args){
        RomanToInteger roman = new RomanToInteger();
        System.out.print(roman.romanToInt("L"));
    }

    public int romanToInt(String s) {
        int integer=0;

        for (int i=0;i<s.length();i++){
            int val = getVal(s.charAt(i));
            if(i<s.length()-1 &&  val< getVal(s.charAt(i+1))){
                integer -=val;
            }else{
                integer +=val;
            }
        }
        return integer;
    }

    private int getVal(char c) {
        switch (c){
        case 'I': return 1;

        case 'V': return 5;

        case 'X': return 10;

        case 'L': return 50;

        case 'C': return 100;

        case 'D': return 500;

        case 'M': return 1000;

        }
        return 0;
    }

}
