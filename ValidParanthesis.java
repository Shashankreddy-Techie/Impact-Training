import java.util.Stack;

public class BalancedParentheses {

    // Function to check if parentheses are balanced
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{'))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "{[()]}";

        if (isBalanced(expression))
            System.out.println("The expression is balanced.");
        else
            System.out.println("The expression is NOT balanced.");
    }
}
