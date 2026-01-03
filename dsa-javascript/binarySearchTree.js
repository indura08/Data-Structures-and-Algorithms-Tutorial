var _a, _b, _c, _d;
var TreeNode = /** @class */ (function () {
    function TreeNode(data, rightNode, leftNode) {
        this.data = data;
        this.right = rightNode,
            this.left = leftNode;
    }
    return TreeNode;
}());
var BSTree = /** @class */ (function () {
    function BSTree() {
        this.rootNode = null;
    }
    //insert data to the tree;
    BSTree.prototype.Insert = function (value) {
        var newNode = new TreeNode(value, null, null);
        //1. empty tree handle
        if (this.rootNode === null) {
            this.rootNode = newNode;
            return;
        }
        //now travese the tree untill we find the correct place:
        var currentNode = this.rootNode;
        while (true) {
            if (currentNode.data < value) {
                if (currentNode.right === null) {
                    currentNode.right = newNode;
                    return;
                }
                currentNode = currentNode.right;
            }
            else {
                if (currentNode.left === null) {
                    currentNode.left = newNode;
                    return;
                }
                currentNode = currentNode.left;
            }
        }
    };
    //treetraversal to display: In-order traversal
    BSTree.prototype.Display = function (rootNode) {
        if (rootNode === null)
            return;
        this.Display(rootNode.left);
        console.log(rootNode.data);
        this.Display(rootNode.right);
    };
    //search with travresal
    BSTree.prototype.Search = function (rootNode, value) {
        if (rootNode === null) {
            return false;
        }
        if (rootNode.data === value) {
            return true;
        }
        else if (rootNode.data > value) {
            return this.Search(rootNode.left, value);
        }
        else {
            return this.Search(rootNode.right, value);
        }
    };
    return BSTree;
}());
var tree = new BSTree();
tree.Insert(10);
tree.Insert(5);
tree.Insert(15);
tree.Insert(3);
tree.Insert(7);
tree.Insert(13);
tree.Insert(20);
tree.Display(tree.rootNode);
console.log("rootnodes left value is ".concat((_b = (_a = tree.rootNode) === null || _a === void 0 ? void 0 : _a.left) === null || _b === void 0 ? void 0 : _b.data));
console.log("rootnodes right value is ".concat((_d = (_c = tree.rootNode) === null || _c === void 0 ? void 0 : _c.right) === null || _d === void 0 ? void 0 : _d.data));
if (tree.Search(tree.rootNode, 13)) {
    console.log("Node found");
}
else {
    console.log("Node not found");
}
