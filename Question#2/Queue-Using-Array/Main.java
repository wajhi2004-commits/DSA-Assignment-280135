
public class Main {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        // This enqueue causes resizing
        q.enqueue(40);

        q.display();
        q.peek();
        q.findMinMax();
    }
}