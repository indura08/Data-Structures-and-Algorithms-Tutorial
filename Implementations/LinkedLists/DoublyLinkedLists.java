package Implementations.LinkedLists;

public class DoublyLinkedLists {

    DoublyNode head;

    public void add(int data){
        if(head == null){
            System.out.println("List is currently empty");
        }
        DoublyNode newNode = new DoublyNode(data);
        if(head == null){
            head = newNode;
        }
        else {
            DoublyNode current = head;

            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void ForwardPrint(){
        DoublyNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " <-> ");
            currentNode = currentNode.next;
        }
    }

    public void backwardPrint(){
        if(head == null){
            System.out.println("List is currently empty");
        }

        DoublyNode currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        while(currentNode.prev !=null){
            System.out.print(currentNode.data + " <-> " );
            currentNode = currentNode.prev;
        }
        System.out.print(currentNode.data);
    }

    public void insertAtFirst(int data){
        DoublyNode newNode = new DoublyNode(data);

        if(head == null){
            head = newNode;
        }

        DoublyNode temp = head;
        head = newNode;
        newNode.next = temp;
        temp.prev = newNode;

//        newNode.next = head;
//        head.prev = newNode;
//        head = newNode;               //mehemath puluwan
    }

    public void insertWithIndex(int data, int index){
        DoublyNode newNode = new DoublyNode(data);
        DoublyNode currentNode = head;

        if(index == 0){
            this.insertAtFirst(data);
        }
        
//        if(head == null){
//            System.out.println("List is empty");
//        }

        for(int i = 1; i <= index; i++){
            currentNode = currentNode.next;
        }

        if(currentNode == null){
            System.out.println("Input out of bound");
        }


        currentNode.prev.next = newNode;
        currentNode.prev = newNode;


    }
}
