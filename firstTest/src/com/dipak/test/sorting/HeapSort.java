package com.dipak.test.sorting;

/**
 * create a heap (heapify) from the given array
 * delete elements from the heap(delete happens from root always in a heap). This will give a sorted array.
 * time complexity = nlogin( for heapify) + nlogin (for delete) = 2nlogn ~ nlogn
 */
public class HeapSort {
    private void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
    }
    public void sort() {
        System.out.println("=======================HEAP SORT=======================");
        int[] array = {23, 40, 1, 5, 60, 2, 100, 3};
        System.out.println("before sorting : ");
        printArray(array);
        heapSort(array);
        System.out.println("\nafter sorting : ");
        printArray(array);
    }
    private void heapSort(int[] arr){
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        System.out.println("\nafter heapify : ");
        printArray(arr);
        // One by one extract an element from heap
       for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
    private void heapify(int[] arr, int n, int i){
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
