package com.dipak.test;

import com.dipak.test.array.ArrayCopy;
import com.dipak.test.search.BinarySearch;
import com.dipak.test.search.LinearSearch;
import com.dipak.test.sorting.*;

public class MainEntry {
    public static void main(String[] args) {
        int executionNumber = 8;
        switch (executionNumber){
            case 0:
                new BubbleSort().sort();
                break;
            case 1:
                new SelectionSort().sort();
                break;
            case 2:
                new InsertionSort().sort();
                break;
            case 3:
                new MergeSort().sort();
                break;
            case 4:
                new QuickSort().sort();
                break;
            case 5:
                new HeapSort().sort();
                break;
            case 6:
                new LinearSearch().search();
                break;
            case 7:
                new BinarySearch().search();
                break;
            case 8:
                new ArrayCopy().arrayCloning();
        }
    }
}
