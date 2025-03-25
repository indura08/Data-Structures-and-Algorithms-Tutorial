using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace Data_Structures_and_Algorithms.LeetCode_Problems_solutions.Graph_problems
{
    public class FindifPathExistsinGraph
    {
        public bool ValidPath(int n, int[][] edges, int source, int destination)
        {
            if(n == 1 && source == destination) return true;

            int[,] matrix = new int[n, n];

            //adding edges to a newly build graph
            for (int i = 0; i < edges.GetLength(0); i++)
            {
                matrix[edges[i][0], edges[i][1]] = 1;
                matrix[edges[i][1], edges[i][0]] = 1;
            }

            if (matrix[source, destination] == 1) return true;

            bool[] visited = new bool[n];
            Queue<int> queue = new Queue<int>();

            queue.Enqueue(source);
            visited[source] = true;

            while (queue.Count > 0)
            {
                source = queue.Dequeue();

                for(int j = 0; j < matrix.GetLength(0); j++)
                {
                    if (!visited[j] && matrix[source, j] == 1 && j == destination)
                    {
                        return true;
                    }
                    else if (!visited[j] && matrix[source, j] == 1)
                    {
                        queue.Enqueue(j);
                        visited[j] = true;
                    }
                }
            }

            return false;

            //22/24 test cases passe, loku test case ekaka out of memory error ekk awa eka hdnna one
        }


    }
}
