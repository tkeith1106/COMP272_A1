public class Queue {
    // init variables
    Node head, tail;
    int size = 0;

    // default constructor
    public Queue() {
        this.head = this.tail = null;
    }

    // this add method adds the new method into the queue and is a O(1) for time complexity
    public void add(int data) {

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

    // O(1) notation
    public int size() {
        return this.size;
    }

    //time complexity of O(n)
    public int deleteMin() {

        if (this.head == null) throw new IllegalStateException("You Cannot Delete Nodes From An Empty Queue!");
        // create node variables to compare nodes to
        Node current = this.head;
        Node prevMin = null;
        Node previous = null;
        Node minNode = null;

        // set a high range value to start comparisons with
        int min = Integer.MAX_VALUE;

        while (current != null) {
            // if data is less than min variable set the min node and prev variables
            if (current.data < min) {
                min = current.data;
                minNode = current;
                prevMin = previous;
            }
            previous = current;
            current = current.next;
        }
        if (prevMin == null) {
            this.head = minNode.next;
        } else {
            prevMin.next = minNode.next;
        }
        this.size--;
        return min;
    }

}
