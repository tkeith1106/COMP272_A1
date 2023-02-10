/*
Name        : Q_4
Author      : Ty Keith | 3270281
Version     : 1.0
Created     : 2023-02-09
Description : Write a method, reverse(), that reverses the order of elements in a DLList.

Underlying assumptions for implementation of assignment question:
    - Will only be implementing the methods asked for above as it is assumed any other methods are known via reading
    text and watching YouTube lectures and do not need to be shown, unless necessary to properly implement things.
    - any classes needed for the implementation will be in a class file with its corresponding name; ex. Node.java
    for node class

*/

public class Q4 {
    public static void main(String[] args) {

        // init queue object
        DLLQueue testQ = new DLLQueue();

        System.out.println("DLL Demo:");
        System.out.println("Creating test queue with 8 nodes of data.");

        testQ.add(5);
        testQ.add(10);
        testQ.add(15);
        testQ.add(20);
        testQ.add(25);
        testQ.add(30);
        testQ.add(35);
        testQ.add(40);

        System.out.print("Current Queue State:................. ");
        testQ.printQueue();

        testQ.reverse();
        System.out.print("Queue State After Reverse:........... ");
        testQ.printQueue();
    }
}