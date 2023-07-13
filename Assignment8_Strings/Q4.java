/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public static StringBuilder preRoot(StringBuilder sb,TreeNode root)
    {
        if(root==null)
        {
            return sb;
        }

        sb.append("(");
        sb.append(root.val);
        if(root.left == null && root.right!=null)
        {
            sb.append("()");
        }
        preRoot(sb,root.left);
        preRoot(sb,root.right);

        sb.append(")");

        return sb;

    }


    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        sb = preRoot(sb,root);
        return sb.toString().substring(1,sb.length()-1);
    }
}
