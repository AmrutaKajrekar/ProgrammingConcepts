/**
 * 
 */
package com.main.stack;

/**
 * @author amruta
 * @param <E>
 *
 */
public class StackUsingArray<E> {

	int capacity = 0;
	E array[] = null;
	int top = -1;
	int size = 0;
	
	
	@SuppressWarnings("unchecked")
	public StackUsingArray(int cap){
		capacity = cap;
		array = (E[]) new Object[cap];
	}
	
	public E pop(){
		if(top >=0 ){
			E item = array[top];
			size--;
			array[top] = null;
			top--;
			return item;
		}
		else{
			return null;
		}
	}
	
	public void push(E item){
		if(null!= item && !full()){
			array[++top]=item;
		}
	}
	
	
	private boolean full() {
		if(size != capacity)
			return false;
		else
			return true;
	}

	public void printStack(){
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+", ");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackUsingArray<String> stack = new StackUsingArray<String>(3);
		stack.push("hello");
		stack.push("world");
		
		stack.printStack();
		
		stack.pop();
		
		stack.printStack();
		
		stack.pop();
		
		stack.printStack();
		
	}

}
