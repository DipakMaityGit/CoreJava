package com.dipak.algo.algorithms;

public class    CircularLinkedList {
    public void execute(){
        Node head = null;
        head = insertAt(head, 12);
        head = insertAt(head, 56);
        head = insertAt(head, 2);
        head = insertAt(head, 11);
        printList(head);
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private void printList(Node head_ref){

        Node temp = head_ref;
        System.out.println(temp.data);
        while(temp.next != head_ref){
            temp = temp.next;
            System.out.println(temp.data);
        }
    }

    private Node insertAt(Node head_ref, int data){
        Node newNode = new Node(data);
        if(head_ref == null){
            //its a empty linked list
            head_ref = newNode;
            head_ref.next = newNode;
        }else{
            Node temp = head_ref;
            newNode.next = head_ref;
            while(temp.next != head_ref){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return  head_ref;
    }
}
