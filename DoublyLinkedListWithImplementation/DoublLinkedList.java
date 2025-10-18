package DoublyLinkedListWithImplementation;

public class DoublLinkedList {

    NodeDLL head;
    NodeDLL tail;

    public void displayForward(){
        if(head == null){
            return;
        }
        NodeDLL n = head;
        while(n.next!=null){
            System.out.print(n.data + " -->");
            n = n.next;
        }
        System.out.print(n.data);
    }
    public void displayBackward(){
        if(tail == null){
            return;
        }
        NodeDLL n = tail;
        while(n.prev!=null){
            System.out.print(n.data+ " --> ");
            n = n.prev;
        }
        System.out.print(n.data);
    }

    public void insertAtBeginning(int data){

        NodeDLL node= new NodeDLL();
        node.data = data;
        if(head == null && tail == null){
            tail = node;
        }
        else{
            head.prev = node;
        }
        node.next = head;
        head = node; // me kalla if eke ghnnath puluwan


    }

    public void insertAtEnd(int data){
        NodeDLL node  = new NodeDLL();
        node.data = data;

        if(head == null && tail == null){
            head = node;
        }
        else {
            tail.next = node;
        }
        node.prev = tail;
        tail = node; //meka if eke ghnnath puluwan
    }

    public void inserAt(){
        //meka thama insert between two nodes kiyla thiynne
    }
    public void deleteAt(){}

    public void insertBetweenTwoNodes(int key, int  data){
        NodeDLL node = new NodeDLL();
        node.data = data;

        NodeDLL n = head;
        try{
            if (key == 0){
                insertAtBeginning(data);
            }
            else{
                for(int i = 0; i < key-1; i++){
                    n = n.next;
                }
                node.next = n.next;
                n.next = node;
                node.prev = n;
                if(node.next != null){
                    node.next.prev = node;
                }
            }
        }
        catch(NullPointerException e){
            System.out.println("provided index is out of range of the length of the linked list");
        }

    }


}
