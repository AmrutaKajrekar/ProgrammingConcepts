/**
 * 
 */
package com.main.datastructures;

/**
 * @author Amruta Kajrekar
 *
 */
public class Kata1 {
public static void main (String[] args){
	autocorrect("youtube");
	
}
	  public static String autocorrect(String input) {
	    // your code here
	//	  for(String str : input.split("[^\\w\\s]")){
		    	//if(str.endsWith("u")){
		  if(input.endsWith("u")){
			  input += " ";
		  }
		    		input = input.replaceAll("Y*y*o*u+ ", "your sister ");
		    		input.trim();
		   //	}
		//    }
		  System.out.println(input);
			return input;
    
		  
		  
//	    if(input2.contains(" ")){
//	    	   input2 = input2.replace("!", "");
//	    	      for(String input: input2.split(" ")){
//	    	     input2 = replaceInput(input);
//	    	   
//	    	    }
//	    	   }
//	    	  return input2;
	  }
	  
	  
	  public static String replaceInput(String input){
	   if(input.toLowerCase().equals("u") || (input.length() == 3 && input.toLowerCase().equals("you")) 
	    	      || (input.length() > 3 && input.toLowerCase().startsWith("you") && input.toLowerCase().endsWith("uuuu"))){
	    	        return "your sister";
	    	    	//input2 = input2.replace(input, "your sister");
	    	      }
	   return "";
	   }
	}