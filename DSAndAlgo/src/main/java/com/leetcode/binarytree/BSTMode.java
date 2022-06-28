package com.leetcode.binarytree;

import java.util.*;

public class BSTMode {

    private Set<Integer> list = new HashSet<>();

    private Integer preVal = null;


    private int maxValue = Integer.MIN_VALUE;

    private int count = 0 ;


    public int[] findMode(TreeNode root) {

        if (root != null && root.left == null && root.right == null) {
            return new int[]{root.val};
        }

        findMaxValue(root);

        preVal = null;

        count = 0 ;

        findMaxResult(root);

        int[] array = new int[list.size()];

        Iterator<Integer> iterable = list.iterator();

        int index = 0;

        while(iterable.hasNext()){

            array[index] = iterable.next();
            index++;
        }
        return array;
    }


    public void findMaxValue(TreeNode root) {

        if (root == null) {
            return;
        }

        findMaxValue(root.left);

        if (preVal != null && root.val == preVal) {
            count = count + 1;

        } else {
            count = 1;
            preVal = root.val;
        }
        maxValue = Math.max(count, maxValue);
        findMaxValue(root.right);
    }

    public void findMaxResult(TreeNode root) {

        if (root == null) {
            return;
        }

        findMaxResult(root.left);

        if (preVal != null && root.val == preVal) {
            count = count + 1;

        } else {
            count = 1;
            preVal = root.val;
        }

        if (count == maxValue) {
            list.add(root.val);
        }

        findMaxResult(root.right);
    }

}
