package com.dipak.test.search;

public class LinearSearch {
    public void search(){
        int[] array = {89,43,1,2,5, 100, 50, 32};
        int targetValue = 500;
        System.out.println("Search index : "+doSearch(array,targetValue));
    }

    private int doSearch(int[] array, int target){
        for (int i = 0;i< array.length ;i++){
            if(array[i] == target)
                return i;
        }
        return -1;
    }
}
