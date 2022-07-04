package com.leetcode.binarytree;

import org.w3c.dom.Node;

/*
   https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 */
public class SeconMinimumNode {

    private TreeNode secondMin = null;

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        secondMin = root.right;
        findSecondMinimum(root.right);
        findSecondMinimum(root.left);

        if (secondMin != null && secondMin.val > root.val) {
            return secondMin.val;
        }
        return -1;
    }


    public void findSecondMinimum(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        if (secondMin.val > treeNode.val) {
            secondMin = treeNode;
        }
        findSecondMinimum(treeNode.left);
        findSecondMinimumValue(treeNode.right);

    }
}
