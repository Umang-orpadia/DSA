package Practical3;


import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Handle closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty, an extra closing bracket exists
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check for bracket type mismatch
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
            // Non-bracket characters (letters, numbers, operators) are ignored
        }

        // If stack is empty, all opening brackets were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression to check: ");
        String exp = scanner.nextLine();

        if (isBalanced(exp)) {
            System.out.println("Expected Output: Balanced");
        } else {
            System.out.println("Expected Output: Unbalanced");
        }

        scanner.close();
    }
}