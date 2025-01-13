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

        //String name = clubs.get(0);
        //System.out.println(name);

        //System.out.println(clubs);

        //how to access previous and next elements using linkedList class?
        // we do it using a ListIterator class. how? :- The ListIterator class in Java is a special type of iterator that allows bidirectional traversal of a list (both forward and backward). It’s specifically designed for use with list-based collections like ArrayList and LinkedList.

        ListIterator<String> iterator = clubs.listIterator();

        System.out.println("Traversing forward");

//        System.out.println(iterator.hasPrevious());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());

        while(iterator.hasNext()){
            String nextElement = iterator.next();
            String previousElement = iterator.previous();
            System.out.println("Next element " + nextElement);

            if(iterator.hasPrevious()){
                System.out.println("Previous element " + previousElement);
            }
            previousElement = nextElement;
            iterator.next();
            System.out.println();

        }


    }
}
