package problems.string;

/**
 * @author amruta.kajrekar on 5/7/18.
 * leetcode problem # 6
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
 */
public class ZigZagConversion {

    public static void main(String[] args){
        ZigZagConversion zig = new ZigZagConversion();
        System.out.println(zig.convert("PAYPALISHIRING", 3));
    }
    char[][] zigzag;

    public String convert(String s, int numRows) {
        char empty = '\u0000';
        zigzag = new char[numRows][s.length()];
        StringBuilder conversion = new StringBuilder();

        char[] letters = s.toCharArray();
        int k=0;

        int i=0,j=0;
        //2 directions- down or diagonal up

        while (k<letters.length) {
//            goDownTillEnd(0,0,3,0);
//            goDiagonalUp(3,0,0,2);
            for(;i<numRows;i++){
                if(k==letters.length) break;
                    zigzag[i][j] = letters[k++];
                    System.out.println(i + "," + j);

            }
            i--;
            for(;i>0;){
                i--;j++;
                if(k==letters.length) break;
                    zigzag[i][j] = letters[k++];
                    System.out.println(i + "," + j);
            }
            i++;
        }

        for (int m=0;m<zigzag.length;m++){
            for (int n=0;n<zigzag[0].length;n++) {
                if(zigzag[m][n]!=empty)
                conversion.append(zigzag[m][n]);
            }
        }

        return conversion.toString();
    }
}
