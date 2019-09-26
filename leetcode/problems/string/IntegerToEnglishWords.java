package problems.string;

/**
 * @author amruta.kajrekar on 3/24/18.
 * leetcode problem #273
 *
 * Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 2^31 - 1.
 *
 * For example,
 * 123 -> "One Hundred Twenty Three"
 * 12345 -> "Twelve Thousand Three Hundred Forty Five"
 * 1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 */
public class IntegerToEnglishWords {

    public static void main(String[] args){
        IntegerToEnglishWords english = new IntegerToEnglishWords();
        System.out.print(english.numberToWords(035043));
    }

    public String numberToWords(int num) {
        String str = String.valueOf(num);
        StringBuilder englishWords = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {

            if (i==str.length()-10) {
                if(str.charAt(i)!='0')
                englishWords.append(getNumVal(str.charAt(i))).append(" Billion");
            }

            else if (i==str.length()-9) {
                if(str.charAt(i)!='0')
                englishWords.append(getNumVal(str.charAt(i))).append(" Hundred");
            }

            else if (i==str.length()-8) {
                englishWords.append(getTenVal(str.charAt(i), str.charAt(i+1)));
            }

            else if (i==str.length()-7) {
                 if(str.length()==8)
                     englishWords.append(" Million");

                 else
                     englishWords.append(getNumVal(str.charAt(i))).append(" Million");
            }

            else if (i==str.length()-6) {
                if(str.charAt(i)!='0')
                englishWords.append(getNumVal(str.charAt(i))).append(" Hundred");
            }

            else if (i==str.length()-5 ) {
                englishWords.append(getTenVal(str.charAt(i), str.charAt(i+1)));
            }

            else if (i==str.length()-4) {
                if(str.length()>5)
                    englishWords.append(getTenVal(str.charAt(i),str.charAt(i+1))).append(" Thousand");
                else {
                    if(str.length()>=4) {
//                        englishWords.append(getTenVal(str.charAt(i - 1), str.charAt(i)));
                        englishWords.append(getNumVal(str.charAt(i))).append(" Thousand");
                    }
                    else{
                        englishWords.append(" Thousand");
                    }
                }
            }

            else if (i==str.length()-3) {
                if(str.charAt(i)!='0')
                englishWords.append(getNumVal(str.charAt(i))).append(" Hundred");
            }

            //tens digit
            else if (i==str.length()-2) {
                englishWords.append(getTenVal(str.charAt(i), str.charAt(i+1)));
            }

            //units digit
            else if (i==str.length()-1) {
                if(str.length()>=2 && str.charAt(i-1)!='1' || str.length()==1)
                englishWords.append(getNumVal(str.charAt(i)));
            }
        }
        return englishWords.toString().trim();
    }

    private String getTenVal(char c, char ci) {
        switch(c){
        case '1': return getTens(ci);
        case '2': return " Twenty";
        case '3': return " Thirty";
        case '4': return " Forty";
        case '5': return " Fifty";
        case '6': return " Sixty";
        case '7': return " Seventy";
        case '8': return " Eighty";
        case '9': return " Ninety";
        }
        return "";
    }

    private String getTens(char ci) {
        switch(ci){
        case '0': return " Ten";
        case '1': return " Eleven";
        case '2': return " Twelve";
        case '3': return " Thirteen";
        case '4': return " Fourteen";
        case '5': return " Fifteen";
        case '6': return " Sixteen";
        case '7': return " Seventeen";
        case '8': return " Eighteen";
        case '9': return " Nineteen";
        }
        return "";
    }

    private String getNumVal(char c) {
        switch(c){
        case '1': return " One";
        case '2': return " Two";
        case '3': return " Three";
        case '4': return " Four";
        case '5': return " Five";
        case '6': return " Six";
        case '7': return " Seven";
        case '8': return " Eight";
        case '9': return " Nine";
        }
        return "";
    }
}
