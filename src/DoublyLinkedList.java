class DoublyLinkedList {

    // Node class
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }

    Node head, tail;

    // 1️⃣ Insert at Beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // 2️⃣ Insert at End
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // 3️⃣ Display Forward
    void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // 3️⃣ Display Backward
    void displayBackward() {
        Node temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // 4️⃣ Delete First Node
    void deleteFirst() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // 4️⃣ Delete Last Node
    void deleteLast() {
        if (tail == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // 5️⃣ Delete Node by Value
    void deleteByValue(int value) {
        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp == head) deleteFirst();
        else if (temp == tail) deleteLast();
        else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    // 6️⃣ Delete Before Given Value
    void deleteBeforeValue(int value) {
        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null || temp.prev == null) return;

        Node toDelete = temp.prev;

        if (toDelete == head) {
            deleteFirst();
        } else {
            toDelete.prev.next = temp;
            temp.prev = toDelete.prev;
        }
    }

    // 7️⃣ Delete After Given Value
    void deleteAfterValue(int value) {
        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) return;

        Node toDelete = temp.next;

        if (toDelete == tail) {
            deleteLast();
        } else {
            temp.next = toDelete.next;
            toDelete.next.prev = temp;
        }
    }


    void findMinMax() {
        if (head == null) return;

        int min = head.data;
        int max = head.data;

        Node temp = head;
        while (temp != null) {
            min = Math.min(min, temp.data);
            max = Math.max(max, temp.data);
            temp = temp.next;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }


}
