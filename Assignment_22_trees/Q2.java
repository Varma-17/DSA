import java.util.Queue;
import java.util.LinkedList;

public class Solution {

    public static Node flipBinaryTree(Node root) {
        if (root == null)
            return root;
        if (root.left == null && root.right == null)
            return root;

        Node flippedRoot = flipBinaryTree(root.left);

        root.left.left = root.right;
        root.left.right = root;
        root.left = root.right = null;

        return flippedRoot;
    }

    public static void printLevelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int nodeCount = queue.size();

            while (nodeCount > 0) {
                Node node = queue.poll();
                System.out.print(node.data + " ");

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);

                nodeCount--;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(1);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        System.out.println("Level order traversal of the given tree:");
        printLevelOrder(root);

        root = flipBinaryTree(root);

        System.out.println("Level order traversal of the flipped tree:");
        printLevelOrder(root);
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}
