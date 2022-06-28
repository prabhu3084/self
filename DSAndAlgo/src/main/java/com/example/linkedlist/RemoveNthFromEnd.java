package com.example.linkedlist;

public class RemoveNthFromEnd {

    private int counter = 0;

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {

            return null;
        }

        if (head.next == null) {

            return null;
        }

        if (head.next.next == null) {
            if (n == 1) {
                head.next = null;
            } else {
                return head.next;
            }
            return head;

        }
        ListNode node = removeFromEnd(head, n);

        if (n == counter) {
            return node;
        } else if (n == counter + 1) {
            return node.next;
        } else {
            return null;
        }

    }


    public ListNode removeFromEnd(ListNode node, int n) {

        if (node.next == null) {

            return node;
        }

        ListNode node1 = removeFromEnd(node.next, n);


        if (counter == n) {
            node.next = node1.next;
            return node;
        } else {
            counter++;
        }

        return node;
    }

}
