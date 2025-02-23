using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.Graph_Adjecancy_Matrix
{
    internal class Graph
    {
        List<Node> nodes;
        int[,] matrix;

        public Graph(int size)
        {
            nodes = new List<Node>();
            matrix = new int[size, size];
        }

        public void AddNode(Node node)
        {
            nodes.Add(node);
        }

        public void AddEdge(int src, int dst)
        {
            matrix[src, dst] = 1;
        }

        public void PrintGraph()
        {
            Console.Write("  ");
            foreach (Node node in nodes)
            {
                Console.Write(node.data);
            }

            Console.WriteLine();
            for (int i = 0; i < matrix.GetLength(0); i++)
            {
                Console.Write(nodes[i].data + " ");
                for (int j = 0; j < matrix.GetLength(1); j++)
                {
                    Console.Write(matrix[i, j]);
                }

                Console.WriteLine();
            }   //matrix.GetLength(0) kiynne raw eke size ekath , GetLength(1) means column eke size ekai , me c# wal ena widiya
        }

        //meka depth first search algorithm ekai, meka adjacancy list ekatath include krnna puluwane kat code eka ppoddk wenas wenwa
        public void DepthFirstsearch(int src)
        {
            Boolean[] visited = new Boolean[matrix.GetLength(0)];
            DfsHelper(src, visited);
        }

        public void DfsHelper(int src, Boolean[] visited)
        {
            if (visited[src]) return;

            else 
            {
                visited[src] = true;
                Console.WriteLine(nodes[src].data + " = visited");
            }
            for (int i = 0; i < matrix.GetLength(0); i++)
            {
                if (matrix[src, i] == 1)
                {
                    DfsHelper(i, visited);
                }
            }
            
        }

        public void BreadthFirstSearch(int src) 
        {
            Boolean[] visited = new Boolean[matrix.GetLength(0)];
            Queue<int> queue = new Queue<int>();

            queue.Enqueue(src);
            visited[src] = true;

            while (queue.Count != 0)
            {
                src = queue.Dequeue();
                Console.WriteLine(nodes[src].data + " = visited");

                for (int i = 0; i < matrix.GetLength(0); i++)
                {
                    if (!visited[i] && matrix[src, i] == 1)
                    {
                        queue.Enqueue(i);
                        visited[i] = true;
                    }
                }
            }

        }
    }
}