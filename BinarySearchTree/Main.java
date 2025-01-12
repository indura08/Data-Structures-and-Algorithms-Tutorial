package BinarySearchTree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(30));
        tree.insert(new Node(25));
        tree.insert(new Node(40));
        tree.insert(new Node(33));
        tree.insert(new Node(29));
        tree.insert(new Node(59));
        tree.insert(new Node(12));

        System.out.println(tree.root.data); // root eke value eka
        System.out.println(tree.root.left.data); // root eke left eke data eka
        System.out.println(tree.root.left.left.data); // root eke left eke left eke data eka
        //System.out.println();
        
        tree.display();

        System.out.println(tree.search(32));

    }
}
