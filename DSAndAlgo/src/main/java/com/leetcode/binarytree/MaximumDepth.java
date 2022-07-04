package com.leetcode.binarytree;

public class MaximumDepth {

    public int maxDepth(TreeNode root) {

        if(root == null){
            return  0;
        }

        int leftDepth = maxDepth(root.left);

        int rightDept = maxDepth(root.right);

        return Math.max(leftDepth, rightDept) + 1;

    }
}
