/**
 * 
 */
package com.main.StringAlgorithm;

/**
 * @author amruta.kajrekar
 *
 */
public class BinaryRepresentation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(5) +"-> "+isPalindrome(Integer.toBinaryString(5)));
		System.out.println(Integer.toBinaryString(15) +"-> "+isPalindrome(Integer.toBinaryString(15)));
		System.out.println(Integer.toBinaryString(25) +"-> "+isPalindrome(Integer.toBinaryString(25)));
		System.out.println(Integer.toBinaryString(9) +"-> "+isPalindrome(Integer.toBinaryString(9)));
		System.out.println(Integer.toBinaryString(3) +"-> "+isPalindrome(Integer.toBinaryString(3)));
		System.out.println(Integer.toBinaryString(8) +"-> "+isPalindrome(Integer.toBinaryString(8)));
		System.out.println(Integer.toBinaryString(137) +"-> "+isPalindrome(Integer.toBinaryString(137)));
		System.out.println(Integer.toBinaryString(29) +"-> "+isPalindrome(Integer.toBinaryString(29)));
		System.out.println(Integer.toBinaryString(21) +"-> "+isPalindrome(Integer.toBinaryString(21)));
		System.out.println(Integer.toBinaryString(45) +"-> "+isPalindrome(Integer.toBinaryString(45)));
	}

	private static boolean isPalindrome(String binaryString) {
		for(int i=0; i<binaryString.length()/2; i++){
			if(binaryString.charAt(i) != binaryString.charAt(binaryString.length()-i-1)){
				return false;
			}
		}
		return true;
	}
}
