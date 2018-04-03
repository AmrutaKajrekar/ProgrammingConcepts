package problems.math;

/**
 * @author amruta.kajrekar on 3/30/18.
 * leetcode problem# 258 Add digits
 *
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example: Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * Follow up: Could you do it without any loop/recursion in O(1) runtime?

 */
public class AddDigits {

    public static void main(String[] args){
        AddDigits add = new AddDigits();
        System.out.print(add.addDigits(546));
    }

    public int addDigits(int num) {
        int sum = num;

        while(String.valueOf(sum).length()>1){
            int val=0;
            for(int i=0; i<String.valueOf(sum).length();i++){
                val+=Character.getNumericValue(String.valueOf(sum).charAt(i));
            }
            sum = val;
        }

        return sum;
    }
}
