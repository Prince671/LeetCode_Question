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

    static boolean checkPath(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        // If this is a leaf
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        targetSum -= root.val;

        return checkPath(root.left, targetSum) ||
               checkPath(root.right, targetSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        return checkPath(root, targetSum);
    }
}