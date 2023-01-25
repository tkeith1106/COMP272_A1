import java.util.Random;

public class RandomQueue {
    // init variables
    private Integer[] array;
    private int size;

    public RandomQueue(int capacity) {
        this.array = (Integer[]) new Integer[capacity];
        this.size = 0;
    }

    // O(1) notation
    public int size() {
        return this.size;
    }

    //O(1) time complexity
    public void add(Integer item) {
        if (this.size == array.length) throw new IllegalStateException("Queue is full");
        this.array[this.size] = item;
        size++;
    }

    //O(1) time complexity
    public Integer remove() {
        if (this.size == 0) throw new IllegalArgumentException("Queue is empty");
        int randomIndex = (int) (Math.random() * size);
        Integer removedItem = array[randomIndex];
        array[randomIndex] = array[size-1];
        array[size-1] = null;
        size--;
        return removedItem;
    }

}
