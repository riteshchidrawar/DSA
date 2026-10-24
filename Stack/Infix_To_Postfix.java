package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Infix_To_Postfix {

    static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;

        if (ch == '*' || ch == '/' || ch == '%')
            return 2;

        return 0;
    }

    static String convert(String infix) {

        Stack<Character> stack = new Stack<>();

        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {

            char ch = infix.charAt(i);

            if (ch == '(') {

                stack.push(ch);

            } else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix = postfix + stack.pop();
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }

            } else if (ch == '+' || ch == '-' ||
                    ch == '*' || ch == '/' || ch == '%') {

                while (!stack.isEmpty() && stack.peek() != '(' && precedence(ch) <= precedence(stack.peek())) {
                    postfix = postfix + stack.pop();
                }

                stack.push(ch);

            } else {

                postfix = postfix + ch;

            }
        }

        while (!stack.isEmpty()) {
            postfix = postfix + stack.pop();
        }

        return postfix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter infix expression: ");
        String infix = sc.next();

        String postfix = convert(infix);

        System.out.println("Postfix expression: " + postfix);

        sc.close();
    }
}
