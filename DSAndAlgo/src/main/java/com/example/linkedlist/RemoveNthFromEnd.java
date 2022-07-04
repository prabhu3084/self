package com.example.linkedlist;

public class RemoveNthFromEnd {

    private int counter = 0;

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        if (head.next == null && n == 1) {
            return null;
        }

        remove(head, n);

        return head;
    }

    private ListNode remove(ListNode head, int n) {


        if (head.next == null) {

            return head;
        }

        ListNode tempNode = remove(head.next, n);

        counter++;

        if (counter == n) {

            head.next = tempNode.next;
        }

        return head;

    }
}
