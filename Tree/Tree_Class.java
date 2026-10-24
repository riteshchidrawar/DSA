package Tree;

import java.util.Scanner;

public class Tree_Class {
    static Node root;

    // Insert a node into BST
    static void insert(Node r, Node n) {
        if (root == null) {
            root = n;
        } else {
            if (n.data < r.data) {
                if (r.left == null)
                    r.left = n;
                else
                    insert(r.left, n);
            } else {
                if (r.right == null)
                    r.right = n;
                else
                    insert(r.right, n);
            }
        }
    }

    // Inorder: LPR
    static void inorder(Node r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }

    // Preorder: PLR
    static void preorder(Node r) {
        if (r != null) {
            System.out.print(r.data + " ");
            preorder(r.left);
            preorder(r.right);
        }
    }

    // Postorder: LRP
    static void postorder(Node r) {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ");
        }
    }

    // Search an element in BST
    static boolean search(Node r, int key) {
        if (r == null)
            return false;

        if (r.data == key)
            return true;

        if (key < r.data)
            return search(r.left, key);
        else
            return search(r.right, key);
    }

    static int countNodes(Node r) {
        if (r == null)
            return 0;
        else
            return 1 + countNodes(r.left) + countNodes(r.right);
    }

    static int countLeafNodes(Node r) {
        if (r == null)
            return 0;
        if (r.left == null && r.right == null)
            return 1;
        return countLeafNodes(r.left) + countLeafNodes(r.right);
    }

    static int depth(Node r) {
        if (r == null)
            return 0;
        int left_depth = depth(r.left);
        int right_dept = depth(r.right);
        return 1 + Math.max(left_depth, right_dept);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, data;

        do {
            System.out.println("\n\n--- BINARY SEARCH TREE ---");
            System.out.println("1. Insert");
            System.out.println("2. Inorder Traversal (LPR)");
            System.out.println("3. Preorder Traversal (PLR)");
            System.out.println("4. Postorder Traversal (LRP)");
            System.out.println("5. Search");
            System.out.println("6. Count Nodes");
            System.out.println("7. Count Leaf Nodes");
            System.out.println("8. Depth Of Tree");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    data = sc.nextInt();
                    insert(root, new Node(data));
                    System.out.println("Node inserted successfully.");
                    break;

                case 2:
                    if (root == null)
                        System.out.println("Tree is empty.");
                    else {
                        System.out.print("Inorder: ");
                        inorder(root);
                    }
                    break;

                case 3:
                    if (root == null)
                        System.out.println("Tree is empty.");
                    else {
                        System.out.print("Preorder: ");
                        preorder(root);
                    }
                    break;

                case 4:
                    if (root == null)
                        System.out.println("Tree is empty.");
                    else {
                        System.out.print("Postorder: ");
                        postorder(root);
                    }
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    data = sc.nextInt();

                    if (search(root, data))
                        System.out.println(data + " found in BST.");
                    else
                        System.out.println(data + " not found in BST.");
                    break;
                case 6:
                    if (root == null)
                        System.out.println("Tree is empty.");
                    else {
                        System.out.print("Nodes are: " + countNodes(root));
                    }
                    break;
                case 7:
                    if (root == null)
                        System.out.println("Tree is empty.");
                    else {
                        System.out.print("Leaf Nodes are: " + countLeafNodes(root));
                    }
                    break;
                case 8:
                    if (root == null)
                        System.out.println("Tree is empty.");
                    else {
                        System.out.print("Depth is: " + (depth(root) - 1));
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
