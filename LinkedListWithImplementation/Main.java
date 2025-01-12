package LinkedListWithImplementation;

public class Main {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.insert(2);
        ll.insert(8);
        ll.insert(9);
        ll.insert(6);
        ll.insert(4);

        ll.deleteWithValue(8);

        ll.Show();



    }
}
