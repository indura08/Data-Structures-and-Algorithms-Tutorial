package graphsSetEkecodes;
public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph(4);

        graph.addNode(new nodes('A'));
        graph.addNode(new nodes('B'));
        graph.addNode(new nodes('C'));
        graph.addNode(new nodes('D'));

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(2,3);

        graph.print();

        System.out.println(graph.checkEdge(0,2));


    }
}
