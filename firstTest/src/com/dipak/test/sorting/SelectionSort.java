package com.dipak.test.sorting;

/***
 * Select an element in the array and compare it against all other element
 * outer loop is selecting an element from the array and inner loop is starting form the next element and
 * keep comparing.
 * After each inner loop completion, next large item will be placed at the end.
 */
public class SelectionSort {
    private void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
    }
    public void sort() {
        System.out.println("=======================SELECTION SORT=======================");
        int[] array = {23, 40, 1, 5, 60, 2, 100, 3};
        System.out.println("before sorting : ");
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1 ; j < array.length ; j++){
                if(array[j]< array [i]){
                    int temp = array [i];
                    array [i] = array [j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("\nafter sorting : ");
        printArray(array);
    }
}
