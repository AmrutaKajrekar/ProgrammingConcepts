/**
 * 
 */
package com.main.StringAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author amruta.kajrekar
 *
 */
public class MinDiffBetPrimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input[] = {101,-113,-2,3,45,46,7,9,13,17};
		//-113,-2,3,7,9,13,17,45,46,101
		List<Integer> p = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]+":"+isPrime(input[i]));
			p.add(input[i]);
		}
		
		Collections.sort(p);
		for (int j=0; j<p.size()-1;j++) {
			
			System.out.println(p.get(j)+", "+p.get(j+1) + "=" + Math.abs( Math.abs(p.get(j)) -  Math.abs(p.get(j+1))));
			
		}
	}

	public static boolean isPrime(int n){
		if(n<0){
			n=0-n;
		}
		for (int i = 2; i < n/2; i++) {
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
