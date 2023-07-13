class Node {
    int data;
    Node next, arb;
    Node(int d) {
        data = d;
        next = arb = null;
    }
}

class LinkedList {
    Node head;

    void print(Node start) {
        Node ptr = start;
        while (ptr != null) {
            System.out.println("Data = " + ptr.data + ", Random = " + ptr.arb.data);
            ptr = ptr.next;
        }
    }

    Node clone() {
        Node original = head;

        while (original != null) {
            Node newNode = new Node(original.data);
            newNode.next = original.next;
            original.next = newNode;
            original = newNode.next;
        }

        original = head;
        while (original != null) {
            original.next.arb = (original.arb != null) ? original.arb.next : null;
            original = original.next.next;
        }

        original = head;
        Node cloned = head.next;
        Node clonedHead = cloned;
        while (original != null) {
            original.next = original.next.next;
            cloned.next = (cloned.next != null) ? cloned.next.next : null;
            original = original.next;
            cloned = cloned.next;
        }
        
        return clonedHead;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        list.head.arb = list.head.next.next;
        list.head.next.arb = list.head.next.next.next;

        Node cloned = list.clone();

        list.print(cloned);
    }
}
