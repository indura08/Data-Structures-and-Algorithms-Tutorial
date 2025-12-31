class ListNode {
    value: number;
    next:ListNode | null
    
    constructor(value:number, next:ListNode|null){
        this.value = value;
        this.next = next;
    }
    
}

class LinkedList<T>{
    
    head: ListNode | null = null

    //insert method 
    insert(value:number):void{

        let newNode = new ListNode(value,null)
        
        if(this.head === null){
            this.head = newNode;
            return;
        }

        let current = this.head;
        while(current.next !== null){
            current = current.next;
        }

        current.next = newNode;
    }

    //show method:
    Display():void{
        if(this.head === null){
            console.log(`your linked List is currently empty`)
            return
        }

        let current = this.head;
        while(current.next !== null){
            console.log(`${current.value}`)
            current = current.next;
        }

        console.log(`${current.value}`)
    }

    //insert at first
    InsertAtFirst(value:number):void{
        let newNode = new ListNode(value, null);

        if(this.head === null){
            this.head = newNode;
            return
        }

        newNode.next = this.head;
        this.head = newNode
    }

    InsertAt(position:number , value:number):void{

        if(this.head === null){
            console.log(`your linkedlist is currenly empty so cannot add at index of : ${position}`)
            return;
        }

        if(position === 0){
            this.InsertAtFirst(value)
            return
        }

        let newNode = new ListNode(value, null)

        let current = this.head
        for(let i = 0; i < position - 1; i++){
            if(current === null){
                console.log(`your psoition number cannot be reached since the linked list i to small than that`)
                return;
            }
            current = current?.next
        }

        if(current.next === null){
            current.next = newNode;
            return
        }else{
            newNode.next = current.next
            current.next = newNode;
        }
    }

    DeleteAt(position:number):void{

        if(this.head === null){
            console.log(`cannot delete at index ${position}, because the linked list is null`)
            return
        }

        if(position === 0){
            this.head = this.head?.next!;
        }

        let currentNode = this.head
        for(let i = 0 ; i < position - 1 ; i++){
            if(currentNode === null){
                console.log(`Linked list is out of bound , cannot reach position ${position}`);
                return;
            }
            currentNode = currentNode.next!;
        }
        let temp = currentNode.next!
        currentNode.next = temp.next;
    }
}

const linkedList = new LinkedList();

linkedList.insert(10)
linkedList.insert(6)
linkedList.insert(3)
linkedList.insert(9)
linkedList.insert(4)
linkedList.Display();

//deletting one
linkedList.DeleteAt(3);
console.log(`linked list after deletion: `)
linkedList.Display();

linkedList.InsertAt(3, 18)
console.log("linked list after insertion on position 3");
linkedList.Display();