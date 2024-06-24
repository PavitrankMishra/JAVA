package com.company.Stack;

public class S1_Stack {
    static class Stack {
        int stack[] = new int[5];
        int top = 0;

        void push(int data) {
            if(top < stack.length) {
                stack[top++] = data;
            } else {
                System.out.println("Stack is full");
            }
        }

        int pop() {
            if(top > 0) {
                int data = stack[--top];
                stack[top] = 0;
                return data;
            }else {
                System.out.println("Stack is empty");
                return -1;
            }
        }

        int peek() {
            if(top > 0) {
                return stack[top-1];
            } else {
                return -1;
            }
        }

        void show() {
            for(int i: stack) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.push(10);
        nums.push(11);
        nums.push(12);
        nums.push(13);
        nums.push(14);

        System.out.println("Printing the stack");
        nums.show();
        System.out.println();
        System.out.println("The popped element is: " + nums.pop());
        nums.pop();
        nums.show();
        System.out.println("The topmost element is: " + nums.peek());
    }
}
