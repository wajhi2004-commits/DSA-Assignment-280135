//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();


        dll.insertAtBeginning(10);      
        dll.insertAtBeginning(20);

       
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);        //Complexity = O(1)
        dll.insertAtEnd(5);
        dll.insertAtEnd(50);

        dll.displayForward();    
        dll.displayBackward();

        dll.deleteFirst();    //Complexity =  O(1)
        dll.deleteLast();

        dll.deleteByValue(20);        //Complexity = O(n)
        dll.deleteBeforeValue(30);    //Complexity= O(n)
        dll.deleteAfterValue(20);

        dll.displayForward();
        dll.findMinMax();    // Complexity= O(n)
    }
}
