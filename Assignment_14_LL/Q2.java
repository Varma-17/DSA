import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    static Node addTwoLists(Node first) {
        int num1 = 0;

        while (first.next != null) {
            num1 += first.data;
            num1 *= 10;
            first = first.next;
        }
        num1 += first.data;

        int num2 = num1 + 1;
        Node temp = null;

        while (num2 != 0) {
            int last = num2 % 10;
            temp = push(temp, last);
            num2 = num2 / 10;
        }

        return temp;
    }

    public static void main(String[] args) {
        Node first = null;
        first = push(first, 6);
        first = push(first, 4);
        first = push(first, 9);
        first = push(first, 5);
        first = push(first, 7);
        Node ans = addTwoLists(first);
        System.out.print("Sum is of first: ");
        printList(ans);
    }
}
