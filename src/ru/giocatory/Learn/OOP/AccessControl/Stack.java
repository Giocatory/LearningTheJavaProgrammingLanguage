package ru.giocatory.Learn.OOP.AccessControl;

public class Stack {
    private final int[] stack = new int[10];
    private int tos;

    // Initializing the top of the stack
    Stack() {
        tos = -1;
    }

    // Place an item on the stack
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack full");
        } else {
            stack[++tos] = item;
        }
    }

    // Pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack not loaded");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
