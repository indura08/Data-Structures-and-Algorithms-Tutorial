package BreadthFirstSearchAlgorithm;

public class Main {
    public static void main(String[] args) {
        Graph3 graph = new Graph3(4);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));

        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(3,0);

        graph.Print();

        graph.breadthfirstSearch(0);

    }
}
