package com.leetcode.binarytree;

public class LCABinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }

        if(root.val > p.val && root.val < q.val){

            return  root;
        }
        if(root.val < p.val && root.val > q.val){

            return  root;
        }

        if(root.val == p.val ){
            return root;
        }
        if(root.val == q.val){
            return root;
        }

        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }

        if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }

        return null;

    }
}
