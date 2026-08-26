class Solution {

    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        height(root);
        return ans;
    }

    public int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftVal = height(root.left);
        int rightVal = height(root.right);

        ans = Math.max(ans, leftVal + rightVal);

        return 1 + Math.max(leftVal, rightVal);
    }
}
