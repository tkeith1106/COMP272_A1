public class DLLNode {
    // init variables for dll node class
    int data;
    DLLNode next, prev;

    // create a constructor of the dll node class
    public DLLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
