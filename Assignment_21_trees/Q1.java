import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeToBST {

    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        if (root == null)
            return inorder;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            inorder.add(curr.val);
            curr = curr.right;
        }

        return inorder;
    }

    private static void convertToBST(TreeNode root, List<Integer> inorder) {
        if (root == null)
            return;

        convertToBST(root.left, inorder);
        root.val = inorder.remove(0);
        convertToBST(root.right, inorder);
    }

    public static void binaryTreeToBST(TreeNode root) {
        List<Integer> inorder = inorderTraversal(root);
        Collections.sort(inorder);
        convertToBST(root, inorder);
    }

    private static void printInorder(TreeNode root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(3);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(8);

        System.out.println("Binary Tree before conversion:");
        printInorder(root);

        binaryTreeToBST(root);

        System.out.println("\nBinary Search Tree after conversion:");
        printInorder(root);
    }
}
