//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert at beginning
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);

        // Insert at end
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.insertAtEnd(5);
        dll.insertAtEnd(50);

        dll.displayForward();
        dll.displayBackward();

        dll.deleteFirst();
        dll.deleteLast();

        dll.deleteByValue(20);
        dll.deleteBeforeValue(30);
        dll.deleteAfterValue(20);

        dll.displayForward();
        dll.findMinMax();
    }
}