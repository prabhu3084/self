package com.leetcode.binarytree;

public class MinimumDepth {

    public int minDepth(TreeNode root) {
        if(root == null){
            return  0;
        }

        int leftDepth = minDepth(root.left);

        int rightDept = minDepth(root.right);

        return Math.min(leftDepth, rightDept) + 1;


    }
}
