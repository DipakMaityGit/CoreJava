package com.dipak.algo.algorithms;

/***
 * Given 3 numbers {1, 3, 5}, we need to tell
 * the total number of ways we can form a number 'N'
 * using the sum of the given three numbers.
 * Total number of ways to form 6 is: 8
 * 1+1+1+1+1+1
 * 1+1+1+3
 * 1+1+3+1
 * 1+3+1+1
 * 3+1+1+1
 * 3+3
 * 1+5
 * 5+1
 */
public class SumFromDigits {
    private final int MAX = 100;
    private int lookUp[] = new int[MAX];

    public void execute(){
        initialize();
        System.out.println("final count :"+solve(4));
    }
    private void initialize(){
        for (int i =0;i< MAX;i++){
            lookUp[i] = -1;
        }
    }
    private int solve(int target){
        System.out.println("target : "+target);
        if(target < 0) return 0;
        if(target == 0 || target == 1) return 1;
        if(lookUp[target] != -1) return lookUp[target];
        return lookUp[target] = solve(target-1) + solve(target-3) + solve(target-5);
    }
}
