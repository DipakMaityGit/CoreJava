package com.dipak.algo.algorithms;

public class DoubleLinkList {
    public void execute(){
        insertAtBegining(10);
        append(20);
        append((40));
        printList();
        System.out.println("after inserting at pos");
        insertAtPos(head.next,30);
        printList();
    }
    Node head;
    class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data = data;
            prev = next = null;
        }
    }
    private void insertAtBegining(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.prev = null;
            newNode.next = head;
        }
    }
    private  void insertAtPos(Node perv_ref, int data){
        Node newNode = new Node(data);
        if(perv_ref == null) return;
        newNode.next = perv_ref.next;
        if(newNode.next != null)
            newNode.next.prev = newNode;
        perv_ref.next = newNode;
        newNode.prev = perv_ref;
    }
    private void append(int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        newNode.prev = temp;
    }
    private void printList(){
        Node temp = head;
        System.out.println(temp.data);
        while(temp.next != null){
            temp = temp.next;
            System.out.println(temp.data);
        }
    }
}
