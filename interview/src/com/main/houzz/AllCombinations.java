package com.main.houzz;

/**
 * @author amruta.kajrekar on 9/3/19.
 */
public class AllCombinations {
  public static void main(String[] args){
    printString("", "abc");
  }

  private static void printString(String s, String str) {
    if(str.length()==0){
      System.out.println(s);
    }else{
      for(int i=0;i<str.length();i++){
        printString(s+str.charAt(i), str.substring(0,i) + str.substring(i+1,str.length()));
      }
    }
  }
}
