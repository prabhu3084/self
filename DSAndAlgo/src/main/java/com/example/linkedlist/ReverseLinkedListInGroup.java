package com.example.linkedlist;

public class ReverseLinkedListInGroup<T> {

    static class Node<T> {
        T data;
        ReverseLinkedListInGroup.Node next;

        Node(T data, ReverseLinkedListInGroup.Node node) {
            this.data = data;
            this.next = node;
        }
    }

    public void addNode(ReverseLinkedListInGroup.Node<T> node) {
        ReverseLinkedListInGroup.Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void printLinkList() {
        ReverseLinkedListInGroup.Node<T> temp = head.next;
        while (temp != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
    }

    public void reverse(ReverseLinkedListInGroup.Node node) {

        int k = 4;

        int i = 1;

        ReverseLinkedListInGroup.Node previous = null, next = null;

        ReverseLinkedListInGroup.Node current = node;

        while (true) {
            while (current != null && i<=k ) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
                k++;
            }
            if(i == k){
                break;
            }else {

            }
        }


    }

    public void rervese(){
        reverse(head.next);
    }

    public void rerveseRecursive(){
        recursive(head.next);
    }

    public ReverseLinkedListInGroup.Node recursive(ReverseLinkedListInGroup.Node node){
        if(node == null)
            return null;
        if(node.next == null) {
            head.next = node;
            return node;
        }
        ReverseLinkedListInGroup.Node node1 = recursive(node.next);
        node1.next = node;
        node.next = null;
        return node;
    }

    private ReverseLinkedListInGroup.Node head;

    ReverseLinkedListInGroup() {
        head = new ReverseLinkedListInGroup.Node(null, null);
    }

    public static void main(String[] args) {

        ReverseLinkedListInGroup reverseLinkedListIteration = new ReverseLinkedListInGroup<Integer>();

        reverseLinkedListIteration.addNode(new ReverseLinkedListInGroup.Node(1, null));
        reverseLinkedListIteration.addNode(new ReverseLinkedListInGroup.Node(2, null));
        reverseLinkedListIteration.addNode(new ReverseLinkedListInGroup.Node(3, null));
        reverseLinkedListIteration.addNode(new ReverseLinkedListInGroup.Node(4, null));
        reverseLinkedListIteration.printLinkList();
        reverseLinkedListIteration.rervese();
        System.out.println();
        reverseLinkedListIteration.printLinkList();
        reverseLinkedListIteration.rerveseRecursive();
        System.out.println();
        reverseLinkedListIteration.printLinkList();


    }
}
