package dataStructures;

import java.util.*;

public class StackExample {
	static void stack_push(Stack<Integer> stack) {
		for(int i=1; i<=5; i++)
			stack.push(i);
	}
	
	static void stack_pop(Stack<Integer> stack) {
			for(int i=1; i<=5; i++)
			{
				Integer y = (Integer) stack.pop();
				System.out.println(y);
			}
	}
	static void stack_peek(Stack<Integer> stack) {
		Integer e = (Integer) stack.peek();
		System.out.println(e);
	}
	static void stack_search(Stack<Integer> stack, int element)
	{
		Integer s = (Integer) stack.search(element);
		if(s == -1)
			System.out.println("Element is not found");
		else
			System.out.println("Element is found at position: " + s);
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		System.out.println("");
		stack_peek(stack);
		System.out.println("");
		stack_search(stack,2);
		stack_search(stack,10);
		
	}

}
