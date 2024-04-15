package com.HeapImplementation;

import java.util.Arrays;

public class Main extends Heap {
    public static void main (String [] args){
        int[] myArray = {4,3,6,1,9,5,57,2,66};
      //  sortInDescendingOrder(myArray);
      //  sortInAscendingOrder(myArray);
        MaxiHeap.heapify(myArray);
        System.out.println(MaxiHeap.getTheKthLargestValue(myArray, 1));
    }
}
