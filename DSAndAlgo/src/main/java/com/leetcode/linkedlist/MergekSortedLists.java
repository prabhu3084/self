package com.leetcode.linkedlist;

/*
https://leetcode.com/problems/merge-k-sorted-lists/
 */

public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        int k = lists.length;

        ListNode head = new ListNode(-1, null);

        while (true) {
            int value = Integer.MAX_VALUE;
            int m = 0;
            int j = 0;
            for (int index = 0; index < k; index++) {
                if (lists[index] != null) {
                    ListNode listNode = lists[index];
                    if (listNode.val < value) {
                        value = listNode.val;
                        m = index;
                    }
                } else {
                    j++;
                }
            }
            if(j ==k){
                break;
            }
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            ListNode newNode = new ListNode(lists[m].val, null);
            temp.next = newNode;
            lists[m] = lists[m].next;
        }
        return head.next;
    }
}
