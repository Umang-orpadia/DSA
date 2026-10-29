package Practical3;

import java.util.Stack;

public class BalancedParentheses1 {

	public static void main(String[] args) {
		String exp = "{[()]}";
		Stack<Character> stack = new Stack<>();
		boolean balanced = true;
		for(int i = 0; i<exp.length();i++) {
			char ch = exp.charAt(i);
			if(ch=='(' ||ch=='{' || ch=='[') {
				stack.push(ch);
			}
			else if (ch ==')'|| ch =='}' || ch == ']') {
				if(stack.isEmpty()) {
					balanced  = false;
					break;
				}
				char top = stack.pop();
				
				if((ch==')' && top !='(') ||
				   (ch=='}' && top !='{') || 
				   (ch==']' && top !='[')) {
					balanced = false;
					break;
				}
				
			}
		}
		if(!stack.isEmpty()) {
			balanced = false;
		}
			if(balanced) {
				System.out.println("Parentheses are balanced ");
			}
			else {
				System.out.println("Parentheses are not balanced");
			}
		
	}
}
