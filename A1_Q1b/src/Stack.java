import java.util.NoSuchElementException;

public class Stack {
    // init private variables
    private Queue q1;
    private Queue q2;

    // default stack constructor
    public Stack() {
        this.q1 = new Queue();
        this.q2 = new Queue();
    }

    // push method is O(1)
    public void push(int data) {
        q1.enqueue(data);
    }

    // pop method is O(n)
    public int pop() {
        // makes sure stack isn't empty, if it is return -1
        if (q1.size() == 0) return -9999;
        // while stack size is greater than 1
        while (q1.size() > 1) {
            // move q1 which is fifo into queue 2
            q2.enqueue(q1.dequeue());
        }
        // take the last(bottom) item from q1 and remove it
        int x = q1.dequeue();
        // swap remaining items from q2 back into q1
        Queue tempQ = q1;
        q1 = q2;
        q2 = tempQ;
        return x;
    }
}
