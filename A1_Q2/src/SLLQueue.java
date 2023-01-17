public class SLLQueue {
    // init variables
    Node head, tail;
    int size = 0;

    // default constructor
    public SLLQueue() {
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
        //check to make sure there isnt any empty queue
        if (this.head == null) {
            throw new IllegalStateException("Queue is empty");
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

    // help was recieved from: https://www.javatpoint.com/program-to-swap-nodes-in-a-singly-linked-list-without-swapping-data
    public void swap(int n1, int n2) {
        if (n1 == n2) throw new IllegalArgumentException("Cannot Swap Nodes of the Same Value");

        // Search for n1 node
        Node prevN1 = null, currentN1 = head;
        while (currentN1 != null && currentN1.data != n1) {
            prevN1 = currentN1;
            currentN1 = currentN1.next;
        }

        // Search for n2 node
        Node prevN2 = null, currentN2 = head;
        while (currentN2 != null && currentN2.data != n2) {
            prevN2 = currentN2;
            currentN2 = currentN2.next;
        }

        // If either n1 or n2 does not exist then return
        if (currentN1 == null || currentN2 == null) throw new IllegalArgumentException("One input node(s) doesn't Exist");

        // check if n1 is the head of queue
        if (prevN1 != null) {
            prevN1.next = currentN2;
        } else // make y the new head
            head = currentN2;

        // If n2 is head of linked list
        if (prevN2 != null) {
            prevN2.next = currentN1;
        } else // make n1 the new head
            head = currentN1;

        // Swap other pointers
        Node temp = currentN1.next;
        currentN1.next = currentN2.next;
        currentN2.next = temp;

    }
    public void printQueue() {
        // set current node to head
        Node current = this.head;
        //print opening bracket
        System.out.print("[");
        // print values
        while (current != null) {
            System.out.print(current.data);
            // print comma if a next node exists
            if (current.next != null) System.out.print(", ");
            current = current.next;
        }
        // print closing bracket
        System.out.print("]");
        System.out.println();
    }

}
