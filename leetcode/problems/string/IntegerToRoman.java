package problems.string;

/**
 * @author amruta.kajrekar on 3/24/18.
 * leetcode problem #12
 *
 * Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
 */
public class IntegerToRoman {

    public static void main(String[] args){
        IntegerToRoman roman = new IntegerToRoman();
        System.out.print(roman.intToRoman(325));
    }

    public String intToRoman(int num) {
        String[][] roman = {{"", "I","II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                            {"", "X","XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                            {"", "C","CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                            {"", "M","MM", "MMM"}};
        StringBuilder integer = new StringBuilder();
        integer.append(roman[3][num/1000])
                .append(roman[2][(num/100)%10])
                .append(roman[1][(num/10)%10])
                .append(roman[0][num%10]);
        return integer.toString();
    }

}
