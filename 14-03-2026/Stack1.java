// Stack implementation using arrays with capacity concept
// push
// pop
// peek
// print

import java.util.*;

public class Stack1 {

    static int top = -1;          // top pointer
    static int capacity = 10;     // maximum stack size

    public static void main(String[] args) {

        int[] stack = new int[capacity];

        push(stack, 8);
        push(stack, 5);
        push(stack, 3);
        push(stack, 7);

        print(stack);

        peek(stack);

        pop(stack);

        print(stack);

        peek(stack);
    }

    static void push(int[] stack, int element) {

        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Stack is full.");
            return;
        }

        stack[++top] = element;
        System.out.println(element + " pushed into the stack.");
    }

    static void pop(int[] stack) {

        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty.");
            return;
        }

        System.out.println(stack[top] + " popped from the stack.");
        top--;
    }

    static void peek(int[] stack) {

        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Top element: " + stack[top]);
    }

    static void print(int[] stack) {

        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }
}
