package Queue;

public class Queue_Class {
    int queue[], MaxSize, front, rear;

    public void create_queue(int size) {
        rear = -1;// outside array
        front = 0;// init value
        MaxSize = size;// static
        queue = new int[size];// array
    }

    void enqueue(int e)
    // will add one element at rear side
    // with every enqueue rear+1
    {
        queue[++rear] = e;
    }

    boolean isFull() {
        return (rear == MaxSize - 1);
    }

    int dequeue()
    // removes element from queue from font end
    // dequeue-->front+1
    {
        return (queue[front++]);
    }

    boolean isEmpty() {
        return (front > rear);
    }

    void printQueue() {
        for (int i = front; i <= rear; i++)
            System.out.print("\n" + queue[i]);
    }

}
