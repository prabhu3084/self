package com.leetcode.binarytree;

public class MADInBST {

    private int minDiff = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        minimumDifference(root, null);
        return minDiff;
    }


    private void minimumDifference(TreeNode node, TreeNode parent) {

        if (node == null) {
            return;
        }

        minimumDifference(node.left, node);

        if (parent != null) {
            minDiff = Math.min(minDiff, Math.abs(parent.val - node.val));
        }

        minimumDifference(node.right, node);

    }
}
