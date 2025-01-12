package QueueWithImplementation;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(6);
        q.enqueue(2);
        q.enqueue(7);
        q.enqueue(5);
        q.show();
        q.dequeue();
        q.enqueue(4);
        q.enqueue(9);
        q.show();

        System.out.println("empty? " + q.isEmpty());
        System.out.println("full? " + q.isFull());

    }
}
