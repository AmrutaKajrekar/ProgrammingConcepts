package problems.stack;

import java.util.Stack;

/**
 * @author amruta.kajrekar on 4/13/18.
 * leetcode problem # 20 Valid Parenthesis
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:
Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 */
public class ValidParenthesis {

    public static void main(String[] args) {
        ValidParenthesis paren = new ValidParenthesis();
        System.out.print(paren.isValid("()[]{}"));
    }

    public boolean isValid(String str) {
        if(str==null) return false;
        if(str.length()==0) return true;
        Stack<Character> s = new Stack<Character>();

        if (str.charAt(0) == ')' || str.charAt(0) == '}' || str.charAt(0) == ']') {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            } else {
                switch (str.charAt(i)) {
                case ')': {
                    if (!s.isEmpty() && s.peek() == '(') {
                        s.pop();
                    } else
                        return false;
                    break;
                }

                case '}': {
                    if (!s.isEmpty() && s.peek() == '{') {
                        s.pop();
                    } else
                        return false;
                    break;
                }

                case ']': {
                    if (!s.isEmpty() && s.peek() == '[') {
                        s.pop();
                    } else
                        return false;
                    break;
                }
                default:
                    return false;
                }
            }

        }
        if (s.isEmpty())
            return true;
        else
            return false;
    }
}
