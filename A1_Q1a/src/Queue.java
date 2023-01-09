public class Queue {
    private int[] array;
    private int top = -1;

    public Queue() {
        this.array = new int[10];
    }

    public Queue(int size) {
        this.array = new int[size];
    }

    public void push(int item) {
        if ((this.top+1) == this.array.length) resize();
        this.array[this.top+1] = item;
        this.top++;

    }

    public int pop() {
        if (top == -1) throw new IndexOutOfBoundsException("There are currently no items in the Queue");
        int x = this.array[0];
        for (int i = 0; i<this.top; i++) {
            this.array[i] = this.array[i+1];
        }
        this.array[this.top] = 0;
        this.top--;
        if ((this.top)<(this.array.length/3)) resize();
        return x;
    }

    private void resize() {
        if ((this.top+1) == this.array.length) {
            int[] a = this.array;
            int[] b = new int[(this.top+1) * 2];
            for (int i=0; i<a.length;i++) {
                b[i] = a[i];
            }
            this.array = b;
        } else if ((this.top)<(this.array.length/3) && this.top != -1) {
            int[] a = this.array;
            int[] b = new int[(this.top) * 2];
            for (int i=0; i<this.top+1;i++) {
                b[i] = a[i];
            }
            this.array = b;
        }
    }
}
