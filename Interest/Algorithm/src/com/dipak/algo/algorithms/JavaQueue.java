package com.dipak.algo.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public void execute(){
        Queue<Integer> myQ = new LinkedList<Integer>();
        add_queue(myQ,10);
        remove_queue(myQ);
        peek_queue(myQ);
    }
    private void add_queue(Queue<Integer> myQ, int howMany){
        for(int i=0;i<howMany;i++)
            myQ.add(i+1);
    }
    private void remove_queue(Queue<Integer> myQ){
        Integer removedVal = myQ.remove();
        System.out.println("removed value : "+removedVal);
    }
    private void peek_queue(Queue<Integer> myQ){
        Integer peekedVal = myQ.peek();
        System.out.println("Peeked value : "+peekedVal);
    }
}
