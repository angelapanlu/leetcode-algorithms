/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {//left leave
                return root.left.val + sumOfLeftLeaves(root.right);
            } else { //left decedent is not leave
                return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
            }
        } else {//no left decendent
            return sumOfLeftLeaves(root.right);
        }
    }
}
