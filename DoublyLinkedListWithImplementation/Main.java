package DoublyLinkedListWithImplementation;

public class Main {
    public static void main(String[] args) {
        DoublLinkedList list = new DoublLinkedList();

        list.insertAtEnd(12);
        list.insertAtEnd(8);
        list.insertAtEnd(55);
        list.insertBetweenTwoNodes(2,31);
        list.insertAtBeginning(18);

        list.displayForward();
        System.out.println("");
        list.displayBackward();
    }
}
