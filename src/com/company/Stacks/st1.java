package com.company.Stacks;

//Implementation of stack

public class st1 {
    int[] stack = new int[5];
    int top = 0;

    void push(int data) {
        stack[top] = data;
        top++;
    }

    int pop() {
        top--;
        int data = stack[top];
        stack[top] = 0;
        return data;
    }

    int peek() {
        return stack[top];
    }

    int getSize() {
        return top;
    }

    boolean isEmpty() {
        return top<=0;
    }
    void show() {
        for (int n : stack) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        st1 s = new st1();
        s.push(1);
        s.push(2);
        s.push(3);

        s.show();

        System.out.println();
        System.out.println(s.pop());

        s.show();

        System.out.println("The peek element is: " + s.peek());

        s.push(29);
        System.out.println("The size of the stack is: " + s.getSize());

        System.out.println("Is the stack empty: " + s.isEmpty());
    }
}
