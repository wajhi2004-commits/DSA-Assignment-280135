class QueueUsingLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node first, last;

    // Enqueue (Insert at last)
    void enqueue(int value) {
        Node newNode = new Node(value);

        if (last == null) {
            first = last = newNode;
            return;
        }

        last.next = newNode;
        last = newNode;
    }

    // Dequeue (Remove from first)
    void dequeue() {
        if (first == null) {
            System.out.println("Queue is empty");
            return;
        }

        first = first.next;

        if (first == null) {
            last = null;
        }
    }

    // Peek
    void peek() {
        if (first == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("first element: " + first.data);
        }
    }

    // Find Min and Max
    void findMinMax() {
        if (first == null) {
            System.out.println("Queue is empty");
            return;
        }

        int min = first.data;
        int max = first.data;

        Node temp = first;
        while (temp != null) {
            min = Math.min(min, temp.data);
            max = Math.max(max, temp.data);
            temp = temp.next;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }


    void display() {
        Node temp = first;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();
        q.peek();
        q.findMinMax();

        q.dequeue();
        q.display();
    }
}
