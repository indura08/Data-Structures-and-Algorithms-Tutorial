package QueueWithImplementation;

public class Queue {

    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enqueue(int data){
        queue[rear] = data;
        rear = (rear + 1)%5;
        size++;
    }

    public void dequeue(){

        int data = queue[front];
        front = (front+1)%5;
        size = size-1;
    }

    public int getsize(){
        return size;
    }

    public boolean isEmpty(){
        return getsize() == 0;
    }

    public boolean isFull(){
        return getsize() == 5;
    }


    public void show(){
        System.out.print("Element: ");
        for(int i = 0 ; i<size; i++){
            System.out.print(queue[(front+i)%5] + " ");
        }
        System.out.println("");
        for(int j: queue){
            System.out.print(j + " ");
        }
        System.out.println("");
    }
}
