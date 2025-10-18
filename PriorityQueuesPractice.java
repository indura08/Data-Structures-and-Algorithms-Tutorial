import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuesPractice {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<Integer>(Collections.reverseOrder());

        queue1.offer(90);
        queue1.offer(80);
        queue1.offer(45);
        queue1.offer(112);
        queue1.offer(23);

        System.out.println(queue1);
    }
}
