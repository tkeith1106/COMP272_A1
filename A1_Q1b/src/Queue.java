public class Queue {
    // init variables
    Node head, tail;
    int size = 0;

    // default constructor
    public Queue() {
        this.head = this.tail = null;
    }

    // this add method adds the new method into the queue and is a O(1) for time complexity
    public void enqueue(int data) {

        // init the node
        Node temp = new Node(data);

        // set tail and head to new node if tail is null
        if (this.tail == null) {
            this.head = this.tail = temp;
        }
        // else move the pointer around for new node
        else {
            this.tail.next = temp;
            this.tail = temp;
        }
        // increment the size of the queue
        this.size++;

    }

    public int dequeue() {
        //check to make sure there isn't any empty queue
        if (this.head == null) {
            throw new IllegalStateException("Queue is already empty");
        }
        // store data to return removed nodes data
        int x = this.head.data;
        // move pointer to next node keeping fifo
        this.head = this.head.next;
        this.size--;
        if (this.head == null) {
            this.tail = null;
        }
        return x;
    }

    // O(1) notation
    public int size() {
        return this.size;
    }

}
