package problems.stack;

import java.util.Stack;

/**
 * @author amruta.kajrekar on 4/13/18.
 * leetcode problem # 224 Basic calculator
 *
 * Implement a basic calculator to evaluate a simple expression string.

The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .

You may assume that the given expression is always valid.

Some examples:
"1 + 1" = 2
" 2-1 + 2 " = 3
"(1+(4+5+2)-3)+(6+8)" = 23
Note: Do not use the eval built-in library function.

 */
public class BasicCalculator {

    public static void main(String[] args){
        BasicCalculator cal = new BasicCalculator();
        System.out.print(cal.calculate("(2-1+2)"));//(1+(4+5+2)-3)+(6+8)
    }

    public int calculate(String str) {
        str=str.replace(" ","");
        Stack<Character> s = new Stack<Character>();
        int i=0;
        int eval =0;
        while(i<str.length()){
            if(isCloseBrace(str.charAt(i))){
               // if close braces & stack not empty, then pop until open brace (
               // and push the total
               if(s.isEmpty()) return 0;
               else{
                   int braceEval = 0;
                   char popped = '0';
                   int a=0;
                   while(s.peek()!='('){
                       popped = s.pop();
                       if(Character.isDigit(popped)){
                           a=Character.getNumericValue(popped);
                       }else if(isOperand(popped)){
                           char next =s.pop();
                           if(Character.isDigit(next)) {
                               braceEval = calculateBraceVal(a, popped, Character.getNumericValue(next));
                               if(s.peek()=='('){
                                   s.pop();
                                   if(s.isEmpty()) return braceEval;
                                   else pushTheAnswer(braceEval,s);
//                                   break;
                               }
                               else {//push the answer
                                   pushTheAnswer(braceEval,s);
                               }
                           }
                           else return 0;
                       }
                   }
                   s.pop();
//                   s.push(braceEval);
               }
            }
            else {
                //push
                s.push(str.charAt(i));
            }

            i++;
        }
        StringBuilder rev = new StringBuilder(String.valueOf(s.pop()));
        return Integer.parseInt(rev.reverse().toString());
    }

    private void pushTheAnswer(int braceEval, Stack<Character> s) {
        char[] braceEvals = String.valueOf(braceEval).toCharArray();
        for (int k = 0; k < braceEvals.length; k++) {
            s.push(braceEvals[k]);
        }
    }

    private int calculateBraceVal(int a, char popped, int pop) {
        switch(popped){
            case '+':return pop + a;
            case '-':return pop - a;
            case '*':return pop * a;
            case '/':return pop / a;
            case '^':return pop ^ a;
        default: return 0;
        }
    }

    private boolean isCloseBrace(char c) {
        if( c==')' ){
            return true;
        }
        else return false;
    }

    private boolean isOperand(char c) {
       if(c=='+' || c=='-' || c=='*' || c=='/'){
           return true;
       }
       else return false;
    }

}
