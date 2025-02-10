using Data_Structures_and_Algorithms.Sorting_algortihms;
using System.Collections.Generic;

namespace Data_Structures_and_Algorithms
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arrayToBeSorted = { 9, 3, 1, 8, 6, 3, 5, 7, 4, 2 };

            BubbleSort.BubbleSortAlgorithm(arrayToBeSorted);

            for (int i = 0; i <= arrayToBeSorted.Length - 1; i++)
            {
                Console.Write(arrayToBeSorted[i] + ", ");
            }
            
        }
    }
}
