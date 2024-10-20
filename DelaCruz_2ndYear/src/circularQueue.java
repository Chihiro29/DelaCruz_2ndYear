public class circularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor to initialize the queue
    public circularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Enqueue operation to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        // Update rear and wrap around if necessary
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        if (front == -1) { // If first element is added
            front = rear;
        }
        size++;
        System.out.println(value + " enqueued to the queue");
    }

    // Dequeue operation to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;
        }
        int dequeuedValue = queue[front];
        // Update front and wrap around if necessary
        front = (front + 1) % capacity;
        size--;
        if (size == 0) { // Reset front and rear when queue becomes empty
            front = -1;
            rear = -1;
        }
        System.out.println(dequeuedValue + " dequeued from the queue");
        return dequeuedValue;
    }

    // Peek the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // Display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Get the current size of the queue
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        circularQueue queue = new circularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();

        queue.dequeue();
        queue.display();

        queue.enqueue(60);
        queue.display();

        System.out.println("Front element: " + queue.peek());
    }
}