package com.dipak.test.sorting;

/**
 * Compare to adjacent elements in the array
 */
public class BubbleSort {

    public void sort(){
        System.out.println("=======================BUBBLE SORT=======================");
        int[] array = {23,40,1,5,60,2,100,3};
        System.out.println("before sorting : ");
        printArray(array);
        for(int i=0;i<array.length;i++){
            int flag = 0;
            for (int j=0;j<array.length-1-i;j++){ // after each iteration, last one will have the large number
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = 1;
                }
            }
            //System.out.print("\nlast number : "+array[array.length-1-i]);
            if(flag == 0) //i.e all items are sorted, no swap happened
                break;
        }
        System.out.println("\nafter sorting : ");
        printArray(array);
    }
    private void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
