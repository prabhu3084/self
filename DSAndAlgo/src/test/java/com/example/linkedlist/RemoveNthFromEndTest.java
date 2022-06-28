package com.example.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveNthFromEndTest {

    private RemoveNthFromEnd removeNthFromEnd;

    @Before
    public void setUp(){
        removeNthFromEnd = new RemoveNthFromEnd();
    }

    @Test
    public void removeNthFromEnd(){
        ListNode node = new ListNode(1, null);
    //   Assert.assertEquals(null, removeNthFromEnd.removeNthFromEnd(node, 1));

        ListNode node1 = new ListNode(2, null);

        node.next = node1;

        ListNode node2 = new ListNode(3, null);

        node1.next = node2;

        ListNode node3 = new ListNode(4, null);

        node2.next = node3;


        ListNode node4 = new ListNode(4, null);

        node3.next = node4;


        Assert.assertEquals(node, removeNthFromEnd.removeNthFromEnd(node, 2));

        System.out.println("hello");


    }
}
