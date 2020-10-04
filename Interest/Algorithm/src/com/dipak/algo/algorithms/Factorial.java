package com.dipak.algo.algorithms;

public class Factorial {

    private final int MAX = 100;
    private  int lookUp[] = new int[MAX];

    public void execute(){
        factorialsNormal(10);
        initializeLookUp();
       // System.out.println(factorialsDynamic(10));
    }

    private void initializeLookUp(){
        for(int i=0;i<MAX;i++){
            lookUp[i] = -1;
        }
    }
    private void factorialsNormal(int number){
        int result = 1;
        if(number == 0) result = 1;
        else{
            for(int i=1;i<=number;i++){
                result *= i;
            }
        }
        System.out.println("result : "+result);
    }
    private int factorialsDynamic(int number){
        if(number == 0){
            return 1;
        }
        if(lookUp[number] != -1) return lookUp[number];
        else
           return (lookUp[number] = number * factorialsDynamic(number-1));
    }
}
