package com.dipak.algo.algorithms;

public class SinglyLinkedList {
    public void execute(){
        //creating the nodes
        this.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        //connecting the nodes 1 --> 2 --> 3
        this.head.next = second;
        second.next = third;
        printLinkedList(this.head);
        System.out.println("\ninserting at head");
        insertAtHead(4);
        printLinkedList(this.head);
        System.out.println("\ninserting at position 3");
        insertAtPos(10,3);
        printLinkedList(this.head);
        System.out.println("\ninserting at end");
        append(20);
        printLinkedList(this.head);
        //deleting 10
        System.out.println("\ndeleting 10");
        deleteNode(10);
        printLinkedList(this.head);

    }

    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private void insertAtHead(int data){
        //complexity = O(1)
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }
    private void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }
    private void insertAtPos(int data, int index){
        Node leftNode = this.head, rightNode = this.head;
        for (int i=0;i<index;i++){
            if(i == 0) {
                leftNode = this.head;
                rightNode = this.head.next;
            }else{
                leftNode = leftNode.next;
                rightNode = rightNode.next;
            }
        }
        Node newNode = new Node(data);
        leftNode.next = newNode;
        newNode.next = rightNode;
    }
    private void deleteNode(int data){
        Node leftNode = this.head, temp = null;
        while(leftNode != null && leftNode.data != data){
            temp = leftNode;
            leftNode = leftNode.next;
        }
        if(temp == null) return;
        temp.next = leftNode.next;
    }
    private void printLinkedList(Node n){
        while(n != null){
            System.out.print(n.data + "==>");
            n = n.next;
        }
        System.out.print("null");
    }
}
