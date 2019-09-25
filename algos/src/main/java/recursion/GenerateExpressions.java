package main.java.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author amruta.kajrekar on 9/3/19.
 */
public class GenerateExpressions {
  public static void main(String[] args){
    generate_all_expressions("222",24);
  }
  static Set<String> list = new HashSet<String>();
  static String[] generate_all_expressions(String s, long target) {
    generate("",s,target);
    return (String[]) list.toArray();
  }

  static void generate(String temp, String s, long target){
    if(!temp.isEmpty()){
      evaluate(temp,s,target);
    }
    //for(int i=0;i<s.length();i++){
    String here = "";
    if(!s.isEmpty() && s.length()>=1) {
      here = s.substring(1);
      System.out.println(here);
      generate(temp+s.charAt(0),here,target);
      //generate(temp+"*"+s.charAt(i),s,target);
      //generate(temp+"+"+s.charAt(i),s,target);
    }
  }
  static void evaluate(String temp, String s, long target){
    long n1 =0, n2 =0;
    if(!temp.isEmpty() && temp.length()>=1) n1=Long.valueOf(temp);
    if(!s.isEmpty() && s.length()>=1) n2=Long.valueOf(s);
    if(n1+n2==target) {
      list.add(String.valueOf(n1)+ "+" + String.valueOf(n2));
    } if(n1*n2==target){
      list.add(String.valueOf(n1)+ "*" + String.valueOf(n2));
    } if(Long.valueOf(temp.concat(s)) == target) {
      list.add(temp.concat(s));
    } if(Long.valueOf(s.concat(temp)) == target) {
      list.add(s.concat(temp));
    }
  }

  static long evaluate2(String temp){
    if(temp.length()==1) return Long.valueOf(temp);
    long value = 0;
    List<String> eval = new ArrayList<String>();
    String[] exps = temp.split("\\*");
    for(String e: exps){
      eval.addAll(Arrays.asList(e.split("\\+")));
    }
    System.out.println("here----");
    for(String e:eval){
      System.out.println(e);
    }

    return value;
  }
}
