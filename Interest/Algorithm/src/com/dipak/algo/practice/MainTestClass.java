package com.dipak.algo.practice;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MainTestClass {
    public static void main(String[] args) {
        //minimumPlatform();
        //test();
        //stockBuyAndSell();
        //longestSubsequence();
        kLargestElements();
    }
    private static void test(){
        Queue<Integer> q = new PriorityQueue<>();
        q.add(12);
        q.add(5);
        q.add(787);
        q.add(1);
        q.add(23);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.poll();
        }
    }
    private static void syntaxChecker(){
        String str = "[(])";
        Stack<Character> myStack = new Stack<>();
        for (Character chars : str.toCharArray()) {
            if(myStack.isEmpty()) myStack.push(chars);
            else if(chars == '(' || chars == '{' || chars == '['){
                myStack.push(chars);
            }else{
                if(chars == ')' && myStack.peek() == '(') myStack.pop();
                else if(chars == '}' && myStack.peek() == '{') myStack.pop();
                else if(chars == ']' && myStack.peek() == '[') myStack.pop();
                else
                    myStack.push(chars);
            }
        }
        if(myStack.isEmpty()) System.out.println("Balanced");
        else System.out.println("not Balanced");
    }
    private static void minimumPlatform(){
        int n = 3;
                    //0    1   2   3    4   5
        int arr[] = {900,940,950,1100,1500,1800};
        int dep[] = {910,1200,1120,1130,1900,2000};
                    //910,1120,1130,1200,1900,2000
        /***
         * i = 6
         * j = 4
         * pn = 2
         * result = 
         */
        Arrays.sort(arr);
        Arrays.sort(dep);
        int pn=1,result=1,i=1,j=0;
        while(i<n&&j<n){
            if(arr[i]<=dep[j]){
                pn++;
                i++;
            }
            else if(arr[i]>dep[j]){
                pn--;
                j++;
            }
            if(pn>result)
                result=pn;
        }
        System.out.println("total platform number : "+result);
    }
    private static void stockBuyAndSell(){
        String input = "23 13 25 29 33 19 34 45 65 67";
        int numberOfRecords = 10;
        String[] allInputs = input.split(" ");
        int integerArray[] = new int[numberOfRecords];
        if(allInputs.length > 0){
            for (int i=0;i<allInputs.length;i++){
                integerArray[i] = Integer.valueOf(allInputs[i]);
            }
        }
        int buy[] = new int[10];
        int sell[] = new int[10];
        int buyCounter=0, sellCounter = 0;
        boolean isEligibleToBuy = true;
        for (int i=0;i<numberOfRecords-1;i++){
            if(integerArray[i] < integerArray[i+1] && isEligibleToBuy) {
                buy[buyCounter++] = i;
                isEligibleToBuy = false;
            }
            if(integerArray[i] > integerArray[i+1] && buyCounter > 0){
                sell[sellCounter++] = i;
                isEligibleToBuy = true;
            }
        }
        //bought but not sold
        if(buyCounter > sellCounter)
            sell[sellCounter++] = numberOfRecords-1;

        //print the result
        if(buyCounter > 0 && sellCounter > 0){
            for(int i=0;i<buyCounter;i++)
                System.out.println("("+buy[i]+","+sell[i]+")");
        }else{
            System.out.println("No Profit");
        }
    }
    private static void longestSubsequence(){
        String input = "1 9 3 10 4 20 2";
        int numberOfRecords = 7;
        String[] allInputs = input.split(" ");
        int integerArray[] = new int[numberOfRecords];
        if(allInputs.length > 0){
            for (int i=0;i<allInputs.length;i++){
                integerArray[i] = Integer.valueOf(allInputs[i]);
            }
        }
        Arrays.sort(integerArray);
        int maxCount = 0, tempCount = 1;
        for(int i=1;i<numberOfRecords;i++){
            if(integerArray[i] == integerArray[i-1] + 1){
                tempCount ++;
            }else{
                if(tempCount > maxCount)
                    maxCount = tempCount;
                tempCount = 1;
            }
        }
        System.out.println("max vale : "+maxCount);
    }
    private static void kLargestElements(){
        int totalNumber = 7;
        int targetNumber = 3;
        int arr[] = {1, 23, 12, 9, 30, 2, 50};
        Arrays.sort(arr);

        for(int i = arr.length-1;i>arr.length-1-targetNumber;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
