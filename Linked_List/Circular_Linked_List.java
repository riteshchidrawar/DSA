package Linked_List;

import java.util.Scanner;

// Circular Linked List
public class Circular_Linked_List {

    Node root, last;

    // Insert at left
    void insertLeft(int data) {
        Node n = new Node(data);

        if (root == null) {
            root = last = n;
        } else {
            n.next = root;
            root = n;
        }

        last.next = root;
    }

    // Delete from left
    void deleteLeft() {
        if (root == null) {
            System.out.println("LinkedList empty");
        } else {
            Node t = root;

            // Single node
            if (root == last) {
                root = last = null;
            } else {
                root = root.next;
                last.next = root;
            }

            System.out.println("Deleted: " + t.data);
        }
    }

    // Insert at right
    void insertRight(int data) {
        Node n = new Node(data);

        if (root == null) {
            root = last = n;
        } else {
            last.next = n;
            last = n;
        }

        last.next = root;
    }

    // Delete from right
    void deleteRight() {
        if (root == null) {
            System.out.println("LinkedList empty");
        } else {
            Node t = root;
            Node t2 = null;

            // Find last node and its previous node
            while (t.next != root) {
                t2 = t;
                t = t.next;
            }

            // Single node
            if (root == last) {
                root = last = null;
            } else {
                last = t2;
                last.next = root;
            }

            System.out.println("Deleted: " + t.data);
        }
    }

    // Display the circular linked list
    void printList() {
        if (root == null) {
            System.out.println("Empty List");
        } else {
            Node t = root;

            do {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            } while (t != root);

            System.out.println("(root)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circular_Linked_List list = new Circular_Linked_List();

        int choice, data;

        do {
            System.out.println("\n===== CIRCULAR LINKED LIST MENU =====");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Display List");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();

                    list.insertLeft(data);
                    System.out.println("Inserted at left.");
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();

                    list.insertRight(data);
                    System.out.println("Inserted at right.");
                    break;

                case 3:
                    list.deleteLeft();
                    break;

                case 4:
                    list.deleteRight();
                    break;

                case 5:
                    System.out.println("Circular Linked List:");
                    list.printList();
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}