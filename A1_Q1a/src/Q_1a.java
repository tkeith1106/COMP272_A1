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
    - add(x):
    - deleteMin()
    - size()
 */

public class Q_1a {
    public static void main(String[] args) {
        Queue tq = new Queue(2);
        tq.push(1);
        tq.push(2);
        tq.push(3);
        tq.push(4);
        tq.push(5);
        tq.push(6);
        tq.push(7);
        tq.push(8);
        tq.push(9);

        tq.pop();
        tq.pop();
        tq.pop();
        tq.pop();
        tq.pop();
        tq.pop();
        tq.pop();
        tq.pop();

        System.out.println("Here");
    }
}