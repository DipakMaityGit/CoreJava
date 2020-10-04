package com.dipak.algo.algorithms;

public class Fibonacci {

    private final int MAX = 100;
    private int n1=0,n2 =1;
    private  int lookUp[] = new int[MAX];

    public void execute(){
        System.out.println("0");
        System.out.println("1");
        fibonaciInRecursive(20);

       // initializeLookUp();
       // System.out.println(fibonacciDynamic(10));
    }
    private void fibonaciInRecursive(int index){
            if(index > 0){
                int n3 = n1+n2;
                n1 = n2;
                n2 = n3;
                System.out.println(n3);
                fibonaciInRecursive(index-1);
        }
    }
    private void initializeLookUp(){
        for(int i=0;i<MAX;i++){
            lookUp[i] = -1;
        }
    }
    private int fibonacciDynamic(int index){
        if(lookUp[index] == -1){
            //i.e. this sub-problem was not solved yet
            if(index <= 1)
                lookUp[index] = index;
            else
                lookUp[index] = fibonacciDynamic(index-1) + fibonacciDynamic(index-2);
        }
        return  lookUp[index];
    }
}
