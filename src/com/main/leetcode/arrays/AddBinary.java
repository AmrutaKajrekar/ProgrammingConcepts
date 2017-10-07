package com.main.leetcode.arrays;


/**
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 * @author amruta.kajrekar
 * leetcode problem #67
 */
public class AddBinary {
	public static void main(String[] args) {
		AddBinary add = new AddBinary();
		String a = "0";
		String b = "1";
		System.out.println(add.addBinary(a, b));
	}
	
	public String addBinary(String a, String b) {
		int carry = 0;
		String result = "";
		char[] maxArray = (a.length() > b.length()) ? a.toCharArray() : b.toCharArray();
		char[] minArray = (a.length() <= b.length()) ? a.toCharArray() : b.toCharArray();
		int indexA = maxArray.length-1;
		int indexB = minArray.length-1;
		
		while(indexA >=0 || (indexB>=0 && carry>0)){
			int[] binarySum = new int[2];
			if(indexB >= 0){
				 binarySum = binarySum(Integer.parseInt(String.valueOf(maxArray[indexA])), Integer.parseInt(String.valueOf(minArray[indexB])), carry);
			}else{
				 binarySum = binarySum(Integer.parseInt(String.valueOf(maxArray[indexA])), 0, carry);
			}
			
		    maxArray[indexA] = (char) (binarySum[0] + 48);
		    carry = binarySum[1];
		    indexA--;
		    indexB--;
		}
		for (int i = 0; i < maxArray.length; i++) {
			result += maxArray[i]; 
		}
		if(carry>0){
			return "1"+result;
		}
        return result;
    }

	private int[] binarySum(int parseInt1, int parseInt2, int carry) {
		int[] binarySumAndCarry = new int[2];
		int countOne = 0;
		if(parseInt1 == 1){
			countOne++;
		}
		if(parseInt2 == 1){
			countOne++;
		}
		if(carry == 1){
			countOne++;
		}
		if(countOne == 0){
			binarySumAndCarry[0]=0;
			binarySumAndCarry[1]=0;
		}
		if(countOne == 1){
			binarySumAndCarry[0]=1;
			binarySumAndCarry[1]=0;
		}
		if(countOne == 2){
			binarySumAndCarry[0]=0;
			binarySumAndCarry[1]=1;
		}
		if(countOne == 3){
			binarySumAndCarry[0]=1;
			binarySumAndCarry[1]=1;
		}
		return binarySumAndCarry;
	}
}

