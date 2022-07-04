package com.leetcode.binarytree;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);

    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return false;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val == right.val) {
            return isMirror(left.right, right.left) && isMirror(left.left, right.right);
        }

        return false;
    }
}
