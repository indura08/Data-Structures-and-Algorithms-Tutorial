package graphsSetEkecodes;
import java.util.*;

public class Graph {
    ArrayList<nodes> nodes;
    int[][] matrix;
    public Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(nodes node){
        nodes.add(node);
    }

    public void addEdge(int src , int dest){
        matrix[src][dest] = 1;
    }

    public boolean checkEdge(int src, int dest){
        if(matrix[src][dest] == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public void print(){
        System.out.print("   ");
        for(nodes node : nodes){
            System.out.print(node.data + "  ");
        }
        System.out.println("\t");
        //System.out.println(" ");
        // methna sout ekak enna one
        for(int i = 0 ; i < matrix.length; i++){
            System.out.print(nodes.get(i).data + "  " );

            for(int j = 0 ; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
