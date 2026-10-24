package Queue;

import java.util.PriorityQueue;
import java.util.Scanner;
// import java.util.Collections;

public class Priority_Queue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create a min-priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int choice;

        do {
            System.out.println("\n----- PRIORITY QUEUE MENU -----");
            System.out.println("1. Insert Element");
            System.out.println("2. Remove Highest Priority Element");
            System.out.println("3. Peek Highest Priority Element");
            System.out.println("4. Display Priority Queue");
            System.out.println("5. Search Element");
            System.out.println("6. Size of Priority Queue");
            System.out.println("7. Check if Empty");
            System.out.println("8. Clear Priority Queue");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element: ");
                    int value = sc.nextInt();

                    pq.offer(value);

                    System.out.println("Element inserted successfully.");
                    break;

                case 2:
                    if (pq.isEmpty()) {
                        System.out.println("Priority Queue is empty.");
                    } else {
                        System.out.println(
                                "Removed element: " + pq.poll());
                    }
                    break;

                case 3:
                    if (pq.isEmpty()) {
                        System.out.println("Priority Queue is empty.");
                    } else {
                        System.out.println(
                                "Highest priority element: " + pq.peek());
                    }
                    break;

                case 4:
                    if (pq.isEmpty()) {
                        System.out.println("Priority Queue is empty.");
                    } else {
                        System.out.println(
                                "Priority Queue: " + pq);
                        System.out.println(
                                "Note: Display order is not necessarily sorted.");
                    }
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    int search = sc.nextInt();

                    if (pq.contains(search)) {
                        System.out.println("Element found.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 6:
                    System.out.println(
                            "Size: " + pq.size());
                    break;

                case 7:
                    if (pq.isEmpty()) {
                        System.out.println("Priority Queue is empty.");
                    } else {
                        System.out.println("Priority Queue is not empty.");
                    }
                    break;

                case 8:
                    pq.clear();
                    System.out.println("Priority Queue cleared.");
                    break;

                case 9:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 9);

        sc.close();
    }
}
