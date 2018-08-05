/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left, 1), maxDepth(root.right, 1));
    }
    
    private int maxDepth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        if (node.left == null && node.right == null) {
            return depth+1;
        }
        return Math.max(maxDepth(node.left, depth+1), maxDepth(node.right, depth+1));
    }
}
