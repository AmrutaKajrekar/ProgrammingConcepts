package problems.dynamicProgramming;

import java.util.Stack;

/**
 * @author amruta.kajrekar on 3/3/18.
 * leetcode problem #32
 *
 * Given a string containing just the characters '(' and ')',
 * find the length of the longest valid (well-formed) parentheses substring.
 * For "(()", the longest valid parentheses substring is "()", which has length = 2.
 * Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
(((((()((((())))))))))
 */
public class LongestValidParentheses {

    public static void main(String[] args){
        LongestValidParentheses paren = new LongestValidParentheses();
        System.out.print(paren.longestValidParentheses(")()())()()("));
    }

    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        int left =-1;

        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') stack.push(i);
            else{
                if(stack.isEmpty()) left =i;
                else{
                    stack.pop();
                    if(stack.isEmpty()) max=Math.max(max,i-left);
                    else max=Math.max(max,i-stack.peek());
                }
            }
        }

        return max;
        }

}
/*
    public int longestValidParentheses2(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int max=0;int left =-1;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')' && !stack.isEmpty()){
                stack.pop();
                max = (stack.isEmpty()) ? Math.max(max,i+1) : Math.max(max, i-stack.peek());
            }else{
                left=i;
                if(s.charAt(i)=='(') stack.push(i);
                if(s.charAt(i)==')') {
                    Math.max(max, i-1);
                    return max;
                }
            }
        }
        return max-1;
    }
    */
/**
 if(s.charAt(i)=='(') stack.push(i);
 else{
 //closing paren
 if(stack.isEmpty()) left=i;
 else{
 stack.pop();
 if(stack.isEmpty()) max=Math.max(max,i-left);
 else{
 max=Math.max(max, i-stack.peek());
 }
 }
 }
 */
