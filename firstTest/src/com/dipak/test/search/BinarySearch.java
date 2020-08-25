package com.dipak.test.search;

/**
 * array needs to be sorted
 * Time complexity = O(n/2)+c = O(logn)
 */
public class BinarySearch {
    public void search(){
        int[] array = {10,12,19,25,36,40,44,49,65,99,100};
        int targetValue = 99;
        System.out.println("Search index : "+doSearch(array,0,array.length-1,targetValue));
    }
    private int doSearch(int[] array,int lowIndex,int highIndex, int target){
        if(highIndex >= lowIndex){
            int midPos = lowIndex + (highIndex-lowIndex)/2;
            if(array[midPos] == target)
                return midPos;
            if(array[midPos] > target)
                return doSearch(array,lowIndex, midPos-1,target);
            if(array[midPos] < target)
                return doSearch(array,midPos+1,highIndex,target);
        }
        return -1;
    }
    private int doSearchWithoutRecursion(int[] array, int lowIndex, int highIndex, int target){
        while (highIndex >= lowIndex){
            int midpos = lowIndex + (highIndex-lowIndex)/2;
            if(array[midpos] == target) return midpos;
            if(array[midpos] > target) highIndex = midpos - 1;
            if(array[midpos] < target) lowIndex = midpos + 1;
        }
        return -1;
    }
}
