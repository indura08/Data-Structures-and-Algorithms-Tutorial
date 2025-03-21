﻿using Data_Structures_and_Algorithms.Binary_search_tree;
using Data_Structures_and_Algorithms.Graph_Adjacency_List;
using Data_Structures_and_Algorithms.Graph_Adjecancy_Matrix;
using Data_Structures_and_Algorithms.LeetCode_Problems_solutions._100_same_tree_problem;
using Data_Structures_and_Algorithms.LeetCode_Problems_solutions.Arrays_Problems;
using Data_Structures_and_Algorithms.Sorting_algortihms;
using System.Collections.Generic;

namespace Data_Structures_and_Algorithms
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arrayToBeSorted = {   738, 123, 987, 564, 321, 876, 432, 100, 765, 901,
                                        654, 345, 789, 234, 567, 890, 456, 678, 210, 890,
                                        112, 223, 334, 445, 556, 667, 778, 889, 990, 101,
                                        202, 303, 404, 505, 606, 707, 808, 909, 111, 222,
                                        333, 444, 555, 666, 777, 888, 999, 131, 242, 353,
                                        464, 575, 686, 797, 808, 919, 929, 939, 949, 959,
                                        969, 979, 989, 999, 111, 121, 131, 141, 151, 161,
                                        171, 181, 191, 201, 211, 221, 231, 241, 251, 261,
                                        271, 281, 291, 301, 311, 321, 331, 341, 351, 361,
                                        371, 381, 391, 401, 411, 421, 431, 441, 451, 461 };

            //BubbleSort.BubbleSortAlgorithm(arrayToBeSorted);
            //SelectionSort.SelectionSortAlgorithm(arrayToBeSorted);

            //InsertionSort.InsertionSortAlgorithm(arrayToBeSorted);

            //MergeSort.MergeSortAlgorithm(arrayToBeSorted);

            //QuickSort.QuickSortAlgorithm(arrayToBeSorted, 0, arrayToBeSorted.Length - 1);

            //for (int i = 0; i <= arrayToBeSorted.Length - 1; i++)
            //{
            //    Console.Write(arrayToBeSorted[i] + ", ");
            //}


            //adjacency matrix
            Graph graph1 = new Graph(5);

            graph1.AddNode(new Node('A'));
            graph1.AddNode(new Node('B'));
            graph1.AddNode(new Node('C'));
            graph1.AddNode(new Node('D'));
            graph1.AddNode(new Node('E'));

            //graph1.AddEdge(0, 1);
            //graph1.AddEdge(0, 2);
            //graph1.AddEdge(0, 3);
            //graph1.AddEdge(2, 3);
            //graph1.AddEdge(3, 1);
            //graph1.AddEdge(3, 2);
            //graph1.AddEdge(3, 0);
            //graph1.AddEdge(3, 3);

            graph1.AddEdge(0, 1);
            graph1.AddEdge(1, 2);
            graph1.AddEdge(1, 4);
            graph1.AddEdge(2, 3);
            graph1.AddEdge(2, 4);
            graph1.AddEdge(4, 0);
            graph1.AddEdge(4, 2);

            //graph1.PrintGraph();

            //Console.WriteLine();

            //graph1.DepthFirstsearch(0);
            
            //Console.WriteLine();
            
            //graph1.BreadthFirstSearch(0);


            //adjacency list
            ALGraph adjacencyListGraph = new ALGraph();

            adjacencyListGraph.AddNode(new ALNode('A')); //0
            adjacencyListGraph.AddNode(new ALNode('B')); //1
            adjacencyListGraph.AddNode(new ALNode('C')); //2
            adjacencyListGraph.AddNode(new ALNode('D')); //3
            adjacencyListGraph.AddNode(new ALNode('E')); //4
            


            adjacencyListGraph.AddEdge(0, 1);
            adjacencyListGraph.AddEdge(1, 2);
            adjacencyListGraph.AddEdge(1, 4);
            adjacencyListGraph.AddEdge(2, 3);
            adjacencyListGraph.AddEdge(2, 4);
            adjacencyListGraph.AddEdge(4, 0);
            adjacencyListGraph.AddEdge(4, 2);

            //adjacencyListGraph.PrintGraph();

            //Console.WriteLine();

            //adjacencyListGraph.DFSSearch(0);

            //adjacencyListGraph.BFSSearch(0);

            //tree creatiion

            BinarySearchTree tree1 = new BinarySearchTree();

            tree1.Insert(new BSTNode(10));
            tree1.Insert(new BSTNode(5));
            tree1.Insert(new BSTNode(15));
            tree1.Insert(new BSTNode(3));
            tree1.Insert(new BSTNode(7));
            tree1.Insert(new BSTNode(18));
            tree1.Insert(new BSTNode(11));

            //tree1.Remove(10);

            tree1.Display();
            Console.Write(tree1.Search(15));
            
            Console.WriteLine();
            tree1.DisplayInDescendingOrder();

            Console.WriteLine();

            Console.WriteLine($"Container with most water problem{Environment.NewLine}{new string('-', 32)}");

            ContainerWithMostWater obj1 = new ContainerWithMostWater();
            Console.WriteLine(obj1.MaxArea([8, 7, 2, 1]));

            Console.WriteLine();

            PlusOne.PlusOneMethod([9, 8, 7, 6, 5, 4, 3, 2, 1, 0]);



        }
    }
}
