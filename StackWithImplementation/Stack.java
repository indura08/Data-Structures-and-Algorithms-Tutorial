package StackWithImplementation;

public class Stack {
    int stack[] = new int[4];
    int top = 0;
    public void push(int data){
        try{
            stack[top] = data;
            top++;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("check the stack size again , you only can add " + stack.length + " items" );
        }

        /*if(top == 5){
            System.out.println("stack is full bitch");
        }

        else {
            stack[top] = data;
            top++;
        }*/

    }

    public int pop(){
        int data = 0;
        if(isempty()){
            System.out.println("your stack is empty");
        }
        else {
            top--;
            data = stack[top];
            stack[top] = 0;

        }
        return data;

    }

    public int peek(){
        int data;
        //top--; -- meka daala th puluwan meka mata hihuna ekak. -- meka dammama habi wenne size method ekedi size eka ekak aduwen pennanne
        data = stack[top-1];
        return data;
    }

    public int size(){
        return top;
    }

    public boolean isempty(){
        return top <= 0;
    }

    public void show(){
        for(int n : stack){
            System.out.print(n + " ");
        }
    }
}
