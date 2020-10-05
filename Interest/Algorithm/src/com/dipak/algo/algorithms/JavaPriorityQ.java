package com.dipak.algo.algorithms;

import java.util.Iterator;
import java.util.PriorityQueue;

public class JavaPriorityQ {
    public void execute(){
        PriorityQueue<String> myQ = new PriorityQueue<String>();
        add_Queue(myQ);
        remove_poll_Queue(myQ);
        access_Queue(myQ);
        iterate_queue(myQ);
    }
    private void add_Queue (PriorityQueue<String> myQ){
        myQ.add("Dipak");
        myQ.add("Maity");
        myQ.add("Dustu");
        myQ.add("Habu");
        myQ.add("Sourajit");
        System.out.println("after adding : "+myQ);
    }
    private void remove_poll_Queue(PriorityQueue<String> myQ){
        boolean isRemoved = myQ.remove("Habu");
        System.out.println("is Removed : "+isRemoved);
        String value =  myQ.poll();
        System.out.println("polled value : "+value);
    }
    private void access_Queue(PriorityQueue<String> myQ){
        System.out.println("Peeked : "+myQ.peek());
    }
    private void iterate_queue(PriorityQueue<String> myQ){
        Iterator iterator = myQ.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
    }
}
