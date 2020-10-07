package com.dipak.algo.algorithms;

import java.util.Iterator;
import java.util.LinkedList;

public class JavaGraphDFS {
    public void execute(){
        V = 4;
        initialize(V);
        addEdges(0,1);
        addEdges(0,2);
        addEdges(1,2);
        addEdges(2,0);
        addEdges(2,3);
        addEdges(3,3);
        DFSUtil(2);
    }

    private int V;
    private LinkedList<Integer> adj[];
    private void initialize(int numberOfNodes){
        V = numberOfNodes;
        adj = new LinkedList[numberOfNodes];
        for(int i=0;i< numberOfNodes;i++){
            adj[i] = new LinkedList<>();
        }
    }
    private void addEdges(int v, int w){
        adj[v].add(w);
    }
    private void DFSUtil(int startingNode){
        boolean visited[] = new boolean[V];
        DFS(startingNode, visited);
    }
    private void DFS(int currentNode, boolean[] visited){
        visited[currentNode] = true;
        System.out.print(currentNode+" ");
        Iterator<Integer> iterator = adj[currentNode].listIterator();
        while(iterator.hasNext()){
            int n = iterator.next();
            if(!visited[n]){
                visited[n] = true;
                DFS(n, visited);
            }
        }
    }
}
