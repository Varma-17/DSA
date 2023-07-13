class Node {
    int val;
    Node left;
    Node right;
    Node nextRight;

    public Node(int val) {
        this.val = val;
        this.nextRight = null;
    }
}

public class ConnectNodesAtSameLevel {

    public static void connectNodes(Node root) {
        if (root == null)
            return;

        if (root.left != null)
            root.left.nextRight = root.right;

        if (root.right != null) {
            if (root.nextRight != null)
                root.right.nextRight = root.nextRight.left;
            else
                root.right.nextRight = null;
        }

        connectNodes(root.left);
        connectNodes(root.right);
    }

    public static void printConnectedNodes(Node root) {
        Node current = root;

        while (current != null) {
            Node temp = current;
            while (temp != null) {
                int nextVal = (temp.nextRight != null) ? temp.nextRight.val : -1;
                System.out.print(temp.val + " -> " + nextVal + "  ");
                temp = temp.nextRight;
            }
            System.out.println();
            current = current.left;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        connectNodes(root);
        printConnectedNodes(root);
    }
}
