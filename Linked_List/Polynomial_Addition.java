package Linked_List;

import java.util.LinkedList;
import java.util.Scanner;

public class Polynomial_Addition {
    static LinkedList<Polynomial> list1 = new LinkedList<>();
    static LinkedList<Polynomial> list2 = new LinkedList<>();
    static LinkedList<Polynomial> list3 = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    static void read_list(LinkedList<Polynomial> l) {
        System.out.println("\nEnter highest power:");
        int power = sc.nextInt();
        for (int i = power; i >= 0; i--) {
            System.out.println("For X^" + i + " coefficient:");
            float coefficient = sc.nextFloat();
            if (coefficient != 0)
                l.add(new Polynomial(coefficient, i));
        }
    }

    static void print_List(LinkedList<Polynomial> l) {
        for (int i = 0; i < l.size(); i++) {
            l.get(i).display();
        }
    }

    static LinkedList<Polynomial> add_polynomial(LinkedList<Polynomial> l1, LinkedList<Polynomial> l2) {
        LinkedList<Polynomial> ans = new LinkedList<>();
        int i, j;
        i = 0;
        j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i).power == l2.get(j).power) {
                ans.add(new Polynomial((l1.get(i).coefficient + l2.get(j).coefficient), l1.get(i).power));
                i++;
                j++;
            } else {
                if (l1.get(i).power > l2.get(j).power) {
                    ans.add(l1.get(i));
                    i++;
                } else {
                    ans.add(l2.get(j));
                    j++;
                }
            }
        }
        while (i < l1.size())// leftover
        {
            ans.add(l1.get(i));
            i++;
        }
        while (j < l2.size())// leftover
        {
            ans.add(l2.get(j));
            j++;
        }
        return ans;

    }

    public static void main(String[] args) {
        // First start reading the highest power of a coefficient. For each power ask
        // the user for the coefficient and if the coefficient is not zero then create a
        // node and enter.
        read_list(list1);
        // print
        System.out.println("Polynomial 1 ");
        print_List(list1);

        read_list(list2);
        // print
        System.out.println("Polynomial 2 ");
        print_List(list2);

        list3 = add_polynomial(list1, list2);
        System.out.println("Polynomial 3 ");
        print_List(list3);
    }
}
