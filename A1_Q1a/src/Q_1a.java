/*
Name        : Q_1a
Author      : Ty Keith | 3270281
Version     : 1.0
Created     : 2023-01-08
Description : Describe the meaning of the essential methods add(x), deleteMin(), and size() that are supported by the
              priority queue interface (5 marks). Implement those methods using a singly-linked list (5 marks for each method).
              Analyze the running time of the add(x) and deletMin() operations based on this implementation (5 marks)
*/

/*
Description of essential methods:
    - add(x): adds a node to the tail of the queue
    - deleteMin(): gets rid of the node with the lowest priority in the queue
    - size(): returns a value that represents the count/sum of nodes in the queue

Underlying assumptions for implementation of assignment question:
    - Will only be implementing the methods asked for above as it is assumed any other methods are known via reading
    text and watching youtube lectures and do not need to be shown, unless necessary to properly implement things.
    - any classes needed for the implementation will be in a class file with its corresponding name; ex. Node.java
    for node class
 */

public class Q_1a {
    public static void main(String[] args) {

        // test the add method() by adding 5 nodes
        Queue testQ = new Queue();
        long startTime = System.nanoTime();
        testQ.add(4);
        testQ.add(5);
        testQ.add(6);
        testQ.add(1);
        testQ.add(10);
        long stopTime = System.nanoTime();
        long totalTime = stopTime - startTime;
        int removed_value = testQ.deleteMin();
        System.out.printf("Your Addtions Took %d ns and your Queue size is %d", totalTime, testQ.size());
        System.out.println();
        System.out.println();

        // test the deleteMin() method by removeing 5 nodes
        testQ = new Queue();

        testQ.add(30);
        testQ.add(25);
        testQ.add(20);
        testQ.add(15);
        testQ.add(10);
        testQ.add(5);

        startTime = System.nanoTime();
        int removedItem1 = testQ.deleteMin();
        int removedItem2 = testQ.deleteMin();
        int removedItem3 = testQ.deleteMin();
        int removedItem4 = testQ.deleteMin();
        int removedItem5 = testQ.deleteMin();
        stopTime = System.nanoTime();
        totalTime = stopTime - startTime;
        System.out.printf("Your deleteMins Took %d ns and your Queue size is now %d", totalTime, testQ.size());
        System.out.printf("You Removed %d, %d, %d, %d, %d",
                removedItem1, removedItem2, removedItem3, removedItem4, removedItem5);
        System.out.println();
        System.out.println();

    }
}