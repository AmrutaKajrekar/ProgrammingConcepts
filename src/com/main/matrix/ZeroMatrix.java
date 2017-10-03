/**
 * 
 */
package com.main.matrix;

/**
 * @author amruta.kajrekar
 *
 */
public class ZeroMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,0}};
		ZeroMatrix m = new ZeroMatrix();
		Solution sol = m.new Solution();
		System.out.println("*******INITIAL MATRIX********");
		for(int k=0;k<matrix.length;k++){
			System.out.println("");
        	for(int k1=0;k1<matrix[k].length;k1++){
	        	System.out.print(matrix[k][k1]);
	        }
        }
		
		sol.setZeroes(matrix);
	}

	public class Solution {
	    public void setZeroes(int[][] matrix) {
	        boolean firstRowZero = false;
	        boolean firstColumnZero = false;
	 
	        //set first row and column zero or not
	        for(int i=0; i<matrix.length; i++){
	            if(matrix[i][0] == 0){
	                firstColumnZero = true;
	                break;
	            }
	        }
	 
	        for(int i=0; i<matrix[0].length; i++){
	            if(matrix[0][i] == 0){
	                firstRowZero = true;
	                break;
	            }
	        }
	 
	        //mark zeros on first row and column
	        for(int i=1; i<matrix.length; i++){
	            for(int j=1; j<matrix[0].length; j++){
	                if(matrix[i][j] == 0){
	                   matrix[i][0] = 0;
	                   matrix[0][j] = 0;
	                }
	            }
	        }
	 
	        //use mark to set elements
	        for(int i=1; i<matrix.length; i++){
	            for(int j=1; j<matrix[0].length; j++){
	                if(matrix[i][0] == 0 || matrix[0][j] == 0){
	                   matrix[i][j] = 0;
	                }
	            }
	        }
	 
	        //set first column and row
	        if(firstColumnZero){
	            for(int i=0; i<matrix.length; i++)
	                matrix[i][0] = 0;
	        }
	 
	        if(firstRowZero){
	            for(int i=0; i<matrix[0].length; i++)
	                matrix[0][i] = 0;
	        }
	 
	        System.out.println("\n\n*******SOLUTION MATRIX********");
	        for(int k=0;k<matrix.length;k++){
	        	System.out.println("");
	        	for(int k1=0;k1<matrix[k].length;k1++){
		        	System.out.print(matrix[k][k1]);
		        }
	        }
	    }
	}
}
