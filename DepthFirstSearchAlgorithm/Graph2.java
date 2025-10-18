package DepthFirstSearchAlgorithm;

import java.util.ArrayList;

public class Graph2 {

    int[][] matrix ;
    ArrayList<Node> nodes;

    Graph2(int size){
        matrix = new int[size][size];
        nodes = new ArrayList<>();
    }

    public void addNode(Node node){
        nodes.add(node);
    }
    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }
    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public void Print(){
        System.out.print("  ");
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();
        for(int i = 0 ; i < matrix.length ; i++){
            System.out.print(nodes.get(i).data + " ");

            for(int j = 0 ; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void dfsSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        dfsHelper(src , visited);
    }

    public void dfsHelper(int src, boolean[] visited){
        if(visited[src]){
            return;
        }
        else{
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }
         for(int i = 0 ; i < matrix[src].length; i++){
             if(matrix[src][i] == 1){
                 dfsHelper(i, visited);
             }
         }
         return;
    }


}
