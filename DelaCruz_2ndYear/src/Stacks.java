import java.util.Stack;

public class Stacks {

    private int[] array;
    private int top;

    public Stacks(int size) { // Stacks (5)
        array = new int[size];
        top = -1;
    }

    // methods: push, pop, peek, WhatisSize, isFull, isEmpty
    public void push(int element) {
        System.out.println("Pushing..." + element);
        if (isFull()) {
            // ignore the pushing of element
            System.out.println("Stack is Full... " + element + " Failed");
            return;
        }
        // not full, we can add the elements
        array[++top] = element;
        System.out.println("Size: " + (top + 1));
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return -1;
        }
        System.out.println("Size: " + (top--));
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return -1;
        }
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return top == array.length - 1;
    }

    public int WhatisSize() {
        return top + 1;
    }

    public static void main(String[] args) {
        System.out.println("Stack Demo");

        Stacks s = new Stacks(5);
        s.push(5);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60); // Stack is full when reaching 60, it is now rejected
        System.out.println("What is Stack's size? " + s.WhatisSize()); // What is Size

        s.pop(); // 50
        s.pop(); // 40
        System.out.println("Peek: " + s.peek()); // 30
        System.out.println("Stack is Empty? " + s.isEmpty()); // False
        System.out.println("Stack is Full? " + s.isFull()); // False
        System.out.println("What is Stack's size? " + s.WhatisSize()); // What is Size
    }
}
