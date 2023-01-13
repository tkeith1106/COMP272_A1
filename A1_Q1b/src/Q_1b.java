/*
Name        : Q_1b
Author      : Ty Keith | 3270281
Version     : 1.0
Created     : 2023-01-12
Description : Implement the stack methods push(x) and pop() using two queues (5 marks for each method).
              Analyze the running time of the push(x) and pop() operations based on this implementation (5 marks).

Underlying assumptions for implementation of assignment question:
    - Will only be implementing the methods asked for above as it is assumed any other methods are known via reading
    text and watching YouTube lectures and do not need to be shown, unless necessary to properly implement things.
    - any classes needed for the implementation will be in a class file with its corresponding name; ex. Node.java
    for node class

Analyze the running time of the add(x) and deleteMin() operations based on this implementation:
    Example Run Results
    -------------------------------------------------------------------------------------------------------------------
    Test Case (Stack size of 10):
        push(x) method took 0 milliseconds to add 10 node(s) to your queue
        pop() method took 0 milliseconds to delete 10 node(s) from your queue

    Would you like to run the program again? (Yes or No): no

    Program Complete!
    Process finished with exit code 0
    -------------------------------------------------------------------------------------------------------------------

    - To analyze the run times of my push(x) and pop() methods I created a addAmount variable that holds an integer
    of my/user's choosing and times the runtime of the addition of that many random numbers into nodes in my queue as
    well as separately times just the removal of the same amount of nodes from my queue.

    - At larger scales the addition of nodes to the stacks is insignificant but the pop() of those same nodes take up a
    significant amount of computing power comparatively. Implementing a queue like this is definitely not ideal since i
    was using a FIFO style queue to pop a stack that is a LIFO style. I think what this question aims to prove is that
    you can get creative with your data structures and algorithms (anything is possible)

*/

import java.util.Scanner;

public class Q_1b {
    public static void main(String[] args) {

        // init program variables
        Scanner input = new Scanner(System.in);
        int addAmount = 10;
        int redo = 1;
        String userStrInput;


        // do-while loop to allow user to play around with node counts
        do {
            // test the push(x) method by adding nodes and timing them from start to finish
            Stack testStack = new Stack();
            long startTime = System.nanoTime();
            for (int i=0; i<addAmount; i++) {
                testStack.push((int) (Math.random()*100));
            }
            long stopTime = System.nanoTime();
            long totalTime = stopTime - startTime;
            System.out.printf("Test Case (Stack size of %d):", addAmount);
            System.out.printf("\n\tpush(x) method took %d milliseconds to add %d node(s) to your queue ",
                    (totalTime/1000000),
                    addAmount);

            // tests the pop() method by timing the removal of the last node to be added
            startTime = System.nanoTime();
            for (int i=0; i<addAmount; i++) {
                testStack.pop();
            }
            stopTime = System.nanoTime();
            totalTime = stopTime - startTime;
            System.out.printf("\n\tpop() method took %d milliseconds to delete %d node(s) from your queue ",
                    (totalTime/1000000),
                    addAmount);


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