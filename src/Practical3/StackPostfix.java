package Practical3;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix {

    public static double evaluatePostfix(String exp) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = exp.trim().split("\\s+");

        for (String token : tokens) {
            if (token.isEmpty()) continue;

            // Check if token is a numeric operand (supports integers and decimals)
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                stack.push(Double.parseDouble(token));
            } else {
                // Operator encountered: stack must contain at least two operands
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid Expression: Insufficient operands for operator '" + token + "'.");
                }

                double b = stack.pop(); // Right operand
                double a = stack.pop(); // Left operand

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        if (b == 0) {
                            throw new ArithmeticException("Error: Division by zero.");
                        }
                        stack.push(a / b);
                        break;
                    case "^":
                        stack.push(Math.pow(a, b));
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator encountered: '" + token + "'.");
                }
            }
        }

        // Final validation: Stack must contain exactly one result
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid Expression: Extra operands remaining on stack.");
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter postfix expression (space-separated tokens, e.g., '10 2 3 * -'):");
        String exp = scanner.nextLine();

        try {
            double result = evaluatePostfix(exp);
            System.out.println("Postfix Expression : " + exp);
            // Print as integer if whole number, else decimal
            if (result == (long) result) {
                System.out.println("Result             : " + (long) result);
            } else {
                System.out.println("Result             : " + result);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}