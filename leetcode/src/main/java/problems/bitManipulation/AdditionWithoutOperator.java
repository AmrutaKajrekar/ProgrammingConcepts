package problems.bitManipulation;

/**
 * @author amruta.kajrekar
 * leetcode problem #371
 *
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
Example:
Given a = 1 and b = 2, return 3.

 */
public class AdditionWithoutOperator {

    public static void main(String[] args){
        AdditionWithoutOperator addition = new AdditionWithoutOperator();
        System.out.println(addition.getSum(2,3));
    }

    public int getSum(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;
        return getSum((a^b), (a&b)<<1);
    }

    //other impl:
    //        while(b!=0){
    //            int carry = a&b;
    //            a = a^b;
    //            b = carry<<1;
    //        }
    //        return a;
}
