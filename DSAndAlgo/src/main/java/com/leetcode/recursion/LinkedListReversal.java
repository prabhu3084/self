package com.leetcode.recursion;

public class LinkedListReversal {

    private ListNode reverseHead;

    public ListNode reverseList(ListNode head) {
        reverse(head);
        return reverseHead;
    }

    private ListNode reverse(ListNode node){

        if(node == null){
            return null;
        }

        if(node.next == null){
            reverseHead = node;
            return node;
        }

        ListNode tempNode = reverse(node.next);

        tempNode.next = node;

        node.next = null;

        return  node;

    }
}
