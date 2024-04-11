# Heap-Implementation-
A Heap is a data structure used to store data, that emulates a Tree. 
A heap is essentially a tree that is complete, i.e all nodes are filled from left to right.

This implementation involves the use of an index array, such that the Root Node has the index of 0. The Left Node has an index of 1 and the Right Node, 2. 
The formula for this is  in the leftNodeIndex() and rightNodeIndex() methods, where index is the the index of the parent/root Node. 

The insert(int value ) method first checks if the array is full (if full an exception is thrown), if not the value will be added and the array size is increased by 1. 

Afterwards we check if the root node  is less than the child node, if so, we bring the bigger value(the child node) up, this process is implemented in this codebase by the bubbleUp() method 

The remove() method removes the first item (largest array value in the case of a max heap tree) in the tree . It doesn’t actually remove the item from the heap like you remove an apple from a tree, we simply reduce the number of the apples in the tree, in this case, we reduce the array size after setting the first item to the last item. 
After which we swap() the items so that we have a heap that is in correct order (larger value as the root node). 
