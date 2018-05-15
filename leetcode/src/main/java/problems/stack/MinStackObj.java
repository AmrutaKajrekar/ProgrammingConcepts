package problems.stack;

import java.util.ArrayList;

/**
 * @author amruta.kajrekar on 5/2/18.
 * leetcode problem # 155
 * 
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.

 */
public class MinStackObj{

    public static void main(String[] args){
        MinStackObj s = new MinStackObj();
        MinStack obj = s.new MinStack();
        obj.push(3);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
    }

    class MinStack {

        /**
         * Your MinStack object will be instantiated and called as such:
         * MinStack obj = new MinStack();
         * obj.push(x);
         * obj.pop();
         * int param_3 = obj.top();
         * int param_4 = obj.getMin();
         */
        private ArrayList<Integer> stack;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new ArrayList<>();
        }

        public void push(int x) {
            stack.add(x);
        }

        public void pop() {
            stack.remove(stack.size()-1);
        }

        public int top() {
            if(stack.isEmpty()) return 0;
            else return stack.get(stack.size()-1);
        }

        public int getMin() {
            int min = Integer.MAX_VALUE;
            for (int i=0;i<stack.size();i++){
                min = Math.min(stack.get(i), min);
            }
            return min;
        }
    }

}
