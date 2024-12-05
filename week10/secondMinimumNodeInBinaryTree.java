package week10;

import javax.swing.tree.TreeNode;

public class secondMinimumNodeInBinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;

        long secondMin = dfs(root, root.val);
        return secondMin == Long.MAX_VALUE ? -1 : (int) secondMin;
    }
    private long dfs(TreeNode node, int minValue) {
        if (node == null) return Long.MAX_VALUE;

        if (node.val > minValue) return node.val;

        long left = dfs(node.left, minValue);
        long right = dfs(node.right, minValue);

        return Math.min(left, right);
    }
}
