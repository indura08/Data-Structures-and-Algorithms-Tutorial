package Implementations.StackImplementation;

import java.util.Stack;

public class StackBuildInClass {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);

//        System.out.println(stack);
//
//        System.out.println(stack.get(1));

        stack.trimToSize();
        System.out.println(stack);

        int popededItem = stack.pop();
        System.out.println(popededItem);

        System.out.println(stack);

        System.out.println(stack.peek());

    }

}
