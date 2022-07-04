package com.leetcode.binarytree;

/*
https://leetcode.com/problems/subtree-of-another-tree/
 */
public class Subtree {

    private boolean result = false;

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null && subRoot == null) {
            result = true;
        }
          if(root == null){
              result=  false;
        }

        if (root.val == subRoot.val) {
            result = isSame(root, subRoot);
        }

        result = isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

        return result;
    }


    public boolean isSame(TreeNode treeNode, TreeNode subtree) {

        if (treeNode == null && subtree == null) {
            return true;
        }

        if (treeNode == null || subtree == null) {
            return false;
        }
        if (treeNode.val != subtree.val) {
            return false;
        }

        return isSame(treeNode.left, subtree.left) && isSame(treeNode.right, subtree.right);

    }
}
