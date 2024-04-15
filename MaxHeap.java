package com.HeapImplementation;

public class MaxHeap {
    //The formula myArray.length/2)-1 is used to set the upper
    //bound of the for loop which is the last parent node
    //which means the heapify method will not apply to any of the
    //leaf nodes
    public static void heapify(int [] myArray){
for(var i=0; i< (myArray.length/2)-1; i++)
heapify(myArray,i);
    }
    //This is a private  recursive method that takes two parameters, the array we want
    //to transform into a heap(which is returned from the public method above) and
    //which is the index of the current item in the array we are trying to sort into the right
    //position (index).
    private static void heapify(int [] myArray, int index) {
        var largerIndex = index;

        var indexOfLeftNode = (index * 2) + 1;
        if (indexOfLeftNode < myArray.length
                && myArray[indexOfLeftNode] > myArray[largerIndex])
            largerIndex = indexOfLeftNode;

        var indexOfRightNode = (index * 2) + 2;
        if (indexOfLeftNode < myArray.length
                && myArray[indexOfRightNode] > myArray[largerIndex])
            largerIndex = indexOfRightNode;

        if (index == largerIndex)
            return;
swap(myArray, index, largerIndex);
heapify(myArray, largerIndex);
    }
    private static void swap(int[] array, int first, int second){
        var temp = array[first];
        array[first] = array[second];
        array[second]=temp;
    }
    //This method returns the Kth highest value in an array, implementing this method is
    //easy, it involves adding all the items in the array to a Max heap and then,
    //removing the items a number pf times that is equal to (K -1),at the end of this
    //iteration the Kth  largest item we are looking for will be in index 0, which is
    //basically the idea behind a max heap.
    public static int getTheKthLargestValue(int[] theArray, int K){
        var temporalHeap = new Heap();
        for (var number : theArray)
            temporalHeap.insert(number);
        for (var i = 0; i< K-1; i++)
            temporalHeap.remove();

        return temporalHeap.max();
    }
}
