package com.example.linkelist;

public class ReverseLinkedList<T> {

    static class Node<T> {
        T data;
        Node next;

        Node(T data, Node node) {
            this.data = data;
            this.next = node;
        }
    }

    public void addNode(Node<T> node) {
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void printLinkList() {
        Node<T> temp = head.next;
        while (temp != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
    }

    public void reverse(Node node) {

        Node previous = null, next = null;

        Node current = node;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head.next = previous;
    }

    public void rervese(){
        reverse(head.next);
    }

    public void rerveseRecursive(){
        recursive(head.next);
    }

    public Node recursive(Node node){
        if(node == null)
            return null;
        if(node.next == null) {
            head.next = node;
            return node;
        }
        Node node1 = recursive(node.next);
        node1.next = node;
        node.next = null;
        return node;
    }

    private Node head;

    ReverseLinkedList() {
        head = new Node(null, null);
    }

    public static void main(String[] args) {

        ReverseLinkedList reverseLinkedListIteration = new ReverseLinkedList<Integer>();

        reverseLinkedListIteration.addNode(new Node(1, null));
        reverseLinkedListIteration.addNode(new Node(2, null));
        reverseLinkedListIteration.addNode(new Node(3, null));
        reverseLinkedListIteration.addNode(new Node(4, null));
        reverseLinkedListIteration.printLinkList();
        reverseLinkedListIteration.rervese();
        System.out.println();
        reverseLinkedListIteration.printLinkList();
        reverseLinkedListIteration.rerveseRecursive();
        System.out.println();
        reverseLinkedListIteration.printLinkList();


    }

}
