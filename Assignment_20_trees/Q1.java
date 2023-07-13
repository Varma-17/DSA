import java.io.*;

class Solution {

    static class Node {
        public int key;
        public Node left, right;
    }

    static Node newNode(int key) {
        Node temp = new Node();
        temp.key = key;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    static int ans = Integer.MIN_VALUE;

    static int dfs(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return root.key;

        int sumleft = dfs(root.left);
        int sumright = dfs(root.right);
        int sumrootnode = sumleft + sumright + root.key;
        int tempmax = Math.max(sumleft, sumright);

        tempmax = Math.max(tempmax, sumrootnode);
        ans = Math.max(ans, tempmax);

        return sumrootnode;
    }

    static int findLargestSubtreeSum(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return root.key;

        int x = dfs(root);
        return ans;
    }

    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(-2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.left = newNode(-6);
        root.right.right = newNode(2);

        System.out.println(findLargestSubtreeSum(root));
    }
}
