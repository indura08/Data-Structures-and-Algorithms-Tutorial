import java.util.*;
public class stacksPractice{

    public static void main(String[] args) {
        
        Stack<String> stack1 = new Stack<String>();

        stack1.push("indura");
        stack1.push("upasith");
        stack1.push("perera");
        stack1.push("wijesinghe");

        System.out.println(stack1.indexOf("perera"));
        System.out.println(stack1.size());

//        stack1.push("Bayern Munich");
//        stack1.push("liverpool");
//
//        System.out.println(stack1.empty());
//        System.out.println(stack1.peek());
//        System.out.println(stack1.indexOf("Bayern Munich"));
//        System.out.println(stack1.search("upasith"));
//        System.out.println(stack1.size());
//
//        stack1.trimToSize();
//        System.out.println(stack1.size());
//
//        System.out.println(stack1.contains("perera"));

        //System.out.println(stack1);
        for (String data : stack1){
            System.out.println(data + " you are okay and added to the for each loop!");
        }

    }
}