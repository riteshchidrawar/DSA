package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Infix_To_Prefix {

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        }
        if (ch == '*' || ch == '/' || ch == '%') {
            return 2;
        }
        return 0;
    }

    static String convert(String infix) {

        Stack<Character> stack = new Stack<>();
        String prefix = "";

        for (int i = infix.length() - 1; i >= 0; i--) {

            char ch = infix.charAt(i);

            if (ch == ')') {
                stack.push(ch);
            } else if (ch == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix = prefix + stack.pop();
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (ch == '+' || ch == '-' ||
                    ch == '*' || ch == '/' || ch == '%') {

                while (!stack.isEmpty() && stack.peek() != ')' && precedence(ch) < precedence(stack.peek())) {
                    prefix = prefix + stack.pop();
                }
                stack.push(ch);
            } else {
                prefix = prefix + ch;
            }
        }

        while (!stack.isEmpty()) {
            prefix = prefix + stack.pop();
        }

        String reversed = "";
        for (int i = prefix.length() - 1; i >= 0; i--) {
            reversed += prefix.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter infix expression");
        String infix = sc.next();

        String prefix = convert(infix);

        System.out.println("Prefix expression: " + prefix);

        sc.close();
    }

}
