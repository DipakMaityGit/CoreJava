package com.dipak.test.array;

public class ArrayCopy {
    public void arrayCloning(){
        //When you clone a single dimensional array, such as Object[], a “deep copy” is performed with the new array containing copies of the original array’s elements as opposed to references.
        int intArray[] = {1,2,3};
        int cloneArray[] = intArray.clone();
        System.out.println(intArray == cloneArray);

        //A clone of a multidimensional array (like Object[][]) is a “shallow copy” however, which is to say that it creates only a single new array with each element array a reference to an original element array but subarrays are shared.
        int intArray1[][] = {{1,2,3},{4,5}};
        int cloneArray1[][] = intArray1.clone();
        System.out.println(intArray1 == cloneArray1);
        System.out.println(intArray1[0] == cloneArray1[0]);
        System.out.println(intArray1[1] == cloneArray1[1]);
    }
}
