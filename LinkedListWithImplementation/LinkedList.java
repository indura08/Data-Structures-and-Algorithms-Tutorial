package LinkedListWithImplementation;

public class LinkedList {

    Node head;

    public void insert(int data){

        Node node = new Node();
        node.data = data;

        if(head == null){
            head = node;
        }
        else {
            Node n = head;
            while(n.next!= null){
                n = n.next;
            }
            n.next = node;

        }
    }

    public void Show(){

        if(head == null){  // me cod klla enna one hea eka nullnm errors noenna
            System.out.println("head is null");
        }else {
            Node n = head; //one welwak apita traverse krnna wena one welwak menna me kalla thiynna one mokda head eke idla thami

            while (n.next != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
            System.out.println(n.data);
        }
    }

    public void insertAtFirst(int data){
        //mekethvalue eka mulin aran inna one e hinda ara kalin insertion ekekt hibba widiytm code eka reuse krnwa
        Node node = new Node();
        node.data = data;
        //node.next = null;

        node.next = head;
        head = node;
    }

    public void insertAt(int index , int data){

        Node node = new Node();
        node.data = data;
        node.next =  null;

        try{
            if(index==0){
                insertAtFirst(data);
            }
            else{
                Node n = head;
                for(int i = 0 ; i< index - 1; i++){
                    n = n.next;
                }
                node.next = n.next;
                n.next = node;
            }
        }
        catch(NullPointerException e) {
            System.out.println("you have caught a null pointer exception");
        }


    }

    public void deleteWithValue(int data){
        if(head == null){
            System.out.println("list is null");
        }
        else if(head.data == data){
            head = head.next;
        }
        else{
            Node n = head;
            Node n1 = null;
            while(n.data == data){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;

        }
    }

    public void deleteAt(int index){

        if(index == 0){
            head = head.next;

        }
        else{
            Node n = head;
            Node n1 = null;
            for(int i = 0; i<index-1; i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;

        }
    }
}
