
package Queue;

public class Circular_Queue_Class {
    int queue[], MaxSize, front, rear, count;

    public void create_queue(int size) {
        front = 0;
        rear = -1;
        count = 0;
        MaxSize = size;
        queue = new int[size];
    }

    // Add element at rear
    void enqueue(int e) {
        if (isFull()) {
            System.out.println("Queue Overflow!");
        } else {
            rear = (rear + 1) % MaxSize;
            queue[rear] = e;
            count++;
        }
    }

    boolean isFull() {
        return count == MaxSize;
    }

    // Remove element from front
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return -1;
        } else {
            int e = queue[front];
            front = (front + 1) % MaxSize;
            count--;
            return e;
        }
    }

    boolean isEmpty() {
        return count == 0;
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");
            for (int i = 0; i < count; i++) {
                int index = (front + i) % MaxSize;
                System.out.println(queue[index]);
            }
        }
    }
}
