package com.dipak.test.sorting;

/**
 * find out a pivot (mostly middle element in the array. then move all smaller items to the left side
 * and greater elements to the right. Recursive process for the newly formed left array and right array
 */
public class QuickSort {
    private void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
    }
    public void sort() {
        System.out.println("=======================QUICK SORT=======================");
        int[] array = {23, 40, 1, 5, 60, 2, 100, 3};
        System.out.println("before sorting : ");
        printArray(array);
        quicksort(array,0, array.length-1);
        System.out.println("\nafter sorting : ");
        printArray(array);
    }

    private void quicksort(int[] array, int lowIndex, int highIndex){
        if(lowIndex > highIndex) return;
        int mid = lowIndex + (highIndex - lowIndex)/2;
        int pivotElement = array[mid];
        int i = lowIndex, j = highIndex;
        while (i<=j){
            while(array[i] < pivotElement) i++;
            while (array[j] > pivotElement) j--;
            if(i<=j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++; j--;
            }
        }
        if(lowIndex < j) // Recursive process if there are elements left on the left-side of j
            quicksort(array,lowIndex,j);
        if(highIndex > i) // Recursive process if there are elements left on the right side of i
            quicksort(array, i, highIndex);
    }
}
