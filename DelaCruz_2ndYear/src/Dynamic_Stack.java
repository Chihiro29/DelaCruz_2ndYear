public class Dynamic_Stack {
    private int max;
    private int[] stackArray;
    private int top;

    public Dynamic_Stack(int size) {
        max = size;
        stackArray = new int[max];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Resizing the stack...");
            resize(max * 2);
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value + " | Stack size: " + (top + 1));
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK IS EMPTY!!!");
            return -1;
        }
        int value = stackArray[top--];

        if (top < max / 4 && max > 1) {
            resize(max / 2);
        }
        System.out.println("Popped: " + value + " | Stack size: " + (top + 1));
        return value;
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("STACK IS EMPTY!!!");
            return -1;
        }
    }

    private boolean isFull() {
        return top == max - 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    // Resize the stack
    private void resize(int newSize) {
        int[] newArray = new int[newSize];
        for (int i = 0; i <= top; i++) {
            newArray[i] = stackArray[i];
        }
        stackArray = newArray;
        max = newSize;
        System.out.println("Resized stack to: " + newSize);
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("STACK IS EMPTY!!!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Dynamic_Stack stack = new Dynamic_Stack(3);

        // Push 10 Elements
        for (int i = 1; i <= 10; i++) {
            stack.push(i * 10);
        }
        stack.printStack();

        // Pop 10 Elements
        for (int i = 0; i < 10; i++) {
            stack.pop();
        }
        stack.printStack();
    }
}