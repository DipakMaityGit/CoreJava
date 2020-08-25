package com.dipak.test.sorting;

/**
 * Devide the main array till you get single element and then start merging the sub-arrays
 */
public class MergeSort {
    private void printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
    }
    public void sort() {
        System.out.println("=======================MERGE SORT=======================");
        int[] array = {23, 40, 1, 5, 60, 2, 100, 3};
        System.out.println("before sorting : ");
        printArray(array);

        int[] resultArray = devide(array);
        System.out.println("\nafter sorting : ");
        printArray(resultArray);
    }
    public int[] devide(int[] subArray){
        if(subArray.length == 1){
            return  subArray;
        }
        //find out middle point and create two blank arrays
        int midpoint = subArray.length/2;
        int[] leftArray = new int[midpoint];
        int[] rightArray;
        if(subArray.length %2 == 0){
            rightArray = new int[midpoint];
        }else{
            rightArray = new int[midpoint+1];
        }
        //populate the sub-arrays form the main array
        for(int i = 0; i< midpoint ;i++){
            leftArray[i] = subArray[i];
        }
        for (int i = 0; i< rightArray.length; i++){
            rightArray[i] = subArray[midpoint+i];
        }
        leftArray = devide(leftArray);
        rightArray = devide(rightArray);
        int[] resultArray = mergeArray(leftArray, rightArray);
        return resultArray;
    }

    private int[] mergeArray(int[] leftArray, int[] rightArray){
        int[] resultArray = new int[leftArray.length + rightArray.length];
        int leftPointer=0, rightPointer = 0, resultPointer = 0;
        while (leftPointer < leftArray.length || rightPointer < rightArray.length){
            if(leftPointer < leftArray.length && rightPointer < rightArray.length){
                if(leftArray[leftPointer] < rightArray[rightPointer]){
                    resultArray[resultPointer ++ ] = leftArray[leftPointer ++ ];
                }else {
                    resultArray[resultPointer ++ ] = rightArray [rightPointer ++];
                }
            }else if(leftPointer < leftArray.length){
                resultArray[resultPointer ++ ] = leftArray[leftPointer ++ ];
            }else if (rightPointer < rightArray.length){
                resultArray[resultPointer ++ ] = rightArray [rightPointer ++];
            }
        }
        return  resultArray;
    }
}
