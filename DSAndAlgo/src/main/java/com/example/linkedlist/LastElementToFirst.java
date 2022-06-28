package com.example.linkedlist;

public class LastElementToFirst<T>{
    static class Node<T> {
        T data;
        LastElementToFirst.Node next;

        Node(T data, LastElementToFirst.Node node) {
            this.data = data;
            this.next = node;
        }
    }

    public void addNode(LastElementToFirst.Node<T> node) {
        LastElementToFirst.Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    private LastElementToFirst.Node head = new LastElementToFirst.Node<>(null, null);

    public void addLastToFrontIterartive(){
        LastElementToFirst.Node<T> temp = head;
        LastElementToFirst.Node<T> prev = null;

        while (temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        temp.next = head.next;
        head.next = temp;
    }
    public void printLinkList() {
        LastElementToFirst.Node<T> temp = head.next;
        while (temp != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LastElementToFirst lastElementToFirst = new LastElementToFirst();
        lastElementToFirst.addNode(new LastElementToFirst.Node<>(1, null));
        lastElementToFirst.addNode(new LastElementToFirst.Node<>(2, null));

        lastElementToFirst.addNode(new LastElementToFirst.Node<>(3, null));

        lastElementToFirst.addNode(new LastElementToFirst.Node<>(4, null));

        lastElementToFirst.addNode(new LastElementToFirst.Node<>(5, null));

        lastElementToFirst.printLinkList();
        lastElementToFirst.addLastToFrontIterartive();
        System.out.println();
        lastElementToFirst.printLinkList();

    }
}
