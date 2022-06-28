package com.example.linkedlist;

public class Add1ToLinkedList<T> {

    private int carry;

    static class Node<T> {
        T data;
        Add1ToLinkedList.Node next;

        Node(T data, Add1ToLinkedList.Node node) {
            this.data = data;
            this.next = node;
        }
    }

    public void addNode(Add1ToLinkedList.Node<T> node) {
        Add1ToLinkedList.Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    private Add1ToLinkedList.Node head = new Add1ToLinkedList.Node<>(null, null);

    public void add1(){


    }

    public Node recuresive(Node<Integer> node){

        if(node == null){
            return  null;
        }
        if(node.next == null){
            node.data = (node.data + 1+  carry);
            carry = node.data  / 10;
            node.data = node.data %10;
            return node;
        }
        recuresive(node.next);
        node.data = (node.data + carry);
        carry = (node.data  ) / 10;
        node.data = node.data % 10;

        return node;

    }

    public void recuresive(){

        recuresive(head.next);

        if(carry == 1) {
            Node node = new Node<Integer>(carry, head.next);
            head.next = node;
        }

    }

    public void printLinkList() {
        Node<T> temp = head.next;
        while (temp != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Add1ToLinkedList add1ToLinkedList = new Add1ToLinkedList<Integer>();
        add1ToLinkedList.addNode(new Node(9, null));
        add1ToLinkedList.addNode(new Node(9, null));
        add1ToLinkedList.addNode(new Node(9, null));
        add1ToLinkedList.addNode(new Node(9, null));
        add1ToLinkedList.addNode(new Node(8, null));
        add1ToLinkedList.recuresive();
        add1ToLinkedList.printLinkList();
    }
}
