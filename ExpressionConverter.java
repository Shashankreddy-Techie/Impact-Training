package Day32;

import java.util.Stack;

public class ExpressionConverter {

    private static int precedence(char op) {
        switch (op) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    // Check if character is operator
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            }
            else if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); 
            }
            else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    // For right associative '^', use < instead of <=
                    if (c == '^' && stack.peek() == '^') break;
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static String infixToPrefix(String infix) {
        StringBuilder input = new StringBuilder(infix).reverse();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                input.setCharAt(i, ')');
            } else if (input.charAt(i) == ')') {
                input.setCharAt(i, '(');
            }
        }
        String postfix = infixToPostfix(input.toString());
        return new StringBuilder(postfix).reverse().toString();
    }
    public static void main(String[] args) {
        String infix = "a+b*(c-d)^e";

        String postfix = infixToPostfix(infix);
        String prefix = infixToPrefix(infix);

        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix);
        System.out.println("Prefix: " + prefix);
    }
}

