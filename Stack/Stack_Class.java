package Stack;

import java.util.Scanner;

public class Stack_Class {

    int stack[], maxsize, tos;

    public void create_stack(int size) {
        tos = -1;
        maxsize = size;
        stack = new int[size];

    }

    public void push(int e) {
        tos++;
        stack[tos] = e;
        // stack[++tos] = e;

    }

    public boolean isEmpty() {
        if (tos == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFulls() {
        if (tos == maxsize - 1) {
            return true;
        } else {
            return false;
        }
    }

    public int pop() {
        int temp = stack[tos];
        tos--;
        return temp;
        // return stack[tos--];
    }

    public int peek() {
        return stack[tos];
    }

    public static void main(String[] args) {

        Stack_Class s = new Stack_Class();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack");
        int size = sc.nextInt();

        s.create_stack(size);

        sc.close();
    }

}
