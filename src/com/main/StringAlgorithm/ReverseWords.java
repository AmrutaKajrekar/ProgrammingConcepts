/**
 * 
 */
package com.main.StringAlgorithm;

/**
 * @author amruta
 *
 */
public class ReverseWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseWords words = new ReverseWords();
		char[] s = new String("the sky is blue").toCharArray();
		words.reverseWords(s);
		System.out.println("\nAnswer: ");
		for(int j=0; j<s.length; j++){
	        System.out.print(s[j]);
	    }
	}

	public void reverseWords(char[] s) {
	    int i=0;
	    for(int j=0; j<s.length; j++){
	        if(s[j]==' '){
	            reverse(s, i, j-1);        
	            i=j+1;
	        }
	    }
	    System.out.println("\nReverse 1: ");
	    for(int j=0; j<s.length; j++){
	        System.out.print(s[j]);
	    }
	    reverse(s, i, s.length-1);
	    System.out.println("\nReverse 2: ");
	    for(int j=0; j<s.length; j++){
	        System.out.print(s[j]);
	    }
	    reverse(s, 0, s.length-1);
	    System.out.println("\nReverse 3: ");
	    for(int j=0; j<s.length; j++){
	        System.out.print(s[j]);
	    }
	}
	 
	public void reverse(char[] s, int i, int j){
	    while(i<j){
	        char temp = s[i];
	        s[i]=s[j];
	        s[j]=temp;
	        i++;
	        j--;
	    }
	}
}
