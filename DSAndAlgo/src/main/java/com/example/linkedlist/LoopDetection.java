package com.example.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LoopDetection<T> {

    static class Node<T> {
        T data;
        LoopDetection.Node next;

        Node(T data, LoopDetection.Node node) {
            this.data = data;
            this.next = node;
        }
    }
    public void createLoop(){
             Node<Integer> temp = head;
            for(int i =1 ; i <=6; i++){
             Node<Integer> node = new Node(i, null);
             temp.next = node;
             temp = node;
            }
            Node<Integer> last = temp;
            temp = head.next;

            while(temp.data !=2){
                temp = temp.next;
        }

            last.next = temp;
    }

    //With hashcode
    public boolean loopDetectionWithHash() {

        Set<Node> nodes = new HashSet<>();

        Node<Integer> temp = head.next;

        while (temp != null || !nodes.contains(temp)) {
            nodes.add(temp);
            temp = temp.next;
        }

        if (temp != null) {
            return true;
        }
        return false;
    }

    //With floyd warshall algorithm
    public boolean loopDetectionWithFloydWarshallAlgorithm(){

        Node<Integer> first = head.next;
        Node<Integer> second = head.next;

        while(first !=null && second!=null && second.next.next!=null){
             first = first.next;
             second = second.next.next;
             if (first==second)
                return true;
        }

        return false;
    }

    public void printLinkList() {
        LoopDetection.Node<T> temp = head.next;
        while (temp != null) {
            System.out.print(temp.data + "==>");
            temp = temp.next;
        }
    }

    private Node head = new Node(null, null);

    public static void main(String[] args) {
        LoopDetection<Integer> loopDetection = new LoopDetection<>();
        loopDetection.createLoop();
        System.out.println(loopDetection.loopDetectionWithFloydWarshallAlgorithm());
        System.out.println(loopDetection.loopDetectionWithFloydWarshallAlgorithm());
    }
}
