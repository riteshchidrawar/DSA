package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Prefix_Evaluation {

    static int evaluate(String prefix) {

        Stack<Integer> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            if (Character.isDigit(c)) {
                int num = c - '0';
                stack.push(num);
            } else {
                int opnd2 = stack.pop();
                int opnd1 = stack.pop();

                int result = 0;

                switch (c) {
                    case '+':
                        result = opnd2 + opnd1;
                        break;
                    case '-':
                        result = opnd2 - opnd1;
                        break;
                    case '*':
                        result = opnd2 * opnd1;
                        break;
                    case '/':
                        result = opnd2 / opnd1;
                        break;
                    case '%':
                        result = opnd2 % opnd1;
                        break;
                }
                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter prefix expression: ");

        String prefix = sc.next();

        int result = evaluate(prefix);

        System.out.println(result);

        sc.close();
    }
}
