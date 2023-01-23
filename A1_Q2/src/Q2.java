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

        // call SLL demo
//        SLLDemo();
        // call DLL demo
        DLLDemo();

    }

    public static void SLLDemo() {
        // init queue object
        SLLQueue testQ = new SLLQueue();

        System.out.println("Creating test queue with 8 node of data.\n");

        // add static values to queue
        testQ.enqueue(1);
        testQ.enqueue(2);
        testQ.enqueue(3);
        testQ.enqueue(4);
        testQ.enqueue(5);
        testQ.enqueue(6);
        testQ.enqueue(7);
        testQ.enqueue(8);

        System.out.println("Swapping values in queue...\n");

        // swap and print static values in queue
        System.out.print("Initial Queue:  ");
        testQ.printQueue();
        System.out.print("Swapping 4 & 8: ");
        testQ.swap(4, 8);
        testQ.printQueue();
        System.out.print("Swapping 1 & 6: ");
        testQ.swap(1, 6);
        testQ.printQueue();
        System.out.print("Swapping 5 & 2: ");
        testQ.swap(5, 2);
        testQ.printQueue();
    }

    public static void DLLDemo() {

        DLLQueue testQ = new DLLQueue();
        testQ.add(5);
        testQ.add(10);
        testQ.add(20);
        testQ.add(30);
        testQ.add(50);

        testQ.printQueue();

        testQ.swap(3);
        testQ.printQueue();
        testQ.swap(2);
        testQ.printQueue();
        testQ.swap(1);
        testQ.printQueue();
        testQ.swap(3);


        testQ.printQueue();

        testQ.printQueue();


    }
}