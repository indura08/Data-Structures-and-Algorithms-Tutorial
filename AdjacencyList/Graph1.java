package AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph1 {
    ArrayList<LinkedList<Node>> alist;

    Graph1(){
        alist = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> currentlist = new LinkedList<>();
        currentlist.add(node);
        alist.add(currentlist);
    }
    public void addEdge(int src, int dst){
        Node dstNode = alist.get(dst).get(0);
        alist.get(src).add(dstNode);
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<Node> checklist = alist.get(src);
        Node dstNode = alist.get(src).get(0);
        for(Node value : checklist){
            if(dstNode == value){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(LinkedList<Node> printList : alist){
            for(Node node : printList){
                System.out.print(node.data + "->");
            }
            System.out.println();
        }


    }
}
