/*
Name        : Q_3
Author      : Ty Keith | 3270281
Version     : 1.0
Created     : 2023-01-24
Description : Design and implement a RandomQueue. This is an implementation of the Queue interface in which the remove()
              operation removes an element that is chosen uniformly at random among all the elements currently in the
              queue. (Think of a RandomQueue as a bag in which we can add elements or reach in and blindly remove some
              random element.) The add(x) and remove() operations in a RandomQueue should run in constant time per
              operation.

Underlying assumptions for implementation of assignment question:
    - Will only be implementing the methods asked for above as it is assumed any other methods are known via reading
    text and watching YouTube lectures and do not need to be shown, unless necessary to properly implement things.
    - any classes needed for the implementation will be in a class file with its corresponding name; ex. Node.java
    for node class

*/

public class Q3 {
    public static void main(String[] args) {

        RandomQueue randoQ = new RandomQueue(10);

        randoQ.add(1);
        randoQ.add(2);
        randoQ.add(3);
        randoQ.add(4);
        randoQ.add(5);
        randoQ.add(6);
        randoQ.add(7);
        randoQ.add(8);
        randoQ.add(9);
        randoQ.add(10);
        System.out.println("Added Numbers 1 thorugh 10 into the Queue");

        int remove1 = randoQ.remove();
        int remove2 = randoQ.remove();
        int remove3 = randoQ.remove();
        int remove4 = randoQ.remove();
        int remove5 = randoQ.remove();
        int remove6 = randoQ.remove();

        System.out.printf(
                "Randomly Removed %d, %d, %d, %d, %d, %d From the Queue ",
                remove1, remove2, remove3, remove4, remove5, remove6
        );

    }
}