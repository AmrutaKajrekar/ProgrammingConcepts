/**
 * 
 */
package com.main.StringAlgorithm;

import java.util.Arrays;

/**
 * @author amruta.kajrekar
 *
 */
public class ReverseStrings {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = reverseString("Reverse");
		System.out.println(str);
	}

	public static String reverseString(String str){
		System.out.println(str);
		char c[] = str.toCharArray();
		for(int i=0; i<str.length()/2 ;i++){
			char t = c[i];
			c[i] = c[str.length()-1-i];
			c[str.length()-1-i] = t;
		}
		System.out.println(Arrays.toString(c));
		return new String(c);
	}
}
