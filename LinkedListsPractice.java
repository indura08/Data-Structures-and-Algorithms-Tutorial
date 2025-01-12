import java.util.*;
public class LinkedListsPractice {

    public static void main(String[] args) {

        LinkedList<String> clubs = new LinkedList<String>();

        // stack ekak widiyt linkedlist eka ynwa
        clubs.push("marseille");
        clubs.push("arsenal");
        clubs.push("manchester united");
        clubs.push("celtic");

        // queue ekak widiyat linked list eka ynwa
        /*clubs.offer("marseille");
        clubs.offer("arsenal");
        clubs.offer("manchester united");
        clubs.offer("celtic");*/

        //clubs.poll();
        //clubs.pop();

        String name = clubs.get(0);
        System.out.println(name);

        System.out.println(clubs);


    }
}
