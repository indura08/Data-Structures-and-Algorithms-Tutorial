package AdjacencyList;

import graphsSetEkecodes.Graph;

public class Main {
    public static void main(String[] args) {

        Graph1 graph = new Graph1();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(2,3);
        graph.addEdge(4,1);
        graph.addEdge(4,0);

        graph.print();
    }
}
