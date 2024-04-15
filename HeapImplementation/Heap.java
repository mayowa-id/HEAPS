package com.HeapImplementation;

import java.util.Arrays;

public class Heap {
    private int [] items = new int[10];
    private int arraySize;

    public void insert(int value){
        //If array is full items cannot be added,so throw an exception
        if(arraySize == items.length){
            throw new IllegalStateException();
        }
        items[arraySize] = value;
        arraySize++;
        bubbleUp();
    }
//Method used to move newly added items to the approproate index position
    //the array, which means if a newly added item is greater than
    //the item in its parent node, it will be moved up the Tree
    private void bubbleUp(){
        var index = arraySize-1;
        var parentIndex = (arraySize - 2)/2;
        parentIndex = (int) Math.floor(parentIndex);
        while (index > 0
                && items[index] > items[parentIndex]){
            swap(parentIndex, index);
            index = parentIndex;
        }

    }
    //Method implementing the swap procedure in the bubble up method
    private void swap(int first, int second){
        var temp = items[first];
        items[first] = items[second];
        items[second]= temp;
    }
    //Remove method always removes the root node, which is the largest
    //value (In the case of a max heap tree)
    public int remove(){
    items[0] = items[arraySize -1];
    arraySize--;

    var index =0;
    //Condition in the while loop indicates an invalid parent node
    while(!parentNodeIsValid(index)){
        var largerChildNodeIndex = (rightNodeExists(index))
                ? ((leftNodeExists(index))
                ? Math.max(leftNodeIndex(index),
                           rightNodeIndex(index)) : index)
                : leftNodeIndex(index);

     swap(index, largerChildNodeIndex);
     index = largerChildNodeIndex;
 }
        return items[0];
}

private int leftNodeIndex(int index){
        return index*2 + 1;
}
private int rightNodeIndex(int index){
        return index*2 + 2;
    }
    private boolean leftNodeExists(int index){
        return leftNodeIndex(index) <= arraySize;
    }
    private boolean rightNodeExists(int index){
        return rightNodeIndex(index) <= arraySize;
    }
    private boolean parentNodeIsValid(int index){
        if(!leftNodeExists(index))
            return true;
        if(!rightNodeExists(index))
            return items[index] >= leftNodeIndex(index);

    return     index<= arraySize
                && items[index] >= leftNodeIndex(index)
                &&  items[index] >= rightNodeIndex(index);
    }
    //These methods are useful ways of using the Heap Structure to
    //sort an array in a Descending or Ascending order
    //Note that the Heap we are dealing with here is a max heap
    public static void sortInDescendingOrder(int[] theArray){
        var temporalHeap1 = new Heap();
     for(var number : theArray)
         temporalHeap1.insert(number);
     for(var i = 0; i< theArray.length; i++)
         System.out.println(temporalHeap1.remove());
    }
    public static void sortInAscendingOrder(int[] theArray){
        var temporalHeap2 = new Heap();
        for(var number : theArray)
            temporalHeap2.insert(number);
        for(var i = theArray.length -1; i>=0; i--)
            System.out.println(temporalHeap2.remove());
    }
public int max(){
        return  items[0];
}


}
