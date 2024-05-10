# HEAPS
A Heap is a data structure used to store data, that emulates a Tree. 
A heap is essentially a tree that is complete, i.e all nodes are filled from left to right and satisifes 
 the heap property i.e for every node, it's child is either less than or equal to its value. 

A heap can also be defined as a Tree-based data structure in which all the nodes of the tree are in a specific order. 

This implementation involves the use of an index array, such that the Root Node has the index of 0. The Left Node has an index of 1 and the Right Node, 2. 
The formula for this is  in the leftNodeIndex() and rightNodeIndex() methods, where index is the the index of the parent/root Node. 

The insert(int value ) method first checks if the array is full (if full an exception is thrown), if not the value will be added and the array size is increased by 1. 

Afterwards we check if the root node  is less than the child node, if so, we bring the bigger value(the child node) up, this process is implemented in this codebase by the bubbleUp() method 

The remove() method removes the first item (largest array value in the case of a max heap tree) in the tree . It doesn’t actually remove the item from the heap like you remove an apple from a tree, we simply reduce the number of the apples in the tree, in this case, we reduce the array size after setting the first item to the last item. 
After which we swap() the items so that we have a heap that is in correct order (larger value as the root node). 

This method also implements a Sorting paradigm,  sortInDescendingOrder() that sorts and prints the values in an array in a descending order, and also 
 sortInAscendingOrder that sorts and prints the values in an array in an ascending order.

Application of Heap Data Structure 
1. Heaps are commonly used to implement priority queues, where elements are retrieved based on their priority (maximum or minimum value).
2. Heapsort is a sorting algorithm that uses a heap to sort an array in ascending or descending order.
3.Heaps are used in graph algorithms like Dijkstra’s algorithm and Prim’s algorithm for finding the shortest paths and minimum spanning trees.
