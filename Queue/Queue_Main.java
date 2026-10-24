package Queue;

import java.util.Scanner;

public class Queue_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue_Class q = new Queue_Class();// linear
        // Circular_Queue_Class q=new Circular_Queue_Class();//circular

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        q.create_queue(size);

        int choice, element;

        do {
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (q.isFull()) {
                        System.out.println("Queue Overflow! Queue is full.");
                    } else {
                        System.out.print("Enter element: ");
                        element = sc.nextInt();

                        q.enqueue(element);

                        System.out.println("Element inserted successfully.");
                    }
                    break;

                case 2:
                    if (q.isEmpty()) {
                        System.out.println("Queue Underflow! Queue is empty.");
                    } else {
                        element = q.dequeue();

                        System.out.println("Deleted element: " + element);
                    }
                    break;

                case 3:
                    if (q.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue elements:");
                        q.printQueue();
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1 to 4.");
            }

        } while (choice != 4);

        sc.close();
    }
}
