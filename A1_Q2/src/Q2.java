/*
Name        : Q_2
Author      : Ty Keith | 3270281
Version     : 1.0
Created     : 2023-01-15
Description : Swap two adjacent elements in a list by adjusting only the links (and not the data) using:
                a.	singly-linked list (10 marks)
                b.	doubly-linked list (10 marks)

Underlying assumptions for implementation of assignment question:
    - Will only be implementing the methods asked for above as it is assumed any other methods are known via reading
    text and watching YouTube lectures and do not need to be shown, unless necessary to properly implement things.
    - any classes needed for the implementation will be in a class file with its corresponding name; ex. Node.java
    for node class

*/

public class Q2 {
    public static void main(String[] args) {

        // call SLL demo Q2a
        SLLDemo();
        // call DLL demo Q2b
        DLLDemo();

    }

    public static void SLLDemo() {
        // init queue object
        SLLQueue testQ = new SLLQueue();

        System.out.println("SLL Demo:");
        System.out.println("Creating test queue with 8 nodes of data.");

        // add static values to queue
        testQ.enqueue(1);
        testQ.enqueue(2);
        testQ.enqueue(3);
        testQ.enqueue(4);
        testQ.enqueue(5);
        testQ.enqueue(6);
        testQ.enqueue(7);
        testQ.enqueue(8);

        System.out.println("Swapping values in queue...");

        // swap and print static values in queue
        System.out.print("Initial Queue:  ");
        testQ.printQueue();
        System.out.print("Swapping 1 & 8: ");
        testQ.swap(1, 8);
        testQ.printQueue();
        System.out.print("Swapping 4 & 6: ");
        testQ.swap(4, 6);
        testQ.printQueue();
        System.out.print("Swapping 5 & 2: ");
        testQ.swap(5, 2);
        testQ.printQueue();
        System.out.println();
    }

    public static void DLLDemo() {

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

        // try & catch block
        try {
            // swap and print static values in queue
            System.out.print("Swapping Adjacent Value with index 0: ");
            testQ.swap(0);
            testQ.printQueue();
            System.out.print("Swapping Adjacent Value with index 2: ");
            testQ.swap(2);
            testQ.printQueue();
            System.out.print("Swapping Adjacent Value with index 4: ");
            testQ.swap(4);
            testQ.printQueue();
            System.out.print("Swapping Adjacent Value with index 6: ");
            testQ.swap(6);
            testQ.printQueue();
            System.out.print("Swapping Adjacent Value with index 7: ");
            testQ.swap(7);
            testQ.printQueue();
        }
        // catch bad index values
        catch (IllegalArgumentException e) {
            System.out.println("ERROR: You Have Input An Index Value That Cannot Be Swapped!");
        }
    }
}