class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

class DoublyLinkedListNode {
    int val;
    DoublyLinkedListNode prev;
    DoublyLinkedListNode next;

    public DoublyLinkedListNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeToDoublyLinkedList {

    private static DoublyLinkedListNode prev = null;

    private static DoublyLinkedListNode convertToDoublyLinkedList(TreeNode root) {
        if (root == null)
            return null;

        DoublyLinkedListNode head = convertToDoublyLinkedList(root.left);

        DoublyLinkedListNode current = new DoublyLinkedListNode(root.val);

        if (prev != null) {
            prev.next = current;
            current.prev = prev;
        }

        prev = current;

        if (head == null)
            head = current;

        convertToDoublyLinkedList(root.right);

        return head;
    }

    private static void printDoublyLinkedList(DoublyLinkedListNode head) {
        DoublyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(30);
        root.right.right = new TreeNode(35);

        DoublyLinkedListNode head = convertToDoublyLinkedList(root);

        System.out.println("Output:");
        printDoublyLinkedList(head);
    }
}
