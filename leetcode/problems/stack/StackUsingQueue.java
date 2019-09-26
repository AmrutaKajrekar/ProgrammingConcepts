package problems.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author amruta.kajrekar on 5/2/18.
 * leetcode problem # 225
 * Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Notes:
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 */
public class StackUsingQueue {
    public static void main(String[] args){
        //["MyStack","push","push","top","pop","pop","empty"]
        //[[],[1],[2],[],[],[],[]]
        StackUsingQueue stack = new StackUsingQueue();
        MyStack obj = stack.new MyStack();
        obj.push(1);
        obj.push(2);
        int param_3 = obj.top();
//        int param_4 = obj.pop();
//        int param_5 = obj.pop();
//        boolean param_6 = obj.empty();
    }
    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
    class MyStack {
        Deque<Integer> stack;
        /** Initialize your data structure here. */
        public MyStack() {
            stack = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            stack.add(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
           return stack.pollLast();
        }

        /** Get the top element. */
        public int top() {
            return stack.peekLast();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            if(stack.size()==0) return true;
            return false;
        }
    }


}
