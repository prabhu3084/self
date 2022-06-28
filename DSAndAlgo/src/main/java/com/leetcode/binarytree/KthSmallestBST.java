package com.leetcode.binarytree;

public class KthSmallestBST {

    private int count = 0;

    public int kthSmallest(TreeNode root, int k) {

        TreeNode node = kthSmallestBST(root, k);

        if (node != null) {
            return node.val;
        }
        return -1;
    }


    public TreeNode kthSmallestBST(TreeNode root, int k) {

        if (root == null) {
            return null;
        }

        TreeNode left = kthSmallestBST(root.left, k);
        if (left != null) {
            return left;
        }

        count++;
        if (count == k) {
            return root;
        }

        return kthSmallestBST(root.right, k);

    }
}
