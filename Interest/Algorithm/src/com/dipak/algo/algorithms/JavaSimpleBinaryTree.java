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
        System.out.println("\nInorder traversal : \n");
        inOrder_trav(root);
        insertKey(root, 12);
        System.out.println("\nInorder after insertion : \n");
        inOrder_trav(root);

        delete(root,11);
        System.out.println("\nAfter deletion : \n");
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

    private void delete(Node root, int key){
        if(root == null) return;
        if(root.left == null && root.right == null){
            if(root.data == key) root = null;
            else return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node temp = null, keyNode = null;
        while (!q.isEmpty()){
            temp = q.peek();
            q.remove();
            if(temp.data == key){
                keyNode = temp;
            }
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }
        if(keyNode != null){
            int x = temp.data;
            deleteDeepestNode(root,temp);
            keyNode.data = x;
        }
    }
    private void deleteDeepestNode(Node root,Node keyNode){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        Node temp = null;
        while (!q.isEmpty()){
            temp = q.peek();
            q.remove();

            if(temp == keyNode){
                temp = null;
                return;
            }
            if(temp.right != null){
                if(temp.right == keyNode){
                    temp.right = null;
                    return;
                }else{
                    q.add(temp.right);
                }
            }
            if(temp.left != null){
                if(temp.left == keyNode){
                    temp.left = null;
                    return;
                }else{
                    q.add(temp.left);
                }
            }
        }
    }
}
