package com.dipak.algo.algorithms;

import java.util.Iterator;
import java.util.LinkedList;

public class JavaGraphBFS {
    public void execute(){
        int V = 4;
        intialize(V);
        addEdges(0,1);
        addEdges(0,2);
        addEdges(1,2);
        addEdges(2,0);
        addEdges(2,3);
        addEdges(3,3);
        BFS(2);
    }
    private int V;
    private LinkedList<Integer> adj[];
    private void intialize(int numberOfNodes){
        this.V = numberOfNodes;
        adj = new LinkedList[V];
        for(int i=0;i< V;i++){
            adj[i] = new LinkedList<Integer>();
        }
    }
    private void addEdges(int v, int w){
        adj[v].add(w);
    }
    private void BFS(int startingNode){
        boolean visited[] = new boolean[V];
        LinkedList<Integer> myQ = new LinkedList<Integer>();
        visited[startingNode] = true;
        myQ.add(startingNode);
        while(myQ.size() != 0){
            startingNode = myQ.poll();
            System.out.println(startingNode+" ");
            Iterator<Integer> iterator = adj[startingNode].listIterator();
            while(iterator.hasNext()){
                int n = iterator.next();
                if(!visited[n]){
                    visited[n] = true;
                    myQ.add(n);
                }
            }
        }
    }
}
