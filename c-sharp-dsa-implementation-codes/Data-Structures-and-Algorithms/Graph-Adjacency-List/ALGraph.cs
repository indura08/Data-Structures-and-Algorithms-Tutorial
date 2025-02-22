using Data_Structures_and_Algorithms.Graph_Adjecancy_Matrix;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_Structures_and_Algorithms.Graph_Adjacency_List
{
    class ALGraph
    {
        List<LinkedList<ALNode>> mainList;

        public ALGraph()
        {
            mainList = new List<LinkedList<ALNode>>();
        }

        public void AddNode(ALNode node)
        {
            LinkedList<ALNode> currentList = new LinkedList<ALNode>();
            currentList.AddLast(node);
            mainList.Add(currentList);
        }

        public void AddEdge(int src, int dst)
        {
            ALNode dstNode = mainList[dst].First!.Value;
            mainList[src].AddLast(dstNode);
        }

        public Boolean CheckEdge(int src, int dst)
        {
            LinkedList<ALNode> currentList = mainList[src];
            ALNode dstNode = mainList[dst].First!.Value;

            foreach (ALNode node in currentList)
            {
                if (node == dstNode)
                {
                    return true;
                }
            }

            return false;
        }

        public void PrintGraph()
        {
            foreach (LinkedList<ALNode> list in mainList)
            {
                foreach (ALNode node in list)
                {
                    Console.Write(node.data + " --> ");
                }

                Console.WriteLine();
            }
        }

        public void DFSSearch(int src)
        {
            Boolean[] visited = new Boolean[mainList.Count];
            dfsHelper(src, visited);
        }

        public void dfsHelper(int src, Boolean[] visited) //this has 0(n^2) time complexity :/ , try ot find bettr performance algorithm next time
        {
            if (visited[src]) return;
            else
            {
                visited[src] = true;
                Console.WriteLine(mainList[src].First!.Value.data + " = visited");
            }

            for(int i = 0; i < mainList[src].Count; i++)
            {
                if (mainList[src].Skip(i).FirstOrDefault() != null)
                {
                    for (int j = 0; j < mainList.Count; j++)
                    {
                        if (mainList[j].First!.Value.data == mainList[src].Skip(i).FirstOrDefault()!.data)
                        {
                            dfsHelper(j, visited);
                        }
                    }
                }
            }
        }

    }
}
