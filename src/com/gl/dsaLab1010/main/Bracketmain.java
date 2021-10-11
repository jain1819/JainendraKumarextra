package com.gl.dsaLab1010.main;

import java.util.*;

import com.gl.dsaLab1010.function.BracketSeparation;
import com.gl.dsaLab1010.function.StackBalancing;

public class Bracketmain {

	
		/*private static boolean Balancing( String bracket ) {
			Stack<Character> stack = new Stack<Character>();
			
			// iterate through the characters
			for( char c : bracket.toCharArray() ) {
				// System.out.println( c );
				
				// check if c is '(', '{', '['
				if( c == '(' || c == '{' || c == '[' ) {
					// push to stack
					stack.push( c );
				} else { // else		
					// Aside: if stack is empty -> error
					if( stack.isEmpty() ) {
						return false;
					}
				
					// pop from the stack (d)
					Character d = (Character) stack.pop();
					// check if c is the closing bracket for d
					if( c == '}' && d != '{' || ( c == ')' && d != '(' ) || ( c == ']' && d != '[' ) ) {
						return false;
					}
				}
			}
			
			return stack.isEmpty();
		}
		*/
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scr = new Scanner(System.in);
			System.out.println("Enter the string containing brackets");
			String brackets = scr.next();
			scr.close();
			
			//BracketSeparation Bs =new BracketSeparation();
			//StackBalancing Sb = new StackBalancing();
			String str= BracketSeparation.Separation(brackets);
			if( StackBalancing.Balancing(str) ) {
				System.out.println( "Given String is balanced " );
			} else {
				System.out.println( "Given String is not balanced " );
			}

	}

}
