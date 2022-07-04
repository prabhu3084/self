package com.leetcode.binarytree;

public class RootEqualSum {

    public boolean checkTree(TreeNode root) {

        return  root.val == root.left.val + root.right.val;
    }
}
