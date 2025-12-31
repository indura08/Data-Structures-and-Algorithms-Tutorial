//please note that javascript arrays already supports LIFO behavior for stacks
//which emans there are methods like array.pop(), and etc.
//and in this method i have created the logical implementation of stack data structure

class Stack{
    stackArray:number[] = [];
    top:number = 0;

    //insert new value
    push(value:number):void{
        
        this.stackArray[this.top] = value;
        this.top++;
    }

    pop():void{
        if(this.isEmpty()){
            console.log(`Your stack is empty so cannot pop.`)
            return
        }
        this.stackArray[this.top] = 0;
        this.top--
    }

    display():void{
        for(let i = 0; i < this.top; i++){
            console.log(`stack element is : ${this.stackArray[i]}`);
        }
    }

    isEmpty():boolean{
        return this.stackArray.length === 0
    }

}

let stack = new Stack();

stack.push(1);
stack.push(5);
stack.push(3);
stack.push(8)
stack.display();

stack.pop()
console.log(`stack after pop`)
stack.display();
