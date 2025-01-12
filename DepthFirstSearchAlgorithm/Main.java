package DepthFirstSearchAlgorithm;

public class Main {
    public static void main(String[] args) {

        Graph2 graph = new Graph2(4);

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
        //graph.dfsSearch(2);

        graph.dfsSearch(2);
    }
}

// meka galapenne directed graph walat withri
