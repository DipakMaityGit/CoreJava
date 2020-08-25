package com.dipak.test.sorting;

/***
 * Find out the right place for a index element and place it correctly. while loop is shifting the element
 * while temp holds the actual value to be inserted.
 */
public class InsertionSort {
    private void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
    }
    public void sort() {
        System.out.println("=======================INSERTION SORT=======================");
        int[] array = {23, 40, 1, 5, 60, 2, 100, 3};
        System.out.println("before sorting : ");
        printArray(array);
        int j = 0, temp;
        for (int i = 1; i < array.length; i++) {
            j = i;
            temp = array[i];
            while(j > 0 && array[j-1] > array[i]){
                array[j] = array[j-1];
                j = j -1;
            }
            array[j] = array[i];
        }
        System.out.println("\nafter sorting : ");
        printArray(array);
    }
}
