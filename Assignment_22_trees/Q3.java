import java.util.*;

public class Solution {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static boolean isLeafNode(Node root) {
        return root.left == null && root.right == null;
    }

    static class Pair {
        Node node;
        String path;

        Pair(Node node, String path) {
            this.node = node;
            this.path = new String(path);
        }
    }

    static void printRootToLeaf(Node root) {
        if (root == null)
            return;

        String path = "";
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, path));

        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            root = pair.node;
            path = pair.path;

            String curr = root.data + " ";
            path += curr;

            if (isLeafNode(root))
                System.out.println(path);

            if (root.right != null)
                stack.push(new Pair(root.right, path));
            if (root.left != null)
                stack.push(new Pair(root.left, path));
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);

        printRootToLeaf(root);
    }
}
