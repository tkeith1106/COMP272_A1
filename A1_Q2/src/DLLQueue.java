public class DLLQueue {
    // init variables
    DLLNode head, tail;
    int size = 0;

    public DLLQueue() {
        this.head = this.tail = null;
    }


    public DLLNode add(int data) {
        DLLNode newNode = new DLLNode(data);
        if (this.head==null) {
            this.head = this.tail = newNode;
            this.head.prev = null;
        }
        else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
            tail.next = null;
        }
        this.size++;
        return newNode;
    }

    public int remove(int index) {
        DLLNode removeNode = getNode(index);
        int removedData = removeNode.data;
        if (removeNode.next != null) {
            removeNode.next.prev = removeNode.prev;
        }
        else {
            this.tail = this.tail.prev;
        }
        if (removeNode.prev != null) {
            removeNode.prev.next = removeNode.next;
        }
        else {
            this.head = this.head.next;
        }
        this.size--;
        return removedData;
    }

    public void swap(int index) {

        // init current variable
        DLLNode current;

        // check if index swap will work
        if (index < 0 || index >= this.size - 1) {
            throw new IllegalArgumentException("Invalid index for swapping nodes");
        }

        // get current node by using is head or tail of linked list
        if (index < (this.size/2)) {
            current = this.head;
            for (int j = 0; j < index; j++) {
                current = current.next;
            }
        }
        else {
            current = this.tail;
            for (int j=this.size-1; j>index; j--) {
                current = current.prev;
            }

        }

        // set up nodes and swap around the links
        DLLNode next = current.next;
        DLLNode prev = current.prev;
        DLLNode nextNext = next.next;
        DLLNode nextPrev = next.prev;
        current.next = nextNext;
        current.prev = next;
        next.next = current;
        next.prev = prev;

        // make sure there are no nulls
        if (prev != null) {
            prev.next = next;
        }
        if (nextNext != null) {
            nextNext.prev = current;
        }

        // based off index set head if applicable
        if (index == 0) {
            this.head = next;
        }
        // based off index set tail if applicable
        if (index == this.size - 2) {
            this.tail = current;
        }
    }

    // set node a specific index
    public int set(int data, int index) {
        if (index < 0 || index > (this.size-1)) throw new IndexOutOfBoundsException();
        DLLNode temp = getNode(index);
        int x = temp.data;
        temp.data = data;
        return x;
    }

    // get node at index position
    public DLLNode get(int index) {
        if (index < 0 || index > (this.size-1)) throw new IndexOutOfBoundsException();
        return getNode(index);
    }

    // loop list to specific find node prev and next
    private DLLNode getNode(int index) {
        DLLNode temp;
        if (index < (this.size / 2)) {
            temp = this.head;
            for (int j=0; j<index; j++) { temp=temp.next;}
        }
        else {
            temp = this.tail;
            for (int j=this.size-1; j>index; j--) { temp=temp.prev;}
        }
        return temp;
    }

    public void printQueue() {
        // set current node to head
        DLLNode current = head;
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
