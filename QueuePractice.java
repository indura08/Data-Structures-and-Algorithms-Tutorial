import java.util.LinkedList;
import java.util.Queue;
public class QueuePractice {
    public static void main(String[] args) {

        Queue<String> clubs = new LinkedList<String>();

        clubs.offer("marseille");
        clubs.offer("Liverpool");
        clubs.offer("Lille");
        clubs.offer("Antwerp");
        clubs.offer("club brugge");
        clubs.offer("nottingham forrest");
        clubs.offer("Sampdoria");
        clubs.offer("celtic");
        clubs.offer("bayern munich");

        //clubs.remove(); // mekata parameters dennnath puluwan
        //clubs.poll();

        System.out.println(clubs.peek());
        System.out.println(clubs.isEmpty());
        System.out.println(clubs.size());
        System.out.println(clubs.contains("marseille"));

        System.out.println(clubs);

        for(String data : clubs){
            System.out.println(data + " club has been successfully entered to a for-each loop!");
        }

    }
}
