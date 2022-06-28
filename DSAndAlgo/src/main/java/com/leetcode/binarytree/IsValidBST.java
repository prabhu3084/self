package com.leetcode.binarytree;

public class IsValidBST {

    public boolean isValidBST(TreeNode root) {

       return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, TreeNode l, TreeNode r)
    {
        if(root == null){
            return  true;
        }
        if(l != null && root.val <= l.val) {
            return false;
        }

        if(r != null && root.val >= r.val) {
            return false;
        }

        return isValidBST(root.left, l, root) && isValidBST(root.right, root, r);

    }
}
