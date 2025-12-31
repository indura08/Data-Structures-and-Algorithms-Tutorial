//please note that javascript arrays already supports LIFO behavior for stacks
//which emans there are methods like array.pop(), and etc.
//and in this method i have created the logical implementation of stack data structure
var Stack = /** @class */ (function () {
    function Stack() {
        this.stackArray = [];
        this.top = 0;
    }
    //insert new value
    Stack.prototype.push = function (value) {
        this.stackArray[this.top] = value;
        this.top++;
    };
    Stack.prototype.pop = function () {
        if (this.isEmpty()) {
            console.log("Your stack is empty so cannot pop.");
            return;
        }
        this.stackArray[this.top] = 0;
        this.top--;
    };
    Stack.prototype.display = function () {
        for (var i = 0; i < this.top; i++) {
            console.log("stack element is : ".concat(this.stackArray[i]));
        }
    };
    Stack.prototype.isEmpty = function () {
        return this.stackArray.length === 0;
    };
    return Stack;
}());
var stack = new Stack();
stack.push(1);
stack.push(5);
stack.push(3);
stack.push(8);
stack.display();
stack.pop();
console.log("stack after pop");
stack.display();
