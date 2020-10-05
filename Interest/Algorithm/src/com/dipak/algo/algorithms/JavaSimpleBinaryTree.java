package com.dipak.algo.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class JavaSimpleBinaryTree {
    public void execute(){
        root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(9);
        root.left.left = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        System.out.println("Inorder traversal : \n");
        inOrder_trav(root);
        insertKey(root, 12);
        System.out.println("Inorder after insertion : \n");
        inOrder_trav(root);
    }
    Node root;
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    private void inOrder_trav(Node root){
        if(root == null) return;
        inOrder_trav(root.left);
        System.out.print(root.data +" ");
        inOrder_trav(root.right);
    }
    private void insertKey(Node root, int value){
        Node newNode = new Node(value);
        if(root == null) {
            root = newNode;
            return;
        }
        Queue<Node> q = new LinkedList<>();
        Node temp = root;
        q.add(temp);
        while (!q.isEmpty()){
            temp = q.peek();
            q.remove();

            if(temp.left == null){
                temp.left = newNode;
                break;
            }else{
                q.add(temp.left);
            }
            if(temp.right == null){
                temp.right = newNode;
                break;
            }else{
                q.add(temp.right);
            }
        }

    }
}
