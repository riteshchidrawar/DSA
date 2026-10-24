package Linked_List;

import java.util.Scanner;

public class Circular_Doubly_Linked_List {

	Dnode root, last;

	void insertLeft(int data) {

		Dnode n = new Dnode(data);

		if (root == null) {
			root = last = n;
			root.next = root;
			root.prev = root;
		} else {
			n.next = root;
			n.prev = last;
			root.prev = n;
			last.next = n;
			root = n;
		}
	}

	void insertRight(int data) {
		Dnode n = new Dnode(data);

		if (root == null) {
			root = last = n;
			root.next = root;
			root.prev = root;
		} else {
			n.prev = last;
			n.next = root;
			last.next = n;
			root.prev = n;

			last = n;
		}
	}

	void deleteLeft() {
		if (root == null)
			System.out.println("LinkedList empty");
		else {
			Dnode t = root;

			if (root == last) {
				root = last = null;
			} else {
				root = root.next;
				root.prev = last;
				last.next = root;
			}

			System.out.print("\nDeleted: " + t.data);
		}
	}

	void deleteRight() {
		if (root == null) {
			System.out.println("LinkedList empty");
		} else {
			Dnode t = last;

			if (root == last) {
				root = last = null;
			} else {
				last = last.prev;
				last.next = root;
				root.prev = last;
			}

			System.out.println("\nDeleted: " + t.data);
		}
	}

	void printNormal() {
		if (root == null) {
			System.out.println("List is empty");
			return;
		}

		Dnode t = root;
		System.out.print("List:");

		do {
			System.out.print(" " + t.data);
			t = t.next;
		} while (t != root);

		System.out.println();
	}

	void printReverse() {
		if (root == null) {
			System.out.println("List is empty");
			return;
		}

		Dnode t = last;
		System.out.print("List:");

		do {
			System.out.print(" " + t.data);
			t = t.prev;
		} while (t != last);

		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Circular_Doubly_Linked_List list = new Circular_Doubly_Linked_List();

		int choice, data;

		do {
			System.out.println("\n===== CIRCULAR DOUBLY LINKED LIST =====");
			System.out.println("1. Insert Left");
			System.out.println("2. Insert Right");
			System.out.println("3. Delete Left");
			System.out.println("4. Delete Right");
			System.out.println("5. Display Normal");
			System.out.println("6. Display Reverse");
			System.out.println("7. Exit");

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
					list.printNormal();
					break;

				case 6:
					list.printReverse();
					break;

				case 7:
					break;

				default:
					System.out.println("Invalid choice!");
			}

		} while (choice != 7);
		sc.close();
	}

}
