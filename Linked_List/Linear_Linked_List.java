package Linked_List;

public class Linear_Linked_List {
	Node root;

	void insertLeft(int data) {
		Node n = new Node(data);

		if (root == null) {
			root = n;
		} else {
			n.next = root;
			root = n;
		}
	}

	void deleteLeft() {
		if (root == null) {
			System.out.println("LinkedList empty");
		} else {
			Node t = root;
			root = root.next;
			System.out.println("Deleted: " + t.data);
		}
	}

	void insertRight(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;
		} else {
			Node t = root;
			while (t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
	}

	void deleteRight() {
		if (root == null) {
			System.out.println("LinkedList empty");
		} else {
			Node t = root;
			Node t2 = root;

			while (t.next != null) {
				t2 = t;
				t = t.next;
			}
			if (t == root) {
				root = null;
			} else {
				t2.next = null;
				System.out.println("Deleted: " + t.data);
			}
		}
	}

	void printList() {
		if (root == null) {
			System.out.println("Empty List");
		} else {
			Node t = root;
			while (t != null) {
				System.out.print("|" + t.data + "|->");
				t = t.next;
			}
		}
	}

	boolean searchList(int key) {
		if (root == null) {
			System.out.println("Empty List");
		} else {
			Node t = root;
			while (t != null) {
				if (key == t.data) {
					return true;
				}
				t = t.next;
			}
		}
		return false;
	}

	void insertAfter(int ref, int new_data) {
		if (root == null) {
			System.out.println("LinkedList is empty");
		} else {
			Node t = root;
			while (t != null) {
				if (t.data == ref) {
					Node n = new Node(new_data);
					n.next = t.next;
					t.next = n;
					break;
				}
				t = t.next;
			}
			if (t == null) {
				System.out.println(ref + " Not Found");
			}
		}
	}

	void deleteElement(int element) {
		if (root == null) {
			System.out.println("LinkedList is empty");
		} else {
			Node t = root;
			Node t2 = root;

			while (t != null) {
				if (t.data == element) {
					if (t == root) {
						root = root.next;
					} else if (t.next == null) {
						t2.next = null;
					} else {
						t2.next = t.next;
					}
					System.out.println("Deleted: " + t.data);
					break;
				}
				t2 = t;
				t = t.next;
			}
			if (t == null) {
				System.out.println(element + " not found");
			}
		}
	}
}
