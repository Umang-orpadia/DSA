package Practical3;

import java.util.Stack;

public class StackPostfix1 {


	public static void main(String[] args) {
		String exp = "5 3 + 2 *";
		Stack<Integer> stack = new Stack<>();
		String[] tokens = exp.split(" ");
		for(int i = 0; i< tokens.length; i++) {
			String token = tokens[i];
			if(token.matches("-?\\d+")) {
				stack.push(Integer.parseInt(token));
				
			}
			else {
				int b =stack.pop();
				int a = stack.pop();
				switch(token) {
				case "+":
					stack.push(a+b);
					break;
				
				case "-":
					stack.push(a-b);
					break;
				case "*":
					stack.push(a*b);
					break;
				case "/":
					stack.push(a/b);
					break;
				}
			}
		}
		System.out.println("Postfix Expression : "+exp);
		System.out.println("Result "+stack.pop());
	}
}
