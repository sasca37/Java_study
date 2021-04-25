package generic_collection.collection;

import java.util.Stack;

public class Stack_prac {
	//LiFO 구조 : 후입선출 
	public static void main(String[] args) {
		var stack = new Stack();
		
		stack.push("aa");
		stack.push("bb");
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
			
		
	}
}
