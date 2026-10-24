
package Linked_List;

public class Doubly_Linked_List {
    Dnode root;

    void insertLeft(int data) {
        Dnode n = new Dnode(data);

        if (root == null)
            root = n;
        else {
            n.next = root;
            root.prev = n;
            root = n;
        }
    }

    void deleteLeft() {
        if (root == null)
            System.out.println("LinkedList empty");
        else {
            Dnode t = root;
            root = root.next;

            if (root != null) {
                root.prev = null;
            }

            System.out.print("\nDeleted: " + t.data);
        }
    }

    void insertRight(int data) {
        Dnode n = new Dnode(data);

        if (root == null)
            root = n;
        else {
            Dnode t = root;

            while (t.next != null) {
                t = t.next;
            }

            t.next = n;
            n.prev = t;
        }
    }

    void deleteRight() {
        if (root == null)
            System.out.println("LinkedList empty");
        else {
            Dnode t = root;

            while (t.next != null) {
                t = t.next;
            }

            if (t == root) {
                root = null;
            } else {
                Dnode t2 = t.prev;
                t2.next = null;
            }

            System.out.print("\nDeleted: " + t.data);
        }
    }

    void printList() {
        if (root == null)
            System.out.print("\nEmpty List");
        else {
            Dnode t = root;

            while (t != null) {
                System.out.print("<-|" + t.data + "|->");
                t = t.next;
            }

            System.out.print("null");
        }
    }

    void printList_Reverse() {
        if (root == null)
            System.out.print("\nEmpty List");
        else {
            Dnode t = root;

            // Move to the last node
            while (t.next != null) {
                t = t.next;
            }

            // Traverse backward
            while (t != null) {
                System.out.print("<-|" + t.data + "|->");
                t = t.prev;
            }

            System.out.print("null");
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        Doubly_Linked_List list = new Doubly_Linked_List();

        int choice, data;

        do {
            System.out.println("\n===== DOUBLY LINKED LIST MENU =====");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Display List");
            System.out.println("6. Display List Reverse");
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
                    System.out.println("Doubly Linked List:");
                    list.printList();
                    break;

                case 6:
                    System.out.println("Doubly Linked List in Reverse:");
                    list.printList_Reverse();
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
