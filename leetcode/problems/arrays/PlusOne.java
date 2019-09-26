package problems.arrays;

/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
You may assume the integer do not contain any leading zero, except the number 0 itself.
The digits are stored such that the most significant digit is at the head of the list.
 * @author amruta.kajrekar
 * leetcode problem #66
 */
public class PlusOne {
	int carry = 1;

	public static void main(String[] args) {
		PlusOne plus = new PlusOne();
		int[] digits = {9,9};
		digits = plus.plusOne(digits);
		for (int i = 0; i < digits.length; i++) {
			System.out.print(digits[i]);
		}
	}

	public int[] plusOne(int[] digits) {
		for (int i = digits.length-1; i >=0; i--) {
			int inc = (digits[i]+carry);

			if(inc>9){
				//small digit - save
				digits[i]=Integer.parseInt(String.valueOf(inc).substring(1, 2));
				//carry over-
				carry=Integer.parseInt(String.valueOf(inc).substring(0, 1));
			}else{
				digits[i]=inc;
				return digits;
			}
		}
		if(carry>0){
			int[] newDigits = new int[digits.length+1];
			newDigits[0] = carry;
			for (int i = 0; i < digits.length; i++) {
				newDigits[i+1] = digits[i];
			}
			return newDigits;
		}
        return digits;
    }
}
