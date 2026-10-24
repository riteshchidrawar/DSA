package Linked_List;

import java.util.Scanner;

public class Linked_List_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Linear_Linked_List list = new Linear_Linked_List();

        int choice, data, key;

        do {
            System.out.println("\n===== LINEAR LINKED LIST MENU =====");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Display List");
            System.out.println("6. Search Element");
            System.out.println("7. Insert After");
            System.out.println("8. Delete Specific");
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
                    System.out.println("Linked List:");
                    list.printList();
                    break;

                case 6:
                    System.out.print("Enter element to search: ");
                    key = sc.nextInt();

                    if (list.searchList(key)) {
                        System.out.println("Element found.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 7:
                    System.out.println("Enter the ref element");
                    int ref = sc.nextInt();
                    System.out.println("Enter the new data");
                    int element = sc.nextInt();
                    list.insertAfter(ref, element);
                    break;

                case 8:
                    System.out.println("Enter the element to delete");
                    int element1 = sc.nextInt();
                    list.deleteElement(element1);
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
