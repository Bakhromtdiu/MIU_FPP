public class ArrayQueue {
    private int[] items = new int[10];
    private int front = -1;
    private int rear = 0;

    public ArrayQueue(int size) {
        this.items = new int[size];
    }

    public void enqueue(int item) {
        if (items.length == rear)
            throw new StackOverflowError();

        this.items[rear++] = item;
    }

    public int dequeue() {

        var item = this.items[front] = 0;
        front++;
        return item;
    }

    public void print() {
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
    }

}
