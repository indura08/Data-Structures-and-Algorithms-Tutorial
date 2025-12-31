var ListNode = /** @class */ (function () {
    function ListNode(value, next) {
        this.value = value;
        this.next = next;
    }
    return ListNode;
}());
var LinkedList = /** @class */ (function () {
    function LinkedList() {
        this.head = null;
    }
    //insert method 
    LinkedList.prototype.insert = function (value) {
        var newNode = new ListNode(value, null);
        if (this.head === null) {
            this.head = newNode;
            return;
        }
        var current = this.head;
        while (current.next !== null) {
            current = current.next;
        }
        current.next = newNode;
    };
    //show method:
    LinkedList.prototype.Display = function () {
        if (this.head === null) {
            console.log("your linked List is currently empty");
            return;
        }
        var current = this.head;
        while (current.next !== null) {
            console.log("".concat(current.value));
            current = current.next;
        }
        console.log("".concat(current.value));
    };
    //insert at first
    LinkedList.prototype.InsertAtFirst = function (value) {
        var newNode = new ListNode(value, null);
        if (this.head === null) {
            this.head = newNode;
            return;
        }
        newNode.next = this.head;
        this.head = newNode;
    };
    LinkedList.prototype.InsertAt = function (position, value) {
        if (this.head === null) {
            console.log("your linkedlist is currenly empty so cannot add at index of : ".concat(position));
            return;
        }
        if (position === 0) {
            this.InsertAtFirst(value);
            return;
        }
        var newNode = new ListNode(value, null);
        var current = this.head;
        for (var i = 0; i < position - 1; i++) {
            if (current === null) {
                console.log("your psoition number cannot be reached since the linked list i to small than that");
                return;
            }
            current = current === null || current === void 0 ? void 0 : current.next;
        }
        if (current.next === null) {
            current.next = newNode;
            return;
        }
        else {
            newNode.next = current.next;
            current.next = newNode;
        }
    };
    LinkedList.prototype.DeleteAt = function (position) {
        var _a;
        if (this.head === null) {
            console.log("cannot delete at index ".concat(position, ", because the linked list is null"));
            return;
        }
        if (position === 0) {
            this.head = (_a = this.head) === null || _a === void 0 ? void 0 : _a.next;
        }
        var currentNode = this.head;
        for (var i = 0; i < position - 1; i++) {
            if (currentNode === null) {
                console.log("Linked list is out of bound , cannot reach position ".concat(position));
                return;
            }
            currentNode = currentNode.next;
        }
        var temp = currentNode.next;
        currentNode.next = temp.next;
    };
    return LinkedList;
}());
var linkedList = new LinkedList();
linkedList.insert(10);
linkedList.insert(6);
linkedList.insert(3);
linkedList.insert(9);
linkedList.insert(4);
linkedList.Display();
//deletting one
linkedList.DeleteAt(3);
console.log("linked list after deletion: ");
linkedList.Display();
linkedList.InsertAt(3, 18);
console.log("linked list after insertion on position 3");
linkedList.Display();
