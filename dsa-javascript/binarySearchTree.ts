class TreeNode {

    data:number;
    right: TreeNode | null;
    left:TreeNode | null;

    constructor(data:number, rightNode:TreeNode | null, leftNode:TreeNode | null){
        this.data = data;
        this.right = rightNode,
        this.left = leftNode
    }
}

class BSTree {
    rootNode:TreeNode | null = null

    //insert data to the tree;
    Insert(value:number):void{

        const newNode = new TreeNode(value, null, null)

        //1. empty tree handle
        if(this.rootNode === null){
            this.rootNode = newNode;
            return;
        }

        //now travese the tree untill we find the correct place:
        let currentNode:TreeNode = this.rootNode;
        while(true){
            if(currentNode.data < value){
                if(currentNode.right === null){
                    currentNode.right = newNode;
                    return
                }
                currentNode = currentNode.right;
            }else {
                if(currentNode.left === null){
                    currentNode.left = newNode
                    return;
                }

                currentNode = currentNode.left
            }
            
        }
    }

    //treetraversal to display: In-order traversal
    Display(rootNode:TreeNode | null):void{
        if(rootNode === null) return;

        this.Display(rootNode.left);
        console.log(rootNode.data);
        this.Display(rootNode.right);
    }

    //search with travresal
    Search(rootNode:TreeNode | null,value:number):boolean{
        if(rootNode === null){
            return false;
        }

        if(rootNode.data === value){
            return true;
        }else if(rootNode.data > value){
            return this.Search(rootNode.left, value);
        }else{
            return this.Search(rootNode.right, value);
        }   
    }

    //Remove data from tree
    Remove(rootNode:TreeNode, value:number):void{
        //yet to implement
    }
}

const tree = new BSTree();
tree.Insert(10);
tree.Insert(5);
tree.Insert(15);
tree.Insert(3);
tree.Insert(7);
tree.Insert(13);
tree.Insert(20);


tree.Display(tree.rootNode);

console.log(`rootnodes left value is ${tree.rootNode?.left?.data}`)
console.log(`rootnodes right value is ${tree.rootNode?.right?.data}`)

if(tree.Search(tree.rootNode, 13)){
    console.log(`Node found`)
}else{
    console.log(`Node not found`)
}
