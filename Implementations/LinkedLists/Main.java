package Implementations.LinkedLists;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedLists linkedList = new DoublyLinkedLists();

        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(15);
        linkedList.add(16);
        linkedList.add(18);

        linkedList.insertAtFirst(11);
        linkedList.insertWithIndex(17, 6);

        linkedList.backwardPrint();
        System.out.println();
        linkedList.ForwardPrint();
    }
}
