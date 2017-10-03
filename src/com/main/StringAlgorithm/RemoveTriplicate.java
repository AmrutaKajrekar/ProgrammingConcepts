/**
 * 
 */
package com.main.StringAlgorithm;


/**
 * @author amruta.kajrekar
 *
 */
public class RemoveTriplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("aabbbaccddddc");
		System.out.println(removeTriplicate(str));
		
	}

	public static String removeTriplicate(StringBuilder str){
		int i=0;
		while(i< str.length()-2){
			if(str.charAt(i) == str.charAt(i+1)  && str.charAt(i) == str.charAt(i+2)){
				str.delete(i, i+3);
				i=0;
			}else{
				i++;
			}
		}
		return str.toString();
	}
}
