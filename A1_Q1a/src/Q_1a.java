/*
Name        : Q_1a
Author      : Ty Keith | 3270281
Version     : 1.0
Created     : 2023-01-08
Description : Describe the meaning of the essential methods add(x), deleteMin(), and size() that are supported by the
              priority queue interface (5 marks). Implement those methods using a singly-linked list (5 marks for each method).
              Analyze the running time of the add(x) and deleteMin() operations based on this implementation (5 marks)
*/

/*
Description of essential methods:
    - add(x): adds a node to the tail of the queue
    - deleteMin(): gets rid of the node with the lowest priority (min value) in the queue
    - size(): returns a value that represents the count/sum of nodes in the queue

Underlying assumptions for implementation of assignment question:
    - Will only be implementing the methods asked for above as it is assumed any other methods are known via reading
    text and watching YouTube lectures and do not need to be shown, unless necessary to properly implement things.
    - any classes needed for the implementation will be in a class file with its corresponding name; ex. Node.java
    for node class
 */

/*
Analyze the running time of the add(x) and deleteMin() operations based on this implementation:
    -> Example run results (addAmount = 10;):
    -------------------------------------------------------------------------------------------------------------------
        Test Case (Queue size of 10):
            add(x) method took 0 milliseconds to add 10 node(s) to your queue and its size is now: 10
            deleteMin() method took 0 milliseconds to delete 10 node(s) from your queue and its size is now: 0

        Would you like to run the program again? (Yes or No): yes

        Enter the amount of random integers you would like to try testing with (Integer): 10000

        Test Case (Queue size of 10000):
            add(x) method took 2 milliseconds to add 10000 node(s) to your queue and its size is now: 10000
            deleteMin() method took 166 milliseconds to delete 10000 node(s) from your queue and its size is now: 0

Would you like to run the program again? (Yes or No): no

Program Complete!
Process finished with exit code 0
    -------------------------------------------------------------------------------------------------------------------

    - To analyze the run times of my add(x) and deleteMin() methods I created a addAmount variable that holds an integer
    of my/user's choosing and times the runtime of the addition of that many random numbers into nodes in my queue as
    well as separately times just the removal of the same amount of nodes from my queue.

    - From what I can tell the addition of nodes is way more costly at smaller scales than the removal of the minimum
    nodes. Even thought the big O notation of deleteMin() is higher. But at larger scales you can really tell the O(n)
    notation of the deleteMin() eats up a lot more time than the add method does which is an O(1) notation.
*/

import java.lang.Math;
import java.util.Scanner;


public class Q_1a {
    public static void main(String[] args) {

        // init program variables
        Scanner input = new Scanner(System.in);
        int addAmount = 10;
        int redo = 1;
        String userStrInput;


        // do-while loop to allow user to play around with node counts
        do {
            // test the add method() by adding nodes and timing them from start to finish
            Queue testQ = new Queue();
            long startTime = System.nanoTime();
            for (int i=0; i<addAmount; i++) {
                testQ.add((int) (Math.random()*100));
            }
            long stopTime = System.nanoTime();
            long totalTime = stopTime - startTime;
            System.out.printf("Test Case (Queue size of %d):", addAmount);
            System.out.printf("\n\tadd(x) method took %d milliseconds to add %d node(s) to your queue " +
                            "and its size is now: %d",
                    (totalTime/1000000),
                    addAmount,
                    testQ.size());

            // tests the deleteMin() method by timing the removal of each smallest number from start to finish
            startTime = System.nanoTime();
            for (int i=0; i<addAmount; i++) {
                testQ.deleteMin();
            }
            stopTime = System.nanoTime();
            totalTime = stopTime - startTime;
            System.out.printf("\n\tdeleteMin() method took %d milliseconds to delete %d node(s) from your queue " +
                            "and its size is now: %d",
                    (totalTime/1000000),
                    addAmount,
                    testQ.size());


            // see if user would like to try more or less node count
            userStrInput = tryAgain(input);
            if (userStrInput.equalsIgnoreCase("no")) redo = 0;
            else {
                addAmount = chooseInt(input);
            }
        } while (redo == 1);

        System.out.print("\nProgram Complete!");


    }

    private static String tryAgain(Scanner input) {
        String userStrInput;
        do {
            System.out.print("\n\nWould you like to run the program again? (Yes or No): ");
            userStrInput = input.nextLine();
        } while (!userStrInput.equalsIgnoreCase("yes") && !userStrInput.equalsIgnoreCase("no"));
        return userStrInput;
    }

    private static int chooseInt(Scanner input) {
        int userIntInput = 0;
        String userStrInput;
        int intError;
        do {
            System.out.print("\nEnter the amount of random integers you would like to try testing with (Integer): ");
            userStrInput = input.nextLine();
            try {
                userIntInput = Integer.parseInt(userStrInput);
                System.out.println();
                intError = 0;
            } catch (NumberFormatException e) {
                System.out.print("\nYou did not enter an integer, Hit Enter to try Again.");
                userStrInput = input.nextLine();
                intError = 1;
            }
        } while (intError == 1);
        return userIntInput;

    }
}