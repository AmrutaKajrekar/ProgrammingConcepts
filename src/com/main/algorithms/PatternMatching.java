/**
 * 
 */
package com.main.algorithms;

/**
 * @author amruta
 *
 */
public class PatternMatching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "aaa";
		String pattern = "a*";
		
		System.out.println(string + " " + pattern + "= " +isMatch(string,pattern));
		
		string = "aab";
		pattern= "c*a*b";
		
		System.out.println(string + " " + pattern + "= " +isMatch(string,pattern));
	}

	private static boolean isMatch(String string, String pattern) {
		//if length = 0
		//if length = 1
		//else if 2nd char != *
		//else (if 2ns char == *)
		
		if(pattern.length() == 0){
			return string.length() == 0;
		}
		else if(pattern.length() == 1){
			
			if(pattern.charAt(0) != string.charAt(0) && pattern.charAt(0) != '.'){
				return false;
			}
			else{
				return isMatch(string.substring(1), string.substring(1));
			}
		}
		else if(pattern.charAt(1) != '*'){
			
			if(pattern.charAt(0) != string.charAt(0) && pattern.charAt(1) != '.'){
				return false;
			}else{
				return isMatch(string.substring(1), string.substring(1));
			}
		}
		else{ //if pattern's 2nd char = * == if first char and * stand for 0 elements, then skip first2
			System.out.println(string+ ":"+ pattern.substring(2));
			if(isMatch(string, pattern.substring(2))){
				return true;
			}
			int i = 0;
			while (i<string.length() && (string.charAt(i)==pattern.charAt(0) || pattern.charAt(0)=='.')){
				System.out.println("in while: " + string.substring(i + 1)+ ":"+ pattern.substring(2));
				if (isMatch(string.substring(i + 1), pattern.substring(2))) {
					return true;
				}
				i++;
			}
			return false;
		}
	}

}
