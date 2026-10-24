package Stack;

import java.util.Scanner;

public class Stack {

    int stack[];

    int tos1, tos2, maxsize;

    void create_stack(int N) {
        stack = new int[N];
        tos1 = -1;
        tos2 = N;
        maxsize = N;
    }

    void push1(int X) {
        if (tos1 + 1 == tos2) {
            System.out.println("Stack1 Overflow");
        } else {
            stack[++tos1] = X;
        }
    }

    void push2(int X) {
        if (tos2 - 1 == tos1) {
            System.out.println("Stack2 Overflow");
        } else {
            stack[--tos2] = X;
        }
    }

    void pop1() {
        if (tos1 == -1) {
            System.out.println("Stack1 Underflow");
        } else {
            System.out.println("Popped from stack1: " + stack[tos1]);
            tos1--;
        }
    }

    void pop2() {
        if (tos2 == maxsize) {
            System.out.println("Stack2 Underflow");
        } else {
            System.out.println("Popped from stack2: " + stack[tos2]);
            tos2++;
        }
    }

    void display1() {
        if (tos1 == -1) {
            System.out.println("Stack1 is Underflow");
        } else {
            System.out.print("Stack1: ");
            for (int i = tos1; i >= 0; i--) {
                System.out.println(stack[i] + " ");
            }
        }
    }

    void display2() {
        if (tos2 == maxsize) {
            System.out.println("Stack2 is Underflow");
        } else {
            System.out.print("Stack2: ");
            for (int i = tos2; i < maxsize; i++) {
                System.out.println(stack[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int N = sc.nextInt();

        s.create_stack(N);

        System.out.println("Enter no. of operations");
        int Q = sc.nextInt();

        for (int i = 0; i < Q; i++) {

            System.out.println("1.PUSH1 X");
            System.out.println("2.PUSH2 X");
            System.out.println("3.DISPLAY1");
            System.out.println("4.DISPLAY2");
            System.out.println("5.POP1");
            System.out.println("6.POP2");

            System.out.println("Enter you choice of operation");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the value to push in stack1");
                    s.push1(sc.nextInt());
                    break;

                case 2:
                    System.out.println("Enter the value to push in stack2");
                    s.push2(sc.nextInt());
                    break;

                case 3:
                    s.display1();
                    break;

                case 4:
                    s.display2();
                    break;

                case 5:
                    s.pop1();
                    break;

                case 6:
                    s.pop2();
                    break;

                default:
                    System.out.println("Invalid Input");
            }

        }
        sc.close();
    }
}
