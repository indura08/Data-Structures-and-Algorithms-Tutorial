using Data_Structures_and_Algorithms.Graph_Adjacency_List;
using Data_Structures_and_Algorithms.Graph_Adjecancy_Matrix;
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

            List<List<int>> mainList = new List<List<int>>();

            //add values
            for (int i = 0; i < n; i++)
            {
                List<int> currentList = new List<int>();
                currentList.Add(i);
                mainList.Add(currentList);
            }

            //add edges

            for (int j = 0; j < edges.GetLength(0); j++)
            {
                int dest = edges[j][1];
                mainList[edges[j][0]].Add(dest);

                int reverseDest = edges[j][0];
                mainList[edges[j][1]].Add(reverseDest);
            }

            //check path
            foreach (int number in mainList[source])
            {
                if (number == destination)
                {
                    return true;
                }
            }

            bool[] visited = new bool[n];
            Queue<int> queue = new Queue<int>();

            queue.Enqueue(source);
            visited[source] = true;

            while (queue.Count != 0)
            {
                int src = queue.Dequeue();

                foreach (int number in mainList[src].Skip(1))
                {
                    if(number == destination) return true;
                    if (!visited[number])
                    {
                        visited[number] = true;
                        queue.Enqueue(number);
                    }
                }
            }

            return false;
        }


    }
}
