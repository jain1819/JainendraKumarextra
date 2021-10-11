package com.gl.dsaLab1010.function;

/*we using this class to find  if the input expression or string containing brackets are balanced or not.
 * balanced brackets (),({}),((({{{}}}))),[[{{(())}}]]
 * unbalanced brackets ((,(({})
 * */

import java.util.Stack;

public class StackBalancing extends BracketSeparation{
	
	public static boolean Balancing( String str ) {
		Stack<Character> stack = new Stack<Character>();
		
		// String is converted to character array, and character is checked for (,{,[
		for( char c : str.toCharArray() ) {
			
			
			// checking if c is '(', '{', '['
			if( c == '(' || c == '{' || c == '[' ) {
				// pushing to stack
				stack.push( c );
			} else { // else		
				// Aside: if stack is empty -> error
				if( stack.isEmpty() ) {
					return false;
				}
			
				// popping from the stack (d)
				Character d = (Character) stack.pop();
				// check if c is the closing bracket for d
				if( c == '}' && d != '{' || ( c == ')' && d != '(' ) || ( c == ']' && d != '[' ) ) {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}

}
