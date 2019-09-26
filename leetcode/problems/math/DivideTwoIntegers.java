package problems.math;

/**
 * @author amruta.kajrekar on 5/9/18.
 */
public class DivideTwoIntegers {

    public static void main(String[] args){
        DivideTwoIntegers div = new DivideTwoIntegers();
        System.out.println(div.divide(-21474836,-1));
    }

    public int divide(int dividend, int divisor) {
        boolean isDivisorNeg = false;
        boolean isDividendNeg = false;
        if(divisor<0) {
            if(divisor==-1) {
                return Math.negateExact(dividend);
            }
            divisor= Math.negateExact(divisor);
            isDivisorNeg = true;
        }
        if(dividend<0) {
            dividend= Math.negateExact(dividend);
            isDividendNeg = true;
        }
        int retVal = 0;

        while(dividend >= divisor){
            dividend -=divisor;
            retVal++;
        }

        if(isDivisorNeg){
            retVal = Math.negateExact(retVal);
        }
        if(isDividendNeg){
            retVal = Math.negateExact(retVal);
        }
        return retVal;
    }

}
